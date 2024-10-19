package main.java;

public class MyCode {
    public static void staircase(int n) {
        String symbol = "#";
        String space = " ";

        for (int i = 1; i<= n; i++){
                for (int j = 1; j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.printf(symbol.repeat(i));

                System.out.println();

        }

    }
}
