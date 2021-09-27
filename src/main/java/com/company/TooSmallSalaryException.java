package com.company;
// Исключения должны иметь поле, в котором хранится значение,
// которое привело к исключению (некорректная зп или имя).

 public class TooSmallSalaryException extends Exception{

     private double salary;

    TooSmallSalaryException(double salary) {
        this.salary = salary;
    }

     @Override
     public String getMessage() {
         return "Размер зарплаты меньше 0 : " + salary;
     }


 }
