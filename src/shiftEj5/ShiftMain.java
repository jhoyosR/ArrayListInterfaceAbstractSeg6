package shiftEj5;

import java.util.Scanner;

public class ShiftMain {
    public static void main(String[] args) {
        ShiftDAO dao = new ShiftDAO();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Main Menu");
            System.out.println("0. Exit Menu");
            System.out.println("1. Add Shift");
            System.out.println("2. Show Programmed Shifts");

            System.out.println("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the shift's start time ");
                    String shiftStartTime = scanner.next();
                    System.out.println("Enter the shift's end time ");
                    String shiftEndTime = scanner.next();
                    System.out.println("Enter the shift's description ");
                    String shiftDescription = scanner.next();

                    Shift shiftToAdd = new Shift(shiftStartTime, shiftEndTime, shiftDescription);
                    dao.save(shiftToAdd);
                    System.out.println("Shift created successfully");
                    break;
                case 2:
                    if (dao.shifts.isEmpty()) {
                        System.out.println("No shifts available at the moment");
                    } else {
                        System.out.println("Shifts assigned: ");
                        dao.showShifts();
                    }
                    break;
                case 0:
                    System.out.println("Closing Software...");
                    break;
                default:
                    System.out.println("Invalid Option, please try again");
            }
        } while (option != 0);
    }
}