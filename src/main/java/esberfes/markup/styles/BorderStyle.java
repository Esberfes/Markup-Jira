package esberfes.markup.styles;

public class BorderStyle implements Styler{

    private BorderStyleType borderStyleType;

    public BorderStyle(BorderStyleType borderStyleType) {
        this.borderStyleType = borderStyleType;
    }

    @Override
    public String render() {
        return "borderStyle=" + this.borderStyleType;
    }

    public BorderStyleType getBorderStyleType() {
        return borderStyleType;
    }

    public void setBorderStyleType(BorderStyleType borderStyleType) {
        this.borderStyleType = borderStyleType;
    }
}
