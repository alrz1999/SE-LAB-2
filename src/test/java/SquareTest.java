import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void square_test1() {
        var square = new Square(3);
        assertEquals(9, square.computeArea());
    }

    @Test
    void square_test2() {
        var square = new Square(100);
        assertEquals(10000, square.computeArea());
    }

    @Test
    void square_test3() {
        var square = new Square(1);
        assertThrows(IllegalArgumentException.class, () -> square.computeArea());
    }

    @Test
    void square_test4() {
        var square = new Square(0);
        assertEquals(0, square.computeArea());
    }

    @Test
    void square_test5() {
        var square = new Square(-2);
        assertThrows(IllegalArgumentException.class, () -> square.computeArea());
    }

    @Test
    void square_test6() {
        var square = new Square(-7);
        assertThrows(IllegalArgumentException.class, () -> square.computeArea());
    }
}
