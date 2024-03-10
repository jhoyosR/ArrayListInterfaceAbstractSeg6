package employeeEj1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeDAO extends EmployeeAbs{
    public ArrayList<Employee> employees;

    EmployeeDAO(){
        employees = new ArrayList<>();
    }


    @Override
    public void save(Employee employee) {
            employees.add(employee);
    }

    @Override
    public String modifySalary(String name, int newSalary) {
            for (Employee employee : employees){
                if (employee.getName().equals(name)){
                    employee.setBaseSalary(newSalary);
                    return "The new Salary of " + name + " has been modify";
                }

            }
            return "Employee named " + name + " not found";
    }

    @Override
    public String calculateEmployeesAge(String name) {
        for (Employee employee : employees){
            if (employee.getName().equals(name)){
                return 2024 - employee.getBirthYear()  + " years old is your employee " + name;
            }
        }
        return "Employee named " + name + " not found";
    }

    @Override
    public String calculateEmployeesSeniority(String name) {
        for (Employee employee : employees){
            if (employee.getName().equals(name)){
                return 2024 - employee.getHiringYear()  + " years is the seniority of " + name;
            }
        }
        return "Employee named " + name + " not found";
    }

    @Override
    public String calculateEmployeesBenefits(String name) {
        for (Employee employee : employees){
            if (employee.getName().equals(name)){
                return ((2024 - employee.getHiringYear())* employee.getBaseSalary()/12)  + " are the benefits of your employee " + name;
            }
        }
        return "Employee named " + name + " not found";
    }

    @Override
    public String modifyEmployee(String name, String newName, String newLastName, String newGender, int newBirthYear, int newHiringYear, int newBaseSalary) {
        for (Employee employee : employees){
            if (employee.getName().equals(name)){
                employee.setName(newName);
                employee.setLastName(newLastName);
                employee.setGender(newGender);
                employee.setBirthYear(newBirthYear);
                employee.setHiringYear(newHiringYear);
                employee.setBaseSalary(newBaseSalary);
                return "Employee modified successfully";
            }
        }
        return "Employee named " + name + " not found";
    }

    @Override
    public void showEmployees() {
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}