package esberfes.markup.tags.table;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUTableRow extends MUTagBase {

    public MUTableRow() {
        super(MUTagType.tableRow);
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        builder.append(renderNodes());
        builder.append("\r\n");

        return builder.toString();
    }
}
