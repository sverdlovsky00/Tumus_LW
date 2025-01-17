package timus;

import java.util.*;

public class tim1 {
    public static void main(String[] args) {
        int[] inputArray = {7, 10, 15, 20, 25, 50, 100, 1000, 99999, 0};
        List<Integer> inputs = new ArrayList<>();
        for (int n : inputArray) {
            if (n == 0) break;
            inputs.add(n);
        }

        int maxN = Collections.max(inputs);
        int[] sequence = new int[maxN + 1];
        sequence[0] = 0;
        if (maxN > 0) sequence[1] = 1;

        for (int i = 2; i <= maxN; i++) {
            if (i % 2 == 0) {
                sequence[i] = sequence[i / 2];
            } else {
                sequence[i] = sequence[i / 2] + sequence[i / 2 + 1];
            }
        }

        for (int n : inputs) {
            int maxValue = 0;
            for (int i = 0; i <= n; i++) {
                maxValue = Math.max(maxValue, sequence[i]);
            }
            System.out.println("n = " + n + ", max = " + maxValue);
        }
    }
}