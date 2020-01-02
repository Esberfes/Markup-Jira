package esberfes.markup.tags.base;

public interface Renderizable {
    String render();
    void setParent(MUTagBase parent);
    MUTagType getType();
    MUTagBase addNode(MUTagBase node);
}
