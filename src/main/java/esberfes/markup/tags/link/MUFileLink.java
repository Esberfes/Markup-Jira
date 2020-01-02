package esberfes.markup.tags.link;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUFileLink extends MUTagBase {

    private String uri;

    public MUFileLink() {
        super(MUTagType.fileLink);
    }

    public MUFileLink(String uri) {
        super(MUTagType.fileLink);
        this.uri = uri;
    }

    @Override
    public String render() {
        return "[file:///" + uri + "]";
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
