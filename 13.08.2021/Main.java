import java.io.*;
import java.net.*;
import java.util.Scanner;
import static Main.checkProxy;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("D:\\Програмирование\\Уроки\\text.txt");
            int c;
            String ip = "";
            String port = "";
            String proxy = "";
            while ((c = reader.read()) != -1) {
                if (c == 13) continue;
                else if (c == 10) {
                    ip = proxy.split(":")[0];
                    port = proxy.split(":")[1];
                    /*proxy = "";
                    String finalIp = ip;
                    String finalPort = port;
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String result = checkProxy(finalIp, Integer.parseInt(finalPort));
                            if(result.equals("error"))
                                System.out.println(finalIp+" не работает");
                            else {
                                System.out.println(finalIp+ " работает");
                            }
                        }
                    });
                    thread.start();

                }*/

                    //Способ 1

                    /*MyThread thread = new MyThread();
                    proxy = "";
                    thread.finalIp = ip;
                    thread.finalPort = port;
                    thread.start();
                }*/

                    // Способ 2

                    /*Thread thread = new Thread(new MyRunnableClass(port,ip));
                    proxy = "";
                    thread.start();
                }*/

                else if (c != 9) {
                    proxy += (char) c;
                } else {
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String checkProxy(String ip, int port) {
        HttpURLConnection connection = null;
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            connection = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            return "error";
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}

class MyThread extends Thread {
    String result;
    String finalPort;
    String finalIp;

    @Override
    public void run() {
        result = checkProxy(finalIp, Integer.parseInt(finalPort));
        if (result.equals("error"))
            System.out.println(finalIp + " не работает");
        else {
            System.out.println(finalIp + " работает");
        }
    }
}

class MyRunnableClass implements Runnable {
    String result;
    String finalPort;
    String finalIp;

    public MyRunnableClass(String finalPort, String finalIp) {
        this.finalPort = finalPort;
        this.finalIp = finalIp;
    }


    @Override
    public void run() {
        result = checkProxy(finalIp, Integer.parseInt(finalPort));
        if (result.equals("error"))
            System.out.println(finalIp + " не работает");
        else {
            System.out.println(finalIp + " работает");
        }
    }
}
