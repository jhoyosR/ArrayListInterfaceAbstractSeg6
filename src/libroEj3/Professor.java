package libroEj3;

public class Professor {
    private String name;
    private int age;
    private String subject;

    public Professor(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getInfo() {
        return "Professor: " + name + ", " + age + " years old, teaching " + subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
