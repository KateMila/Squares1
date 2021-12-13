import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void shouldCalculateSquares() {
        SQRService service = new SQRService();
        int numberFirst = 99;
        int numberTwo = 200;
        int expected = 5;
        int actual = service.squares(numberFirst, numberTwo);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSquareRangeBounValues() {
        SQRService service = new SQRService();
        int numberFirst = 100;
        int numberTwo = 196;
        int expected = 5;
        int actual = service.squares(numberFirst, numberTwo);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSquareRangeValues () {
        SQRService service = new SQRService();
        int numberFirst = 50;
        int numberTwo = 200;
        int expected = 5;
        int actual = service.squares(numberFirst, numberTwo);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateSquareRangeEqualValues() {
        SQRService service = new SQRService();
        int numberFirst = 100;
        int numberTwo = 100;
        int expected = 5;
        int actual = service.squares(numberFirst, numberTwo);
        assertEquals(expected, actual);
    }

}
