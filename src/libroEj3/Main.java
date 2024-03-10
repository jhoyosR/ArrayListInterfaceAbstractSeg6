package libroEj3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InstituteDAO dao = new InstituteDAO();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Main Menu");
            System.out.println("0. Exit Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Add Professor");
            System.out.println("4. Display Elements");

            System.out.println("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter book's title: ");
                    String bookTitle = scanner.next();
                    System.out.println("Enter book's author: ");
                    String bookAuthor = scanner.next();
                    System.out.println("Enter book's pages: ");
                    int bookPages = scanner.nextInt();

                    Book bookToAdd = new Book(bookTitle, bookAuthor, bookPages);
                    dao.addItem(bookToAdd);
                    System.out.println("Book " + bookToAdd.getInfo() + " added successfully");
                    break;
                case 2:
                    System.out.println("Enter Student's name");
                    String studentName = scanner.next();
                    System.out.println("Enter Student's course: ");
                    String studentCourse = scanner.next();
                    System.out.println("Enter Student's age: ");
                    int studentAge = scanner.nextInt();

                    Student studentToAdd = new Student(studentName, studentAge, studentCourse);
                    dao.addItem(studentToAdd);
                    System.out.println("Student " + studentToAdd.getInfo() + " added successfully");
                    break;
                case 3:
                    System.out.println("Enter Professor's name: ");
                    String professorName = scanner.next();
                    System.out.println("Enter Professor's subject: ");
                    String professorSubject = scanner.next();
                    System.out.println("Enter Professor's age: ");
                    int professorAge = scanner.nextInt();

                    Professor professorToAdd = new Professor(professorName, professorAge, professorSubject);
                    dao.addItem(professorToAdd);
                    System.out.println("Professor " + professorToAdd.getInfo() + " added successfully");
                    break;
                case 4:
                    if (dao.elements.isEmpty()) {
                        System.out.println("No elements available at the moment");
                    } else {
                        dao.displayElements();
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
