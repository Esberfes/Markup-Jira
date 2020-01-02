package esberfes;

import esberfes.markup.styles.*;
import esberfes.markup.tags.base.MUPage;
import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.link.*;
import esberfes.markup.tags.list.MUList;
import esberfes.markup.tags.panel.MUPanel;
import esberfes.markup.tags.text.*;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

import static esberfes.markup.utils.FakerUtils.fakeDataListString;
import static esberfes.markup.utils.FakerUtils.fakeNestedTable;

public class App {
    public static void main(String[] args) {
        MUTagBase muPage = new MUPage()
                .addNode(new MUText("Main title")
                        .setMuTextHeadingType(MuTextHeadingType.h1)
                        .setMuAnchorTarget(new MUAnchorTarget("goToTitle"))
                )
                .addNode(new MUSeparator())
                .addNode(fakeNestedTable(true))
                .addNode(new MUSeparator())
                .addNode(new MUList(fakeDataListString(ThreadLocalRandom.current().nextInt(6, 12))))
                .addNode(new MUSeparator())
                .addNode(new MUPanel()
                        .addStyle(new BGColor(Color.CYAN))
                        .addStyle(new BorderColor(Color.gray))
                        .addStyle(new BorderStyle(BorderStyleType.dotted))
                        .addStyle(new BorderWidth(3))
                        .addStyle(new Title("Header Tittle"))
                        .addStyle(new TitleBGColor(Color.lightGray))
                        .addNode(new MUText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla commodo massa nec purus sodales, id rutrum lacus condimentum. Praesent felis massa, cursus et pellentesque eu, bibendum in est. Aliquam maximus dictum interdum. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ornare nunc nulla, eget congue mauris egestas iaculis. Maecenas vel ante ut tellus luctus vulputate vitae quis sapien. Proin non euismod felis, eu pulvinar ante")
                                .setMuTextHeadingType(MuTextHeadingType.h3)
                                .setMuTextEffectType(MUTextEffectType.italic)
                        )
                        .addNode(new MUBreakLine())
                        .addNode(new MUAnchorLink("goToTitle"))
                        .addNode(new MUSeparator())
                        .addNode(new MUHyperLink("Google", "https://google.com"))
                        .addNode(new MUBreakLine())
                        .addNode(new MUEmailLink("fakeEmail@gmail.com"))
                        .addNode(new MUBreakLine())
                );

        String result = muPage.render();
        System.out.println(result);
    }
}
