package esberfes.markup.tags.text;


import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;
import esberfes.markup.tags.link.MUAnchorTarget;

public class MUText extends MUTagBase {

    private String text;
    private MUTextEffectType muTextEffectType;
    private MuTextHeadingType muTextHeadingType;
    private MUAnchorTarget muAnchorTarget;

    public MUText() {
        super(MUTagType.text);
        this.muTextEffectType = MUTextEffectType.normal;
        this.muTextHeadingType = MuTextHeadingType.normal;
    }

    public MUText(String text) {
        super(MUTagType.text);
        this.text = text;
        this.muTextEffectType = MUTextEffectType.normal;
        this.muTextHeadingType = MuTextHeadingType.normal;
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();

        builder.append(muTextHeadingType);
        builder.append(muTextEffectType);
        if(this.muAnchorTarget != null)
            builder.append(this.muAnchorTarget.render());
        builder.append(text);
        builder.append(muTextEffectType);

        return builder.toString();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MUText setMuTextEffectType(MUTextEffectType muTextEffectType) {
        this.muTextEffectType = muTextEffectType;
        return this;
    }

    public MUTextEffectType getMuTextEffectType() {
        return muTextEffectType;
    }

    public MuTextHeadingType getMuTextHeadingType() {
        return muTextHeadingType;
    }

    public MUText setMuTextHeadingType(MuTextHeadingType muTextHeadingType) {
        this.muTextHeadingType = muTextHeadingType;
        return this;
    }

    public MUAnchorTarget getMuAnchorTarget() {
        return muAnchorTarget;
    }

    public MUText setMuAnchorTarget(MUAnchorTarget muAnchorTarget) {
        this.muAnchorTarget = muAnchorTarget;
        return this;
    }
}
