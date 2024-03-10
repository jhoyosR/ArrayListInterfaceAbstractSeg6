package employeeEj1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Main Menu");
            System.out.println("0. Add Employee");
            System.out.println("1. Employee information");
            System.out.println("2. Modify employee's salary");
            System.out.println("3. Calculate employee's age");
            System.out.println("4. Calculate employee's seniority");
            System.out.println("5. Calculate employee's benefits");
            System.out.println("6. Modify Employee");
            System.out.println("7. Exit Menu");

            System.out.println("Option: ");
            option = scanner.nextInt();

            switch (option){
                case 0:
                    System.out.println("Employee's name:");
                    String name = scanner.next();
                    System.out.println("Employee's last name:");
                    String lastName = scanner.next();
                    System.out.println("Employee's gender:");
                    String gender = scanner.next();
                    System.out.println("Employee's birth year:");
                    int birthYear = scanner.nextInt();
                    System.out.println("Employee's hiring year:");
                    int hiringYear = scanner.nextInt();
                    System.out.println("Employee's base salary");
                    int baseSalary = scanner.nextInt();

                    Employee employeeToAdd = new Employee(name, lastName, gender, birthYear, hiringYear, baseSalary);
                    dao.save(employeeToAdd);
                    System.out.println("Employee added successfully");
                    break;
                case 1:
                    if (dao.employees.isEmpty()){
                        System.out.println("No employees available at the moment");
                    } else {
                        dao.showEmployees();
                    }
                    break;
                case 2:
                    System.out.println("To which employee would you like to change the salary?");
                    String employeesSalaryToChange = scanner.next();
                    System.out.println("Enter the new Salary for the employee");
                    int newSalary = scanner.nextInt();
                    System.out.println(dao.modifySalary(employeesSalaryToChange, newSalary));
                    break;
                case 3:
                    System.out.println("To which employee would you like to calculate the age?");
                    String employeesAgeToCalculate = scanner.next();
                    System.out.println(dao.calculateEmployeesAge(employeesAgeToCalculate));
                    break;
                case 4:
                    System.out.println("To which employee would you like to calculate the seniority?");
                    String employeesSeniorityToCalculate = scanner.next();
                    System.out.println(dao.calculateEmployeesSeniority(employeesSeniorityToCalculate));
                    break;
                case 5:
                    System.out.println("To which employee would you like to calculate the benefits?");
                    String employeesBenefitsToCalculate = scanner.next();
                    System.out.println(dao.calculateEmployeesBenefits(employeesBenefitsToCalculate));
                    break;
                case 6:
                    System.out.println("Which employee would you like to modify? ");
                    String employeeToModify = scanner.next();
                    System.out.println("Enter the new name for the employee: ");
                    String newName = scanner.next();
                    System.out.println("Enter the new last name for the employee: ");
                    String newLastName = scanner.next();
                    System.out.println("Enter the new gender for the employee: ");
                    String newGender = scanner.next();
                    System.out.println("Enter the new birth year for the employee: ");
                    int newBirthYear = scanner.nextInt();
                    System.out.println("Enter the new hiring year for the employee: ");
                    int newHiringYear = scanner.nextInt();
                    System.out.println("Enter the new base salary for the employee: ");
                    int newBaseSalary = scanner.nextInt();
                    System.out.println(dao.modifyEmployee(employeeToModify, newName, newLastName, newGender, newBirthYear, newHiringYear, newBaseSalary));
                    break;
                case 7:
                    System.out.println("Closing the software..");
                    break;
                default:
                    System.out.println("Invalid Option, please try again");
            }
        } while (option != 7);

    }
}