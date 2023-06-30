public class Singleton {
    // Create a Singleton instance at class loading time
    private static final Singleton singletonInstance = new Singleton();

    // Private constructor to prevent instantiating this class
    private Singleton() {
    }

    public static Singleton getInstance() {
        return singletonInstance;
    }

    // Add a sample method
    public void logMessage(String message) {
        System.out.println("Singleton says: " + message);
    }
}
