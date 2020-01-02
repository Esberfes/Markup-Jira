package esberfes.markup.styles;

public class BorderWidth implements Styler {

    private int width;

    public BorderWidth(int width) {
        this.width = width;
    }

    @Override
    public String render() {
        return "borderWidth=" + this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
