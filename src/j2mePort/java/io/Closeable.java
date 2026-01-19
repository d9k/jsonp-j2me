package j2mePort.java.io;
import java.io.IOException;

public interface Closeable extends AutoCloseable {
    void close() throws IOException;
}
