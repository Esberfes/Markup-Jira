package esberfes.markup.tags.base;

import esberfes.markup.styles.Styler;
import esberfes.markup.styles.StylesCollection;

import java.util.ArrayList;
import java.util.List;

public abstract class MUTagBase implements Renderizable {

    protected MUTagBase parent;
    protected List<MUTagBase> nodes;
    protected MUTagType type;
    protected StylesCollection stylesCollection;

    public MUTagBase(MUTagType type) {
        this.nodes = new ArrayList<>();
        this.type = type;
        this.stylesCollection = new StylesCollection();
    }

    public List<MUTagBase> getNodes() {
        return nodes;
    }

    public void setNodes(List<MUTagBase> nodes) {
        this.nodes = nodes;
    }

    @Override
    public MUTagBase addNode(MUTagBase node) {
        node.setParent(this);
        this.nodes.add(node);
        return this;
    }

    public String renderNodes() {
        StringBuilder builder = new StringBuilder();

        for(MUTagBase node : this.nodes) {
            builder.append(node.render());
        }

        return builder.toString();
    }

    public MUTagBase getParent() {
        return parent;
    }

    @Override
    public void setParent(MUTagBase parent) {
        this.parent = parent;
    }

    @Override
    public MUTagType getType() {
        return type;
    }

    public void setType(MUTagType type) {
        this.type = type;
    }

    public MUTagBase addStyle(Styler styler) {
        stylesCollection.add(styler);
        return this;
    }

    public StylesCollection getStylesCollection() {
        return stylesCollection;
    }

    public void setStylesCollection(StylesCollection stylesCollection) {
        this.stylesCollection = stylesCollection;
    }
}
