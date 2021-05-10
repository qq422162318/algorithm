package java多线程.bio_nio;

import lombok.extern.slf4j.Slf4j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.Callable;

@Slf4j
public class ServerHandler implements Runnable {
    private Socket socket;

    ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader buffer = null;
        PrintStream print = null;
        try {
            buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            print = new PrintStream(socket.getOutputStream(), true);
            String expression;
            String result;
            while (true) {
                if ((expression = buffer.readLine()) == null) break;
                System.out.println("服务端收到信息" + expression);
                result = Calculator.cal(expression);
                print.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getLocalizedMessage());
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (print != null) print.close();
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
