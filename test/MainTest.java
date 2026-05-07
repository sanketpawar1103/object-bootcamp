import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {
    @Test
    void firstTest() {
        Main mockedMain = mock(Main.class);
        doNothing().when(mockedMain).greet();
        mockedMain.greet();

        verify(mockedMain, new Times(1)).greet();

        assertEquals(1, 1);
    }
}