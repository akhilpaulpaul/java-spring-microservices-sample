package PersonAddress;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testPersonData() {
        Address address = new Address("Wall Street", "Texas", 43455);
        Person person = new Person("Sam", 33, address);

        assertEquals("Sam", person.getName());
        assertEquals(33, person.getAge());
        assertNotNull(person.getAddress());
    }
}
