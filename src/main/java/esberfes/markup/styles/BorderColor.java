package esberfes.markup.styles;

import esberfes.markup.utils.ColorUtils;

import java.awt.*;

public class BorderColor implements Styler {

    private Color color;

    public BorderColor(Color color) {
        this.color = color;
    }

    @Override
    public String render() {
        return "borderColor=" + ColorUtils.colorToHex(this.color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
