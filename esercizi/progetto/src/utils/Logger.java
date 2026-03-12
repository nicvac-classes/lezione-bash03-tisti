package utils;

import java.io.FileWriter;
import java.time.LocalDateTime;

public class Logger {
    private String filename;

    public Logger(String filename) {
        this.filename = filename;
    }

    public void info(String message) {
        write("INFO", message);
    }

    public void error(String message) {
        write("ERROR", message);
    }

    private void write(String level, String message) {
        // TODO: implementare scrittura su file
        System.out.println("[" + level + "] " + message);
    }
}
