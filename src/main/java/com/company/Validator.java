package com.company;
//написать класс Validator, который будет использоваться внутри конструктора Empoyee.
//В классе Validator должны быть методы:
// 1.проверка что зарплата является положительным числом,
// иначе бросается TooSmallSalaryException
// 2.Проверка имени и фамилии - допустимы только символы английского алфавита,
// иначе бросается ImpossibleNameException

// Обрабатывать эти исключения нужно там, где создаются объекты Employee.
// Можно даже сделать метод createEmployee, который принимает отдельные значения и возвращает объект Employee

public class Validator extends Exception {

    // Метод проверяет имя и фамилию - допустимы только символы английского алфавита,
// иначе бросается ImpossibleNameException

    public static void validateName(String name) throws ImpossibleNameException, NullPointerException {
        if (!name.matches("^[a-zA-Z]*$")) {
            //Возбуждаем ImpossibleNameException из метода validateName()
            throw new ImpossibleNameException(name);
        } else if (name == "" || name == null){
            throw new NullPointerException(name);
            }
        }


    // Метод проверяет является ли зарплата является положительным числом,
    // иначе бросается TooSmallSalaryException
    public static void validateSalary(double salary) throws TooSmallSalaryException {

        if (salary < 0) {
            //Возбуждаем TooSmallSalaryException из метода validateSalary()
            throw new TooSmallSalaryException(salary);
        }

    }

}
