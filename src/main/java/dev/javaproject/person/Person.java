package dev.javaproject.person;

import java.time.Year;

public class Person {

     private String firstName;
    private String lastName;
    private String documentNumber;
    private int birthYear;
    private int age;

    public Person(String firstName, String lastName, String documentNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.birthYear = birthYear;
    }

    public void calculateAge() {
        this.age = Year.now().getValue() - this.birthYear;
    }

    public String getfirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDocumentNumber() { return documentNumber; }
    public int getBirthYear() { return birthYear; }
    public int getAge() { return age; }
}