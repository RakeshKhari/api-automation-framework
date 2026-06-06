package utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CsvDataProvider {

    public static Object[][] readCsv(String fileName) throws Exception {

        List<Object[]> data = new ArrayList<>();

        InputStream is = CsvDataProvider.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (is == null) {
            throw new RuntimeException("File not found: " + fileName);
        }

        BufferedReader br = new BufferedReader(
                new InputStreamReader(is)
        );

        String line;
        boolean header = true;

        while ((line = br.readLine()) != null) {

            if (header) {
                header = false;
                continue;
            }

            String[] values = line.split(",");

            data.add(new Object[]{
                    values[0].trim(),
                    values[1].trim()
            });
        }

        br.close();

        return data.toArray(new Object[0][]);
    }
}