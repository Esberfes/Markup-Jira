package esberfes.markup.tags.link;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUHyperLink extends MUTagBase {

    private String label;
    private String uri;

    public MUHyperLink() {
        super(MUTagType.hyperLink);
    }

    public MUHyperLink(String label, String uri) {
        super(MUTagType.hyperLink);
        this.label = label;
        this.uri = uri;
    }

    @Override
    public String render() {
        return "[" + this.label + "|" + this.uri + "]";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
