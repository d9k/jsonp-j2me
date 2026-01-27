package ru.d9k;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileHelpers {
    public static String DEFAULT_ENCODING = "UTF-8";

    /**
     * <a href="https://stackoverflow.com/questions/739691/reading-text-file-in-j2me/739744#739744">Reading text file in J2ME / StackOverflow</a>
     *
     */
    public static String readFromFile(String filename, String enc) throws Exception {
        String content = "";
        InputStream inputStream = FileHelpers.class.getResourceAsStream(filename);
        Reader in = new InputStreamReader(inputStream, enc);
        StringBuffer temp = new StringBuffer(1024);
        char[] buffer = new char[1024];
        int read;
        while ((read = in.read(buffer, 0, buffer.length)) != -1) {
            temp.append(buffer, 0, read);
        }
        content = temp.toString();
        return content;
    }


    public static String readFromFile(String filename) throws Exception {
        return readFromFile(filename, DEFAULT_ENCODING);
    }
}
