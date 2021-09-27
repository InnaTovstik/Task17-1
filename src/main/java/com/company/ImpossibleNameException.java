package com.company;

// Исключения должны иметь поле, в котором хранится значение,
// которое привело к исключению (некорректная зп или имя).

public class ImpossibleNameException extends Exception {

    private String name;

    ImpossibleNameException(String name) {
       this.name = name;
    }

    @Override
    public String getMessage() {
        return "Имя введено не латинским алфавитом : " + name;
    }

}
