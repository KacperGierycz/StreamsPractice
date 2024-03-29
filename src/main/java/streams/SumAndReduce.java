package streams;

import java.util.*;

public class SumAndReduce {

    public static int calculate(List<Integer> numbers) {
        return numbers.stream().reduce(0,(acumulator,number)->acumulator+number);
    }

    public static int calculate2(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

}