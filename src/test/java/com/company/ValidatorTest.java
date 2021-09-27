package com.company;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ValidatorTest {

    private String name;
    private int salary;

    // Метод проверки зарплаты не бросает исключение если запрлата положительная
    @Test
    public void shouldDoesNotTooSmallSalaryExceptionFromValidateSalary() {
        salary = 1000;
        Assertions.assertDoesNotThrow(() -> Validator.validateSalary(salary));
    }

    // Метод проверки зарплаты бросает исключение если зарплата отрицательная
    @Test
    public void shouldTooSmallSalaryExceptionFromValidateSalary() {
        salary = -1000;
        Assertions.assertThrows(TooSmallSalaryException.class, () -> Validator.validateSalary(salary));
    }

    //Метод проверки имени/фамилии не бросает исключение если входное значение содержит только символы английского алфавита
    @Test
    public void shouldDoesNotImpossibleNameExceptionFromValidateName() {
        name = "Ivan";
        Assertions.assertDoesNotThrow(() -> Validator.validateName(name));
    }

    // Метод проверки имени/фамилии бросает исключение если входное значение содержит символы кроме английского алфавита
    @Test
    public void shouldImpossibleNameExceptionFromValidateName() {
        name = "Иван";
        Assertions.assertThrows(ImpossibleNameException.class, () -> Validator.validateName(name));
    }

    // Метод проверки имени/фамилии бросает исключение если входное значение пустая строка
    @Test
    public void shouldNullPointerExceptionFromValidateNameBecaseNot() {
        name = "";
        Assertions.assertThrows(NullPointerException.class, () -> Validator.validateName(name));
    }

// Метод проверки имени/фамилии бросает исключение если входное значение null
@Test
    public void shouldNullPointerExceptionFromValidateNameBecaseNull() {
        name = null;
        Assertions.assertThrows(NullPointerException.class, () -> Validator.validateName(name));
}

}
