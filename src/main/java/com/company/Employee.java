package com.company;

public class Employee {

    private final int id;
    private static int ID=1;
    String firstName;
    String lastName;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", last_name='" + lastName + '\'' +
                ", first_name='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String firstName, String lastName, double salary)
            throws ImpossibleNameException, TooSmallSalaryException {

       try {
            Validator.validateName(firstName);
        } catch (ImpossibleNameException e) {
           //Возбуждаем ImpossibleNameException из конструктора Employee
            throw new ImpossibleNameException(firstName);
        }
        try {
            Validator.validateName(lastName);
        } catch (ImpossibleNameException e) {
            //Возбуждаем ImpossibleNameException из конструктора Employee
            throw new ImpossibleNameException(lastName);
        }
        try {
            Validator.validateSalary(salary);
        } catch (TooSmallSalaryException e) {
            //Возбуждаем TooSmallSalaryException из конструктора Employee
            throw new TooSmallSalaryException(salary);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = ID++;
    }

}