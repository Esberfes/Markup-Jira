package esberfes.markup.tags.text;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUSeparator extends MUTagBase {

    public MUSeparator() {
        super(MUTagType.separator);
    }

    @Override
    public String render() {
        return "\r\n----\r\n";
    }
}
