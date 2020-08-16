package Testing;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneTest {

    Phone phone = new Phone();

    @Test
    public void testDoubleCapacity() {
        phone.setCapacity(32);
        assertEquals(64,phone.doubleCapacity());
    }
}