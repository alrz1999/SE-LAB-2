import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RectangleTest {
    @Test
    void Rectangle_test1(){
        var Rec1 = new Rectangle(3, 4);
        assertEquals(12, Rec1.computeArea());
    }

    @Test
    void Rectangle_test2(){
        var Rec2 = new Rectangle(100, 50);
        assertEquals(5000, Rec2.computeArea());
    }

    @Test
    void Rectangle_test3(){
        var Rec3 = new Rectangle(0, 4);
        assertEquals(0, Rec3.computeArea());
    }

    @Test
    void Rectangle_test4(){
        var Rec4 = new Rectangle(-2, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            Rec4.computeArea();
        });
    }

    @Test
    void Rectangle_test5(){
        var Rec5 = new Rectangle(-7, -3);
        assertThrows(IllegalArgumentException.class, () -> {
            Rec5.computeArea();
        });
    }

    @Test
    void Rectangle_test6(){
        var Rec6 = new Rectangle(1, -3);
        assertThrows(IllegalArgumentException.class, () -> {
            Rec6.computeArea();
        });
    }

}