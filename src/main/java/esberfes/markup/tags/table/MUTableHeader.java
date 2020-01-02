package esberfes.markup.tags.table;


import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUTableHeader extends MUTagBase {
    boolean isFirst;

    public MUTableHeader(MUTagBase content, boolean isFirst) {
        super(MUTagType.tableHeader);
        this.isFirst = isFirst;
        addNode(content);
    }

    public MUTableHeader() {
        super(MUTagType.tableHeader);
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        if(isFirst)
            builder.append("||");
        else
            builder.append("|");

        builder.append(renderNodes());

        builder.append("|");

        return builder.toString();
    }
}