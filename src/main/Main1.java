package main;

import javax.jms.MessageConsumer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by satyam on 12.05.2017.
 */
public class Main1 {

    public static void main(String[] args) {

        try {
//            ServerSocket serverSocket = new ServerSocket(5556);
//            Socket socket = serverSocket.accept();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//            String msg = null;
//            while((msg = bufferedReader.readLine())!=null) {
//                System.out.println(msg);

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyMessageConsumer myMessageConsumer =
                new MyMessageConsumer();

        myMessageConsumer.receiveMessage();

/*    } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }}

//        new Thread(() -> {
//            MyMessageConsumer myMessageConsumer = new MyMessageConsumer();
//            myMessageConsumer.receiveMessage();
//        }).start();
//
//        new Thread(() -> {
//            MyMessageProvider myMessageProvider = new MyMessageProvider();
//            myMessageProvider.sendMessage("Hello :)");
//        }).start();




