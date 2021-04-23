package sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class WeatherClient {

    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 8081); // clientul se conecteaza la Server la acest ip si port
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in)) {

            String greeting = inputStream.readUTF(); // citim greeting-ul
            System.out.println(greeting);

            while (true) {
                String cityName = scanner.nextLine(); // citim de la tastatura un nume de oras
                outputStream.writeUTF(cityName); // apoi il scriem in outputStream ca sa il citeasca serverul
                outputStream.flush(); // folosim flush in caz ca raman date in bufferul din ObjectOutputStream
                if(cityName.equals("STOP")) {
                    break;
                }
                WeatherStat weatherStat = (WeatherStat) inputStream.readObject(); // citim obiectul trimis de Server
                System.out.println(weatherStat);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
