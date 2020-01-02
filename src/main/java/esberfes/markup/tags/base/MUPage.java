package esberfes.markup.tags.base;

public class MUPage extends MUTagBase {

    public MUPage() {
        super(MUTagType.page);
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        for(MUTagBase node : nodes) {
            builder.append(node.render());
        }

        return builder.toString();
    }

    @Override
    public MUTagType getType() {
        return MUTagType.page;
    }
}
