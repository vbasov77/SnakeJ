package Employee;

public abstract class Employee {
    private String fio; //ФИО сотрудника
    private String position; // Должность сотрудника
    private long phone; // Телефон сотрудника
    private int salary; // Зарплата сотрудника
    private int age; // Возраст сотрудника

    public Employee(String fio, String position, long phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    protected Employee() {
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public long getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}
