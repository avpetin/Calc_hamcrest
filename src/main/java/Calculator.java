import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    Consumer<Integer> println = System.out::println;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) ->  {
        if(y != 0) return x / y;
        return Integer.MAX_VALUE;
    };


    BinaryOperator<Integer> pow = (x, y) -> {
        for(int i = 0; i < y - 1; i++) {
            x *= x;
        }
        return x;
    };
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
}