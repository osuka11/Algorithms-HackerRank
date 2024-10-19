package main.java;

import java.util.List;

public class MyCode {
    public static void plusMinus(List<Integer> arr) {
        float positives = 0.0f;
        float negatives = 0.0f;
        float zeros = 0.0f;

        for (int i = 0; i< arr.size();i++){
            if (arr.get(i) > 0){
                positives++;
            }if (arr.get(i) < 0 ){
                negatives++;
            }if (arr.get(i) == 0){
                zeros++;
            }
        }
        System.out.printf("%.6f",positives/arr.size());
        System.out.println();
        System.out.printf("%.6f",negatives/arr.size());
        System.out.println();
        System.out.printf("%.6f",zeros/arr.size());



    }
}
