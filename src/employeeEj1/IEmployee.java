package employeeEj1;

public interface IEmployee {
    void save (Employee employee);

    public String modifySalary(String name, int newSalary);
    public String calculateEmployeesAge(String name);
    public String calculateEmployeesSeniority(String name);
    public String calculateEmployeesBenefits(String name);
    public String modifyEmployee(String name, String newName, String newLastName, String newGender, int newBirthYear, int newHiringYear, int newBaseSalary);
    public void showEmployees();
}
