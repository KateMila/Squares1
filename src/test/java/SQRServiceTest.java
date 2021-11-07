import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
        public void shouldsquares() {
        SQRService service = new SQRService();
        int numberfirst = 100;
        int numbertwo = 200;
        int expected = 10;
        int actual = service.squares(numberfirst,numbertwo);
        assertEquals(expected, actual);
    }
}
