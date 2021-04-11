package Main;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            String ip = null;
            BufferedReader br = new BufferedReader(new FileReader("D:\\Програмирование\\Уроки\\text.txt"));
            while ((ip = br.readLine()) != null) {
                String[] IP = ip.split("\t");

                System.out.printf("IP: %s Port: %s\n", IP);
            }

        } catch (IOException e) {
            System.out.println("IO error!" + e);
        }
    }
}
