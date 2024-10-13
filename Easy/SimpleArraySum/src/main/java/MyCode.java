package main.java;

import java.util.List;

public class MyCode {
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer integer : ar) {
            sum += integer;
            System.out.println(sum);
        }
        return sum;
    }
}
