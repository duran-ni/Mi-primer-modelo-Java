package com.javaproject.person;

import java.time.Year;

public class Person {

    private String name;
    private String lastName;
    private String documentNumber;
    private int birthYear;

    public Person(String name, String lastName, String documentNumber, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.birthYear = birthYear;
    }

    public int calculateAge() {
        return Year.now().getValue() - this.birthYear;
    }

    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public String getDocumentNumber() { return documentNumber; }
    public int getBirthYear() { return birthYear; }
}