package esberfes.markup.tags.list;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

import java.util.ArrayList;
import java.util.List;

public class MUList extends MUTagBase {

   private List<MUTagBase> data;

    public MUList() {
        super(MUTagType.list);
        this.nodes = new ArrayList<>();
    }

    public MUList(List<MUTagBase> data) {
        super(MUTagType.list);
        for(MUTagBase node : data) {
            addNode(node);
        }
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        for(MUTagBase node : nodes) {
            builder.append("- ");
            builder.append(node.render());
            builder.append("\r\n");
        }

        return builder.toString();
    }

    public List<MUTagBase> getData() {
        return data;
    }

    public void setData(List<MUTagBase> data) {
        this.data = data;
    }
}
