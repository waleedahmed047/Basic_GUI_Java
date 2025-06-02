
package labpractice.javaframe;

import javax.swing.*;

public class Employee_Operation {
    String name;
    String email;
    int salary;

    public Employee_Operation(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "Name: "+name +"  Email: " + email+ "  Salary: " + salary ;
    }
   
    }
