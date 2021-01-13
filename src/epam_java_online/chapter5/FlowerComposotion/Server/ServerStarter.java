package epam_java_online.chapter5.FlowerComposotion.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStarter {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();

        System.out.println("Клиент подсоединился");

    }

}
