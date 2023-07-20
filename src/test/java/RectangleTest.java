import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    Void Rectangle_test1(){
        var Rec1= new Rectangle(3,4);
        assertEquals(12,Rec1.Area_Rectangle());

    }

    @Test
    Void Rectangle_test2(){
        var Rec2= new Rectangle(100,50);
        assertEquals(5000,Rec2.Area_Rectangle());

    }

    @Test
    Void Rectangle_test3(){
        var Rec3= new Rectangle(0,4);
        assertEquals(0,Rec3.Area_Rectangle());


    }

    @Test
    Void Rectangle_test4(){
        var Rec4= new Rectangle(-2,5);
        assertThrows(IllegalAccessException.class,
                () ->{
            Rec4.Area_Rectangle(-2,5);
                });

    }


    @Test
    Void Rectangle_test5(){
        var Rec5= new Rectangle(-7,-3);
        assertThrows(IllegalAccessException.class,
                () ->{
                    Rec5.Area_Rectangle(-7,-3);
                });

    }

    @Test
    Void Rectangle_test6(){
        var Rec6= new Rectangle(1,-3);
        assertThrows(IllegalAccessException.class,
                () ->{
                    Rec6.Area_Rectangle(1,-3);
                });

    }

}