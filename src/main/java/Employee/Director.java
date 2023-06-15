package Employee;

public class Director extends Employee {

    public Director(String fio, String position, long phone, int salary, int age) {
        super(fio, position, phone, salary, age);
    }

    protected Director() {
    }

    public static boolean isDirector(String director) {
        return director.equals("Директор");
    }
}
