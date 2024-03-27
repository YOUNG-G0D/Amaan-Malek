class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String employeeId;
    double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

public class Program18_employee {
    public static void main(String[] args) {
        Person person1 = new Person("Amaan", 19);
        System.out.printf("Person: name=%s, age=%d\n", person1.name, person1.age);

        Employee employee1 = new Employee("Jane", 25, "E123", 5000);
        System.out.printf("Employee: name=%s, age=%d, employeeId=%s, salary=%.2f\n", employee1.name, employee1.age, employee1.employeeId, employee1.salary);
    }
}
