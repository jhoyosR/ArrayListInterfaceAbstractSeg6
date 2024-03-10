package moviesEj6;

import java.util.Scanner;

public class OnlineStoreMain {
    public static void main(String[] args) {
        OnlineStoreDAO store = new OnlineStoreDAO();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Main Menu");
            System.out.println("0. Exit Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Add Movie");
            System.out.println("3. Record Book Sale");
            System.out.println("4. Record Movie Sale");
            System.out.println("5. Show Store Inventory");
            System.out.println("6. Show Store Sales");

            System.out.println("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the book's title ");
                    String bookTitle = scanner.next();
                    System.out.println("Enter the book's author ");
                    String bookAuthor = scanner.next();
                    System.out.println("Enter the book's price");
                    double bookPrice = scanner.nextDouble();

                    Book bookToAdd = new Book(bookTitle, bookAuthor, bookPrice);
                    store.addItem(bookToAdd);
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    System.out.println("Enter the movie's title ");
                    String movieTitle = scanner.next();
                    System.out.println("Enter the movie's star ");
                    String movieStar = scanner.next();
                    System.out.println("Enter the movie's director ");
                    String movieDirector = scanner.next();
                    System.out.println("Enter the movie's price");
                    double moviePrice = scanner.nextDouble();

                    Movie movieToAdd = new Movie(movieTitle, movieStar, movieDirector, moviePrice);
                    store.addItem(movieToAdd);
                    System.out.println("Movie added successfully");
                    break;
                case 3:
                    System.out.println("Enter the book's title to sell ");
                    String bookSaleTitle = scanner.next();
                    System.out.println("Enter the book's author to sell");
                    String bookSaleAuthor = scanner.next();
                    System.out.println("Enter the book's price to sell");
                    double bookSalePrice = scanner.nextDouble();

                    Book bookToSell = new Book(bookSaleTitle, bookSaleAuthor, bookSalePrice);
                    store.recordSale(bookToSell);
                    System.out.println("Book sale recorded");
                    break;
                case 4:
                    System.out.println("Enter the movie's title to sell");
                    String movieSaleTitle = scanner.next();
                    System.out.println("Enter the movie's star to sell");
                    String movieSaleStar = scanner.next();
                    System.out.println("Enter the movie's director to sell");
                    String movieSaleDirector = scanner.next();
                    System.out.println("Enter the book's price to sell");
                    double movieSalePrice = scanner.nextDouble();

                    Movie movieToSell = new Movie(movieSaleTitle, movieSaleStar, movieSaleDirector, movieSalePrice);
                    store.recordSale(movieToSell);
                    System.out.println("Movie sale recorded");
                    break;
                case 5:
                    if (store.inventory.isEmpty()) {
                        System.out.println("No items available at the moment");
                    } else {
                        store.displayInventory();
                    }
                    break;
                case 6:
                    store.displayTotalSales();
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
