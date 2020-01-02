package esberfes.markup.tags.link;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUAnchorTarget extends MUTagBase {

    private String anchorName;

    public MUAnchorTarget() {
        super(MUTagType.anchorTarget);
    }

    public MUAnchorTarget(String anchorName) {
        super(MUTagType.anchorTarget);
        this.anchorName = anchorName;
    }
    @Override
    public String render() {
        return "{anchor:" + this.anchorName + "}";
    }

    public String getAnchorName() {
        return anchorName;
    }

    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName;
    }
}
