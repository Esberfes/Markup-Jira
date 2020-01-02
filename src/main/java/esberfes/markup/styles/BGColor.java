package esberfes.markup.styles;

import esberfes.markup.utils.ColorUtils;

import java.awt.*;

public class BGColor implements Styler {

    private Color color;

    public BGColor(Color color) {
        this.color = color;
    }

    @Override
    public String render() {
        return "bgColor=" + ColorUtils.colorToHex(this.color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
