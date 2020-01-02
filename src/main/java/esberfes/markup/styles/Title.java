package esberfes.markup.styles;

public class Title implements Styler {

    private String title;

    public Title(String title) {
        this.title = title;
    }

    @Override
    public String render() {
        return "title=" + this.title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
