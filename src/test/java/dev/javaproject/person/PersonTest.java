package dev.javaproject.person;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Year;

class PersonTest {
    @Test
    void constructorInitializesAttributes() {
        Person person = new Person("Ana", "Garcia", "12345678A", 1995);

        assertEquals("Ana", person.getName());
        assertEquals("Garcia", person.getLastName());
        assertEquals("12345678A", person.getDocumentNumber());
        assertEquals(1995, person.getBirthYear());
    }

    @Test
    void calculateAgeReturnsCorrectAge() {
        Person person = new Person("Carlos", "Lopez", "87654321B", 2000);
        int expectedAge = Year.now().getValue() - 2000;

        assertEquals(expectedAge, person.calculateAge());
    }

    @Test
    void calculateAgeWithRecentBirthYear() {
        Person person = new Person("Lucia", "Martin", "11111111C", 2010);
        int expectedAge = Year.now().getValue() - 2010;

        assertEquals(expectedAge, person.calculateAge());
    }
}

