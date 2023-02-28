import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
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
        assertThat(result, equalTo(expected));
    }

    @Test
    public void testSubtraction(){
        //arrange
        int a = 14, b = 6, expected = 8;
        //act
        var result = sut.minus.apply(a, b);
        //assert
        assertThat(result, equalTo(expected));
    }

    @Test
    public void testMultiply(){
        //arrange
        int a = 7, b = 6, expected = 42;
        //act
        var result = sut.multiply.apply(a, b);
        //assert
        assertThat(result, equalTo(expected));
    }

    @Test
    public void testDivide(){
        //arrange
        int a = 24, b = 7, expected = 3;
        //act
        var result = sut.divide.apply(a, b);
        //assert
        assertThat(result, equalTo(expected));
    }

    @Test
    public void testDivideByZero(){
        //arrange
        int a = 24, b = 0;
        var result = ArithmeticException.class;
        //act
        Executable expected = ()->sut.divide.apply(a, b);
        //assert
        assertThat(result, typeCompatibleWith(expected.getClass()));
    }

}
