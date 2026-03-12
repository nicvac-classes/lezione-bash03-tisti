package utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class Config {
    // TODO: implementare parsing del file di configurazione

    public static Config load(String path) {
        System.out.println("Caricamento configurazione da: " + path);
        return new Config();
    }
}
