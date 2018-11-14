package java.org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {

    private Person person;

    @Before
    public void before() {
        person = new Person("Denis", "Camacho", 21);
    }

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
}
