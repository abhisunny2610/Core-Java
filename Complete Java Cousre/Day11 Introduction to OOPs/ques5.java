/* Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows */

class Employee {
    String name;
    int yoj;
    int salary;
    String address;

}

public class ques5 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.name = "Abhishek";
        a.yoj = 2010;
        a.salary = 750000;
        a.address = "Jaipur";

        Employee b = new Employee();
        b.name = "Surendra";
        b.yoj = 2012;
        b.salary = 200654;
        b.address = "Ajmer";

        Employee c = new Employee();
        c.name = "Harendra";
        c.yoj = 2015;
        c.salary = 670875;
        c.address = "Agra";

        System.out.println("Name" + "\t" + "Joining Year" + "\t" + "Salary" + "\t" + "Address");
        System.out.println(a.name + "\t" + a.yoj + "\t" + a.salary + "\t" + a.address);
        System.out.println(b.name + "\t" + b.yoj + "\t" + b.salary + "\t" + b.address);
        System.out.println(c.name + "\t" + c.yoj + "\t" + c.salary + "\t" + c.address);
    }
}
