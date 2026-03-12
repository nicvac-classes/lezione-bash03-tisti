package main;

import utils.Logger;
import java.net.ServerSocket;

public class Server {
    private int port = 8080;
    // TODO: aggiungere gestione connessioni multiple

    public void start() {
        Logger logger = new Logger("server.log");
        logger.info("Server avviato sulla porta " + port);
        // TODO: implementare protocollo HTTP
        System.out.println("Server in ascolto...");
    }
}
