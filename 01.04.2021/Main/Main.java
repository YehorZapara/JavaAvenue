import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel marriott = new Hotel(new Room[]
                {
                        new Room(2, true, true, false, false, 11),
                        new Room(2, true, true, false, false, 12),
                        new Room(3, true, true, true, false, 13),
                        new Room(3, true, true, true, true, 21),
                        new Room(4, true, true, false, false, 22),
                        new Room(2, false, false, false, false, 23),
                        new Room(2, false, true, false, false, 31),
                        new Room(1, false, true, true, true, 32),
                        new Room(1, true, true, true, true, 41)
   
        while (true){
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            { if (command.equals("eat")) {
                    marriott.getRoomsWithEat();
                } else if (command.equals("freeRooms")) {
                    marriott.getFreeRooms();
                }
            }
            if (command.equals("shower")){
                marriott.getRoomsWithShower();
            }else  if (command.equals("freeRooms")){
                marriott.getFreeRooms();
            }
            if (command.equals("toilet")){
                marriott.getRoomsWithToilet();
            }else  if (command.equals("freeRooms")){
                marriott.getFreeRooms();
            }
            if (command.equals("wifi")){
                marriott.getRoomsWithWiFi();
            }else  if (command.equals("freeRooms")){
                marriott.getFreeRooms();
            }
        }
                  
