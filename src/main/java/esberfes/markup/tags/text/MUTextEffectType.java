package esberfes.markup.tags.text;

public enum MUTextEffectType {
    normal(""), bold("*"), italic("_"), underline("+");

    public final String label;

    MUTextEffectType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
