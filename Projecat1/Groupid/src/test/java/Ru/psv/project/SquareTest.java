package Ru.psv.project;

import org.junit.Test;
import org.testng.Assert;


public class SquareTest {

    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }



}