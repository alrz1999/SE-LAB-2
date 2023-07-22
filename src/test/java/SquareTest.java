import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void positive_length_square_test1() {
        var square = new Square(3);
        assertEquals(9, square.computeArea());
    }

    @Test
    void positive_length_square_test2() {
        var square = new Square(100);
        assertEquals(10000, square.computeArea());
    }

    @Test
    void positive_length_square_test3() {
        var square = new Square(1);
        assertEquals(1, square.computeArea());
    }

    @Test
    void zero_length_square_test() {
        var square = new Square(0);
        assertEquals(0, square.computeArea());
    }

    @Test
    void negative_length_square_test1() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-2));
    }

    @Test
    void negative_length_square_test2() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-100));
    }

    @Test
    void get_length_square_test1() {
        var square = new Square(0);
        assertEquals(0, square.getLength());
    }

    @Test
    void set_length_square_test1() {
        var square = new Square(0);
        assertEquals(0, square.getLength());

        square.setLength(10);
        assertEquals(10, square.getLength());
    }
}
