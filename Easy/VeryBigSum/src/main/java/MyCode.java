package main.java;

import java.util.List;

public class MyCode {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0L;
        for (int i = 0; i<ar.size(); i++){
            sum += ar.get(i);
        }
        return sum;
    }
}
