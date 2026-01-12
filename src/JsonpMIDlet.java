import jmunit.framework.cldc11.Test;
import jmunit.framework.cldc11.TestRunner;
import com.foo.Suite;

public class JsonpMIDlet extends TestRunner {

    private Test nestedTest;

    public JsonpMIDlet() {
//        super(3000);
        super(15000);
        this.nestedTest = new Suite();
    }

    protected Test getNestedTest() {
        return this.nestedTest;
    }

}
