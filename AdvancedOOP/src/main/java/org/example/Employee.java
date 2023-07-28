package org.example;

public class Employee {
    // name, department, shift
    private String name;
    private Department department;
    private Shift shift;

    // default employee
    public Employee() {
        this.name = "Nameless Amazon Associate";
        this.department = Department.OUTBOUND;
        this.shift = Shift.FLEX;
    }

    public Employee(String name) {
        this.name = name;
        this.department = Department.OUTBOUND;
        this.shift = Shift.FLEX;
    }

    public Employee(String name, Department department, Shift shift) {
        this.name = name;
        this.department = department;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", shift=" + shift +
                '}';
    }
}
