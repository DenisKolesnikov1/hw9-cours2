package pro.sky.streamapi.model;

import java.util.Objects;
import java.util.UUID;

public class Employee {

    private String id;
    private String name;
    private int department;
    private Integer salary;

    public Employee(String name, int department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }




    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return id + " - " + name + " из " + department + " отдела. зп составила " + salary + "рублей.";
    }
}
