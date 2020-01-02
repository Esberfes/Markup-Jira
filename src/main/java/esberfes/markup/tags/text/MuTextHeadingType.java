package esberfes.markup.tags.text;

public enum  MuTextHeadingType {

    normal(""), h1("h1. "), h2("h2. "), h3("h3. "), h4("h4. ");

    public final String label;

    MuTextHeadingType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
