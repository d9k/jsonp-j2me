package j2mePort;

public class Assert {
    public static boolean assertEnabled = true;

    public static void _assert(boolean condition, String message) {
        if (assertEnabled && !condition) {
            throw new AssertException(message);
        }
    }

//    public static void assert(boolean condition) {
//        if (assertEnabled && !condition) {
//            throw new AssertException();
//        }
//    }
}
