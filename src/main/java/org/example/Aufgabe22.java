package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aufgabe22 {

    static void main(String[] args) throws IOException {

        InputStream input = Aufgabe22.class.getClassLoader().getResourceAsStream("names.txt");

        if (input == null) {
            throw new RuntimeException("names.txt nicht gefunden!");
        }

        String inhalt = new String(input.readAllBytes(), StandardCharsets.UTF_8);

        List<String> names = new ArrayList<>(
                Arrays.asList(inhalt.replace("\"", "").split(",")));

        Collections.sort(names);
        int sum = 0;
        for (int i = 1; i <= names.size(); i++) {
            int nameScore=0;
            char[] letters = names.get(i-1).toCharArray();
            for (char letter : letters) {
                nameScore +=  letter - 'A' +1;
            }
            sum += nameScore * i;
        }
        System.out.println(sum);
    }
}
