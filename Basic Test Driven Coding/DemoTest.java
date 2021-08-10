import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {
    //main valid triangle
    @Test
    public void main() {
        String input = "20"+System.getProperty("line.separator")+"20"+System.getProperty("line.separator")+"30"+System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }
    @Test
    public void main1() {
        String input = "-2"+System.getProperty("line.separator")+"-2"+System.getProperty("line.separator")+"-3"+System.getProperty("line.separator");
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }
    // simple case
    @Test
    public void isNotTriangle(){
        assertFalse(Demo.isTriangle(3,4,8));
    }
    @Test
    public void isNotTriangle1(){
        assertFalse(Demo.isTriangle(8,4,3));
    }
    @Test
    public void isNotTriangle2(){
        assertFalse(Demo.isTriangle(3,8,4));
    }
    @Test
    public void isNotTriangle3(){
        assertFalse(Demo.isTriangle(3,8,14));
    }
    @Test
    public void isNotTriangle4(){
        assertFalse(Demo.isTriangle(1,1,0));
    }
    @Test
    public void isNotTriangle5(){
        assertFalse(Demo.isTriangle(0,0,0));
    }
    // sum of two equal to other
    @Test
    public void isTriangle1() {
        assertFalse(Demo.isTriangle(1,2,3));
    }
    @Test
    public void isTriangle2() {
        assertFalse(Demo.isTriangle(3,1,2));
    }
    @Test
    public void isTriangle3() {
        assertFalse(Demo.isTriangle(2,3,1));
    }

    //negative side
    @Test
    public void isTriangle21(){
        assertFalse(Demo.isTriangle(-1,4,2));
    }
    @Test
    public void isTriangle31(){
        assertFalse(Demo.isTriangle(2,-1,4));
    }
    @Test
    public void isTriangle41(){
        assertFalse(Demo.isTriangle(4,2,-1));
    }

    // three negative sides
    @Test
    public void neg2(){
        assertFalse(Demo.isTriangle(-2,-4,-7));
    }
    @Test
    public void neg21(){
        assertFalse(Demo.isTriangle(-7,-4,-2));
    }
    @Test
    public void neg22(){
        assertFalse(Demo.isTriangle(-2,-7,-4));
    }
    @Test
    public void neg23(){
        assertFalse(Demo.isTriangle(-2,-2,-2));
    }
    @Test
    public void neg24(){
        assertFalse(Demo.isTriangle(-20,-20,-30)); // isosceles triangle
    }
    @Test
    public void neg25(){
        assertFalse(Demo.isTriangle(-5,-12,-13));
    }
    // correct case
    @Test
    public void isCorrect(){
        assertTrue(Demo.isTriangle(5,12,13)); //right triangle
    }
    @Test
    public void isCorrect1(){
        assertTrue(Demo.isTriangle(4,3,2)); // scalene triangle
    }
    @Test
    public void isCorrect2(){
        assertTrue(Demo.isTriangle(20,20,20)); // equilateral triangle
    }
    @Test
    public void isCorrect3(){
        assertTrue(Demo.isTriangle(20,20,30)); // isosceles triangle
    }
}
