package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;
import java.util.Map;


public class JsonUtils {

    public static Object[][] readJson(String fileName) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream is = JsonUtils.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        List<Map<String, String>> data =
                mapper.readValue(is,
                        new TypeReference<List<Map<String, String>>>() {});

        Object[][] result = new Object[data.size()][2];

        for (int i = 0; i < data.size(); i++) {
            result[i][0] = data.get(i).get("title");
            result[i][1] = data.get(i).get("body");
        }

        return result;
    }
}