package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe23 {

    public static void main(String[] args) {
        List<Integer> abundant = new ArrayList<>();
        boolean[] isAbundant = new boolean[28124];

        // 12 mit erfassen!
        abundant.add(12);
        isAbundant[12] = true;

        fillAbundantList(abundant, isAbundant);

        int sum = sumOfNonAbundantNumbers();
        sum += numbersOfNonAbundantNumbers(abundant, isAbundant);

        System.out.println(sum); // Gibt exakt 4179871 aus
    }

    private static int numbersOfNonAbundantNumbers(List<Integer> abundant, boolean[] isAbundant) {
        int sum = 0;
        for (int z = 25; z <= 28123; z++) {
            int i = 0;
            boolean found = false;

            while (i < abundant.size() && abundant.get(i) <= z / 2) {
                int rest = z - abundant.get(i);
                if (isAbundant[rest]) {
                    found = true;
                    break;
                }
                i++;
            }

            if (!found) {
                sum += z;
            }
        }
        return sum;
    }

    private static int sumOfNonAbundantNumbers() {
        int sum = 0;
        for (int i = 1; i < 24; i++) {
            sum += i;
        }
        return sum;
    }

    private static void fillAbundantList(List<Integer> abundant, boolean[] isAbundant) {
        for (int i = 13; i <= 28123; i++) {
            int sum = 1;
            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    if (i / k != k) {
                        sum += k;
                        sum += i / k;
                    } else {
                        sum += k;
                    }
                }
            }
            if (sum > i) {
                abundant.add(i);
                isAbundant[i] = true;
            }
        }
    }
}