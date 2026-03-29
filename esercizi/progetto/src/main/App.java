package main;

import utils.Logger;
import utils.Config;

public class App {
    private static final String VERSION = "2.0.0";

    public static void main(String[] args) {
        Logger logger = new Logger("app.log");
        Config config = Config.load("config/app.cfg");
        logger.info("Applicazione avviata - versione " + VERSION);
        // TODO: implementare menu principale
        System.out.println("Benvenuto nell'applicazione!");
    }
}
