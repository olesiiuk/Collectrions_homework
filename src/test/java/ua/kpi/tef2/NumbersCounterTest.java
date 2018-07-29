package ua.kpi.tef2;

import org.junit.Test;
import ua.kpi.tef2.task1.NumbersCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class NumbersCounterTest {

    @Test
    public void countQuantityOfNumbers() {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);


        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(-6, 1);
        expected.put(2, 1);
        expected.put(3, 1);
        expected.put(4, 4);
        expected.put(5, 3);
        expected.put(7, 1);

        NumbersCounter numbersCounter = new NumbersCounter();
        Map<Integer, Integer> result = numbersCounter.countQuantityOfNumbers(list);

        assertEquals(expected, result);


    }

}