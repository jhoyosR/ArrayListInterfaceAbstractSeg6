package concesionarioEj4;

import java.util.Scanner;

public class ConcessionaireMain {
    public static void main(String[] args) {
        Concessionaire concessionaire = new Concessionaire("Daytona", "Calle 132B # 22");
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Welcome to " + concessionaire.getInfo() + ". What would you like to do today?");
            System.out.println("0. Exit Menu");
            System.out.println("1. Add Car");
            System.out.println("2. Delete Car");
            System.out.println("3. Sell Car");
            System.out.println("4. Show Concessionaire Cars");

            System.out.println("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the car's brand ");
                    String carBrand = scanner.next();
                    System.out.println("Enter the car's license plate ");
                    String carLicensePlate = scanner.next();

                    Car carToAdd = new Car(carBrand, carLicensePlate);
                    concessionaire.addCar(carToAdd);
                    System.out.println("Car added successfully to " + concessionaire.getInfo());
                    break;
                case 2:
                    System.out.println("Enter the license plate of the car you want to delete");
                    String carLicensePlateToDelete = scanner.next();
                    concessionaire.deleteCar(carLicensePlateToDelete);
                    System.out.println("Car deleted successfully from " + concessionaire.getInfo());
                    break;
                case 3:
                    System.out.println("Enter the license plate of the car you want to sell");
                    String carLicensePlateToSell = scanner.next();
                    concessionaire.sellCar(carLicensePlateToSell);
                    System.out.println("Car sold successfully from " + concessionaire.getInfo());
                    break;
                case 4:
                    if (concessionaire.cars.isEmpty()) {
                        System.out.println("No cars available at the moment");
                    } else {
                        concessionaire.showCars();
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