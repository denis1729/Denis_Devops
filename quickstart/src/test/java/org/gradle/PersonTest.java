package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class PersonTest {

    private Person person;

    @Before
    public void before() {
        person = new Person("Denis", "Camacho", 21, "6526103", "male");
    }

    //positive
    @Test
    public void canConstructAPersonWithAName() {
        assertEquals("Denis", person.getName());
    }

    @Test
    public void canConstructAPersonWithALastName() {
        assertEquals("Camacho", person.getLastName());
    }

    @Test
    public void canConstructAPersonWithAAge() {
        assertEquals(21, person.getAge());
    }

    @Test
    public void canConstructAPersonWithAId() {
        assertEquals("6526103", person.getId());
    }

    @Test
    public void canConstructAPersonWithAGender() {
        assertEquals("male", person.getGender());
    }

    //negative
    @Test
    public void canConstructAPersonWithANameNegative() {
        assertFalse(person.getName().equals("Emma"));
    }

    @Test
    public void canConstructAPersonWithALastNameNegative() {
        assertFalse(person.getLastName().equals("Roman"));
    }

    @Test
    public void canConstructAPersonWithAAgeNegative() {
        assertFalse(person.getAge() == 22);
    }

    @Test
    public void canConstructAPersonWithAIdNegative() {
        assertFalse(person.getId().equals("6526104"));
    }

    @Test
    public void canConstructAPersonWithAGenderNegative() {
        assertFalse(person.getGender().equals("female"));
    }
}
