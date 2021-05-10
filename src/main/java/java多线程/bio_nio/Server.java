package java多线程.bio_nio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

@Slf4j
public class Server {
    private static int port = 7777;
    private static ServerSocket serverSocket;

    private static void start() throws IOException {
        start(port);
    }

    private static void start(int port) {
        if (serverSocket != null) return;
        try {
            serverSocket = new ServerSocket(port);
            Socket accept = serverSocket.accept();
            new Thread(new ServerHandler(accept)).start();
            log.info("port:" + port);
        } catch (Exception e) {
            e.printStackTrace();
            log.info(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        try {
            start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
