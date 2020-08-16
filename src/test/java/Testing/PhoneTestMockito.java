package Testing;

import junit.framework.TestCase;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PhoneTestMockito extends TestCase {

    Phone phone = Mockito.mock(Phone.class);
    public void testDoubleCapacity() {
        when(phone.doubleCapacity()).thenReturn(64);
        assertEquals(64,phone.doubleCapacity());
        verify(phone).doubleCapacity();
    }
}