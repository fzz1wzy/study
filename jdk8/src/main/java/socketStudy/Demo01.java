package socketStudy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Demo01 {

    public void f1(){
        Socket socket = new Socket();
        socket.getLocalAddress();
        socket.getInetAddress();
        try {
            socket.getReuseAddress();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        socket.getLocalPort();

        try {
            ServerSocket serverSocket = new ServerSocket();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
