package esberfes.markup.tags.panel;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUPanel extends MUTagBase {

    public MUPanel() {
        super(MUTagType.panel);
    }

    public MUPanel(MUTagBase content) {
        super(MUTagType.panel);
        addNode(content);
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        builder.append("{panel" + stylesCollection.render() + "}");
        builder.append(renderNodes());
        builder.append("{panel}");

        return builder.toString();
    }
}
