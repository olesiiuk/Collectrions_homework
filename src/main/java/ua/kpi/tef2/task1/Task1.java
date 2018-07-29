package ua.kpi.tef2.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class Task1 {
    public static void main(String[] args) {
        NumbersCounter numbersCounter = new NumbersCounter();
        List<Integer> list = Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7);

        Map<Integer, Integer> result = numbersCounter.countQuantityOfNumbers(list);

        result.forEach((key, value) -> System.out.println(String.format("Number %d is present %d times", key, value)));


    }
}
