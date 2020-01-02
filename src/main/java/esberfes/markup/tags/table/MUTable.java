package esberfes.markup.tags.table;


import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;
import esberfes.markup.tags.text.MUText;

import java.util.ArrayList;
import java.util.List;

public class MUTable extends MUTagBase {

    List<List<MUTagBase>> data;
    boolean withHeaders;

    public MUTable(List<List<MUTagBase>> data, boolean withHeaders) {
        super(MUTagType.table);
        this.data = data;
        this.withHeaders = withHeaders;
    }

    public MUTable(boolean withHeaders) {
        super(MUTagType.table);
        this.data = new ArrayList<>();
        this.withHeaders = withHeaders;
    }

    public void build() {
        List<List<MUTagBase>> dataCopy = new ArrayList<List<MUTagBase>>(data);

        if (withHeaders && data.size() > 0) {
            List<MUTagBase> headers = dataCopy.get(0);
            MUTableRow muTableRow = new MUTableRow();

            for (MUTagBase header : headers) {
                boolean isFirst = headers.indexOf(header) == 0;
                MUTableHeader muTableHeader = new MUTableHeader(header, isFirst);
                muTableRow.addNode(muTableHeader);
            }

            addNode(muTableRow);
            dataCopy.remove(headers);
        }

        for (List<MUTagBase> row : dataCopy) {
            MUTableRow muTableRow = new MUTableRow();
            for (MUTagBase cell : row) {
                boolean isFirst = row.indexOf(cell) == 0;
                MUTableCell muTableHeader = new MUTableCell(cell, isFirst);
                muTableRow.addNode(muTableHeader);
            }
            addNode(muTableRow);
        }

    }

    @Override
    public String render() {
        build();
        StringBuilder builder = new StringBuilder();

        if (parent.getType() == MUTagType.tableCell)
            builder.append("{panel}");

        builder.append(renderNodes());

        if (parent.getType() == MUTagType.tableCell)
            builder.append("{panel}");

        return builder.toString();
    }

    public List<List<MUTagBase>> getData() {
        return data;
    }

    public void setData(List<List<MUTagBase>> data) {
        this.data = data;
    }

    public static List<List<MUTagBase>> tableFromString(List<List<String>> data) {
        List<List<MUTagBase>> converted = new ArrayList<>();

        for (List<String> row : data) {
            List<MUTagBase> convertedRow = new ArrayList<>();
            for (String cell : row) {
                MUText muText = new MUText(cell);
                convertedRow.add(muText);
            }
            converted.add(convertedRow);
        }

        return converted;
    }
}