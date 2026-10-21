package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aufgabe24 {

    static  void  main(String[] args) {

        int point = 999999;

        List<Integer> digits = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> result = new ArrayList<>();

        int rest=point;
        for (int i = 9; i > 0; i--) {
            int possibilities = berechneFakultat(i);
            int index = rest / possibilities;
            rest %= possibilities;
            result.add(digits.remove(index));
        }
        result.add(digits.get(0));
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining()));

    }

    private static int berechneFakultat(int fak) {
        int possibilities =1;
        for (int i = 1; i <= fak; i++) {
            possibilities*=i;
        }
        return possibilities;
    }
}
