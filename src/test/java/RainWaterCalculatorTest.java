import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class RainWaterCalculatorTest {

    @Test
    public void rainWaterCalculatorTest1(){
        int arraySize = 3;
        int[] testArray = new int[]{2, 0, 2};
        int expected = 2;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rainWaterCalculatorTest2(){
        int arraySize = 6;
        int[] testArray = new int[]{3, 0, 0, 2, 0, 4};
        int expected = 10;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rainWaterCalculatorTest3(){
        int arraySize = 6;
        int[] testArray = new int[]{6,9,9};
        int expected = 0;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rainWaterCalculatorTest4(){
        int arraySize = 6;
        int[] testArray = new int[]{7,4,0,9};
        int expected = 10;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rainWaterCalculatorTest5(){
        int arraySize = 6;
        int[] testArray = new int[]{7,4,0,9,0,8};
        int expected = 18;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rainWaterCalculatorTest6(){
        int arraySize = 6;
        int[] testArray = new int[]{7,4,0,9,0,8,2,4,2,6};
        int expected = 28;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void rainWaterCalculatorTest7(){
        int arraySize = 6;
        int[] testArray = new int[]{7,4,8,0,9,0,8};
        int expected = 19;
        int actual = RainWaterCalculator.calculate(arraySize, testArray);
        Assert.assertEquals(expected,actual);
    }
}
