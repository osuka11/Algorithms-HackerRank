package main.java;

import java.util.*;

public class MyCode {

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0L;
        long maxSum = 0L;
        Collections.sort(arr);

        for (int i = arr.size()-2; i >= 0; i--){
            minSum += arr.get(i);
        }
        for (int i = 1; i< arr.size();i++){
            maxSum+=arr.get(i);
        }
        System.out.printf("%d %d",minSum,maxSum);
    }
}
