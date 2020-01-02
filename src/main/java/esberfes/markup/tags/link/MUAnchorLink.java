package esberfes.markup.tags.link;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUAnchorLink extends MUTagBase {

    private String anchorName;

    public MUAnchorLink() {
        super(MUTagType.anchorTarget);
    }

    public MUAnchorLink(String anchorName) {
        super(MUTagType.anchorLink);
        this.anchorName = anchorName;
    }

    @Override
    public String render() {
        return "[#" + anchorName + "]";
    }

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName;
    }
}
