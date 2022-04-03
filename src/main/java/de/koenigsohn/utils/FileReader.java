package de.koenigsohn.utils;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileReader {

    public static String readFileInputStream(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream("src/test/resources/" + fileName);
        return IOUtils.toString(fis, StandardCharsets.UTF_8);
    }
}
