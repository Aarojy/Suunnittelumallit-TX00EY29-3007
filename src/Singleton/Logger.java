package Singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String fileName;

    private Logger() {
        fileName = "log.txt";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
            return instance;
        } else {
            return instance;
        }
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        instance = null;
    }
}
