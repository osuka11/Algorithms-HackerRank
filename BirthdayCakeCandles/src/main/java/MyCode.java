package main.java;

import java.util.Collections;
import java.util.List;

public class MyCode {

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int theHighest = candles.get(candles.size()-1);
        return (int) candles.stream().filter(it-> it == theHighest).count();
    }
}
