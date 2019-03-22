package sample;

public final class DummyAPI {

    private DummyAPI() {
        throw new UnsupportedOperationException("This class should not be instantiated");
    }

    private final static long DELAY_IN_MILLIS = 1;

    public static boolean dummyMethod() {

        try {
            Thread.sleep(DELAY_IN_MILLIS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            //  no logging required here
        }

        return true;
    }
}
