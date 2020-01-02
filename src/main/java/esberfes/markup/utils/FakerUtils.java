package esberfes.markup.utils;

import esberfes.markup.tags.base.MUTagBase;
import esberfes.markup.tags.panel.MUPanel;
import esberfes.markup.tags.table.MUTable;
import esberfes.markup.tags.text.MUBreakLine;
import esberfes.markup.tags.text.MUText;
import esberfes.markup.tags.text.MUTextEffectType;
import esberfes.markup.tags.text.MuTextHeadingType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FakerUtils {

    public static List<MUTagBase> fakeDataListString(int columns) {
        List<MUTagBase> data = new ArrayList<>();

        for (int i = 0; i < columns + 1; i++) {
            MUText muText = new MUText(fakeString());
            muText.setMuTextEffectType(MUTextEffectType.italic);
            data.add(muText);
        }

        return data;
    }

    public static MUTable fakeNestedTable(boolean withHeaders) {
        List<List<MUTagBase>> mainData = new ArrayList<>();
        int columns = ThreadLocalRandom.current().nextInt(3, 6);
        int rows = ThreadLocalRandom.current().nextInt(2, 3);

        List<MUTagBase> headerRow = new ArrayList<>();
        for (int x = 0; x < columns; x++) {
            headerRow.add(new MUText(fakeString()));
        }
        mainData.add(headerRow);

        for (int y = 0; y < rows; y++) {
            List<MUTagBase> row = new ArrayList<>();
            for (int x = 0; x < columns; x++) {
                if (x + 1 == columns) {
                    MUTagBase muPanel = new MUPanel()
                            .addNode(new MUText(fakeString().toUpperCase()).setMuTextHeadingType(MuTextHeadingType.h3))
                            .addNode(new MUBreakLine())
                            .addNode(fakeStringTable(false));
                    row.add(muPanel);
                } else
                    row.add(new MUText(fakeString()));
            }
            mainData.add(row);
        }

        return new MUTable(mainData, withHeaders);
    }

    public static MUTable fakeStringTable(boolean withHeaders) {
        int columns = ThreadLocalRandom.current().nextInt(3, 4);
        return new MUTable(MUTable.tableFromString(fakeRawDataTable(columns)), withHeaders);
    }

    public static List<List<String>> fakeRawDataTable(int columns) {
        List<List<String>> data = new ArrayList<>();
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(8, 10); i++) {
            List<String> row = new ArrayList<>();
            for (int x = 0; x < columns; x++) {
                String fakeString = fakeString();
                row.add(fakeString);
            }
            data.add(row);
        }

        return data;
    }

    public static String fakeString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
