package esberfes.markup.styles;

import esberfes.markup.utils.ColorUtils;

import java.awt.*;

public class TitleBGColor implements Styler {

    private Color color;

    public TitleBGColor(Color color) {
        this.color = color;
    }

    @Override
    public String render() {
        return "titleBGColor=" + ColorUtils.colorToHex(this.color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
