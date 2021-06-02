package weatherserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MultiThreadedWeatherServer {

    private ServerSocket serverSocket;


    public static void main(String[] args) {
        MultiThreadedWeatherServer server = new MultiThreadedWeatherServer();
        server.start();
    }
    public void start() {
        try {
            serverSocket = new ServerSocket(8081);
            System.out.println("Server started, waiting for clients!");
            while (true) {
                new WeatherClientHandler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class WeatherClientHandler extends Thread {
        private Socket clientSocket;

        public WeatherClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
                 ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream())) {
                System.out.println("A client has connected to the server");

                outputStream.writeUTF("Welcome to the Weather Server. Please choose a city: Bucharest, Sofia, Athens, Berlin. Or write STOP to exit"); // greeting
                outputStream.flush(); //  folosim flush in caz ca raman date in bufferul din ObjectOutputStream

                Map<String, WeatherStat> weatherDb = new HashMap<>();
                buildWeatherInfo(weatherDb); // populam date despre vreme
                while (true) {
                    String choice = inputStream.readUTF(); // citim din input stream orasul scris de Client
                    System.out.println("Client's choice: " + choice);
                    if (choice.equals("Bucharest")) {
                        outputStream.writeObject(weatherDb.get("Bucharest")); // scriem un obiect in ObjectOutputStream
                    } else if (choice.equals("Sofia")) {
                        outputStream.writeObject(weatherDb.get("Sofia"));
                    } else if (choice.equals("Athens")) {
                        outputStream.writeObject(weatherDb.get("Athens"));
                    } else if (choice.equals("Berlin")) {
                        outputStream.writeObject(weatherDb.get("Berlin"));
                    } else if (choice.equals("STOP")) {
                        System.out.println("The client has stopped the app");
                        break;
                    } else {
                        outputStream.writeObject(new WeatherStat("Unknown", "Unknown"));
                    }
                    outputStream.flush();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    static void buildWeatherInfo(Map<String, WeatherStat> weatherDb) {
        WeatherStat bucharest = new WeatherStat("Bucharest", "16 degrees");
        WeatherStat sofia = new WeatherStat("Sofia", "14 degrees");
        WeatherStat athens = new WeatherStat("Athens", "20 degrees");
        WeatherStat berlin = new WeatherStat("Berlin", "12 degrees");

        weatherDb.put("Bucharest", bucharest);
        weatherDb.put("Sofia", sofia);
        weatherDb.put("Athens", athens);
        weatherDb.put("Berlin", berlin);
    }


}
