package esberfes.markup.tags.table;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUTableCell extends MUTagBase {

    boolean isFirst;

    public MUTableCell() {
        super(MUTagType.tableCell);
    }

    public MUTableCell(MUTagBase content, boolean isFirst) {
        super(MUTagType.tableCell);
        this.isFirst = isFirst;
        addNode(content);
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        if (isFirst)
            builder.append("|");

        builder.append(renderNodes());
        builder.append("|");

        return builder.toString();
    }

}


