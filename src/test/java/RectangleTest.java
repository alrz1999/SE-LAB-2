import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void computeArea_test1() {
        var rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.computeArea());
    }

    @Test
    void computeArea_test2() {
        var rectangle = new Rectangle(100, 50);
        assertEquals(5000, rectangle.computeArea());
    }

    @Test
    void computeArea_test3() {
        var rectangle = new Rectangle(0, 4);
        assertEquals(0, rectangle.computeArea());
    }

    @Test
    void negative_height_test1() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2, 5));
    }

    @Test
    void negative_width_test1() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, -3));
    }

    @Test
    void negative_height_and_width_test1() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-7, -3));
    }

    @Test
    void getHeight_test1() {
        var rectangle = new Rectangle(3, 4);
        assertEquals(3, rectangle.getHeight());
    }

    @Test
    void getWidth_test1() {
        var rectangle = new Rectangle(3, 4);
        assertEquals(4, rectangle.getWidth());
    }

    @Test
    void setHeight_test1() {
        var rectangle = new Rectangle(3, 4);
        assertEquals(3, rectangle.getHeight());

        rectangle.setHeight(1);
        assertEquals(1, rectangle.getHeight());
        assertEquals(4, rectangle.computeArea());
    }

    @Test
    void setWidth_test1() {
        var rectangle = new Rectangle(3, 4);
        assertEquals(4, rectangle.getWidth());

        rectangle.setWidth(5);
        assertEquals(5, rectangle.getWidth());
        assertEquals(15, rectangle.computeArea());
    }
}