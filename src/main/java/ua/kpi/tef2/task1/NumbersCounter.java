package ua.kpi.tef2.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersCounter {

    public Map<Integer, Integer> countQuantityOfNumbers(List<Integer> list) {
        final Map<Integer, Integer> result = new HashMap<>();

        list.forEach( i -> {
            if (result.containsKey(i)) {
                result.compute(i, (k, v) -> v += 1);
            } else {
                result.put(i, 1);
            }
        });


        return result;
    }
}
