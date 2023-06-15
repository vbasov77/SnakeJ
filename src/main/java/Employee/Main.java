package Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int prize = 5000;                                       // Премия
        System.out.println(generatorSalary(prize));
    }

    public static List<Employee> generatorSalary (int prize){
        System.out.println(employeesOfTheCompany());
        int count = employeesOfTheCompany().size();
        Director dir = new Director();
        List<Employee> emp = employeesOfTheCompany();
        for (int i = 0; i < count; i++) {
            if (!dir.isDirector(employeesOfTheCompany().get(i).getPosition())) {
                int salary = emp.get(i).getSalary() + prize;
                emp.get(i).setSalary(salary);
            }
        }
        return emp;
    }

    public static List<Employee> employeesOfTheCompany() {
        List<Employee> emp = new ArrayList<>();
        ItDeveloper emp1 = new ItDeveloper("Татьяна",
                "Разработчик PHP", 1234567891, 100000, 25);
        ItDeveloper emp2 = new ItDeveloper("Валентина",
                "Разработчик Java", 1234567891, 110000, 27);
        ItDeveloper emp3 = new ItDeveloper("Валентина",
                "Разработчик JS", 1234567891, 110000, 27);
        Director emp4 = new Director("Николай",
                "Директор", 1234567676, 200000, 35);
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        return emp;
    }


}
