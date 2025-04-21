interface Loggable {
    void logMessage(String message);

    default void logError(String errorMessage) {
        logMessage("ERROR: " + errorMessage);
    }
}

class FileLogger implements Loggable {
    public void logMessage(String message) {
        System.out.println("Writing to file: " + message); // simulate file write
    }
}

class ConsoleLogger implements Loggable {
    public void logMessage(String message) {
        System.out.println("Console: " + message);
    }
}
