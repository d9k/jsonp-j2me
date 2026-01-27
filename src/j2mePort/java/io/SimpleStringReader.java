package j2mePort.java.io;

import java.io.ByteArrayInputStream;

public class SimpleStringReader extends ByteArrayInputStream {
    public SimpleStringReader(String s) {
       super(s.getBytes());
    }
}
