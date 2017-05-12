package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by satyam on 12.05.2017.
 */
public class Main2 {

    public static void main(String[] args) {
        try {
        MyMessageProvider myMessageProvider =
                new MyMessageProvider();

       // myMessageProvider.sendMessage("Hello :)");

        ServerSocket serverSocket = new ServerSocket(5556);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg = null;
        while((msg = bufferedReader.readLine())!=null) {
              System.out.println(msg);}

            myMessageProvider.sendMessage(msg);

            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();}
            }
    }


