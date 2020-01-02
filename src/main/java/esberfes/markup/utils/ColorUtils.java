package esberfes.markup.utils;

import java.awt.*;

public class ColorUtils {
    public static String colorToHex(Color color) {
        String hex = Integer.toHexString(color.getRGB() & 0xffffff);
        while(hex.length() < 6){
            hex = "0" + hex;
        }
        hex = "#" + hex;
        return hex;
    }
}
