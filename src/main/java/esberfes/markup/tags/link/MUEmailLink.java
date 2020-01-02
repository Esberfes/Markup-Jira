package esberfes.markup.tags.link;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.base.MUTagType;

public class MUEmailLink extends MUTagBase {

    private String email;

    public MUEmailLink() {
        super(MUTagType.mailLink);
    }

    public MUEmailLink(String email) {
        super(MUTagType.mailLink);
        this.email = email;
    }

    @Override
    public String render() {
        return "[mailto:" + email + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
