package main.java;

import java.util.*;

public class MyCode {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int bobPoints = 0;
        int alicePoints = 0;
        for(int i = 0; i < a.size(); i++){
            if (a.get(i)> b.get(i)){
                alicePoints++;
            }if (a.get(i)<b.get(i)){
                bobPoints++;
            }

        }

        return Arrays.asList(alicePoints,bobPoints);
    }
}
