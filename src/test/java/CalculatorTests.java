import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorTests {
    Calculator sut = new Calculator();

    @Test
    public void testAds() {
        //arrange
        int a = 5, b = 7, expected = 12;
        //act
        var result = sut.plus.apply(a, b);
        //assert
        assertThat(expected, equalTo(result));
    }

    @Test
    public void testSubtraction(){
        //arrange
        int a = 14, b = 6, expected = 8;
        //act
        var result = sut.minus.apply(a, b);
        //assert
        assertThat(expected, equalTo(result));
    }

    @Test
    public void testMultiply(){
        //arrange
        int a = 7, b = 6, expected = 42;
        //act
        var result = sut.multiply.apply(a, b);
        //assert
        assertThat(expected, equalTo(result));
    }

    @Test
    public void testDivide(){
        //arrange
        int a = 24, b = 7, expected = 3;
        //act
        var result = sut.divide.apply(a, b);
        //assert
        assertThat(expected, equalTo(result));
    }

    @Test
    public void testPow(){
        //arrange
        int a = 3, b = 2, expected = 9;
        //act
        var result = sut.pow.apply(a, b);
        //assert
        assertThat(expected, equalTo(result));
    }

    @Test
    public void testAbs(){
        //arrange
        int a = -3, expected = 3;
        //act
        var result = sut.abs.apply(a);
        //assert
        assertThat(expected, equalTo(result));
    }

    @Test
    public void isPositive(){
        //arrange
        int a = 4;
        boolean expected = true;
        //act
        var result = sut.isPositive.test(a);
        //assert
        assertThat(expected, equalTo(result));
    }
}
