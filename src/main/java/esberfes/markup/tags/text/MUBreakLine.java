package esberfes.markup.tags.text;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUBreakLine extends MUTagBase {

    public MUBreakLine() {
        super(MUTagType.breakLine);
    }

    @Override
    public String render() {
        return "\r\n";
    }
}
