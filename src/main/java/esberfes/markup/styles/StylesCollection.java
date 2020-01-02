package esberfes.markup.styles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StylesCollection {
    private List<Styler> stylers;

    public StylesCollection() {
        this.stylers = new ArrayList<>();
    }

    public StylesCollection add(Styler styler) {
        this.stylers.add(styler);
        return this;
    }

    public String render() {
        return stylers.size() > 0 ? ":" + stylers.stream().map(Styler::render)
                .collect(Collectors.joining("|")) : "";
    }

    public List<Styler> getStylers() {
        return stylers;
    }

    public void setStylers(List<Styler> stylers) {
        this.stylers = stylers;
    }
}
