package ru.d9k;

import java.io.InputStreamReader;
import java.io.Reader;

public class FileHelpers {
    /**
     * <a href="https://stackoverflow.com/questions/739691/reading-text-file-in-j2me/739744#739744">Reading text file in J2ME / StackOverflow</a>
     * */
    public String readFromFile(String filename, String enc) throws Exception {
        String content = "";
        Reader in = new
                InputStreamReader(this.getClass().getResourceAsStream(filename), enc);
        StringBuffer temp = new StringBuffer(1024);
        char[] buffer = new char[1024];
        int read;
        while ((read = in.read(buffer, 0, buffer.length)) != -1) {
            temp.append(buffer, 0, read);
        }
        content = temp.toString();
        return content;
    }
}
