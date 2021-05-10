package java多线程.bio_nio;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;

@Slf4j
public class Client {
    private static int port=7777;
    private static String host="127.0.0.1";
    public static void send(String express){
        BufferedReader buffer=null;
        PrintStream print=null;
        Socket socket = null;
        try {
             socket = new Socket(host,port);
            buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            print = new PrintStream(socket.getOutputStream());
            print.println(express);
            System.out.println("string:"+buffer.readLine() );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                buffer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            print.close();
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        String tt="1,+,45";
        send(tt);
    }
}
