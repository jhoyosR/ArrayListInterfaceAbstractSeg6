package employeeEj1;

public class Employee {
    private String name;
    private String lastName;
    private String gender;
    private int birthYear;
    private int hiringYear;
    private int baseSalary;

    public Employee(String name, String lastName, String gender, int birthYear, int hiringYear, int baseSalary) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.hiringYear = hiringYear;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public void setHiringYear(int hiringYear) {
        this.hiringYear = hiringYear;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthYear=" + birthYear +
                ", hiringYear=" + hiringYear +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
