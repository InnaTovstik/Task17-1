package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws ImpossibleNameException, TooSmallSalaryException, IOException {

        try {
            Employee employee = createEmployee("Иван", "Ivanenko", 100);
            System.out.println(employee);
        } catch (ImpossibleNameException | TooSmallSalaryException e) {
            e.printStackTrace();
            Employee employee = createEmployee();
            System.out.println(employee);
        }
    }

    public static Employee createEmployee(String firstName, String lastName, double salary)
            throws ImpossibleNameException, TooSmallSalaryException {

        return new Employee(firstName, lastName, salary);
    }

    public static Employee createEmployee()
            throws ImpossibleNameException, TooSmallSalaryException, NumberFormatException {

        System.out.println("Повторите введение данных");

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите firstName: ");
            String firstName = buffer.readLine();
            System.out.println("Введите lastName: ");
            String lastName = buffer.readLine();
            System.out.println("Введите salary: ");
            double salary = Double.parseDouble(buffer.readLine());
            System.out.println();
            return new Employee(firstName, lastName, salary);
        } catch (IOException | NumberFormatException | ImpossibleNameException | TooSmallSalaryException e) {
            e.printStackTrace();
        }
        return null;
    }
}