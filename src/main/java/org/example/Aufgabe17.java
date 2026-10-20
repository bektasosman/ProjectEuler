package org.example;


import java.util.HashMap;
import java.util.Map;

public class Aufgabe17 {

    public static Map<Integer, String> mapping = new HashMap<Integer, String>();
    public static int count = 0;

    static void main() {


        mapping.put(1, "one");
        mapping.put(2, "two");
        mapping.put(3, "three");
        mapping.put(4, "four");
        mapping.put(5, "five");
        mapping.put(6, "six");
        mapping.put(7, "seven");
        mapping.put(8, "eight");
        mapping.put(9, "nine");
        mapping.put(10, "ten");
        mapping.put(11, "eleven");
        mapping.put(12, "twelve");
        mapping.put(13, "thirteen");
        mapping.put(14, "fourteen");
        mapping.put(15, "fifteen");
        mapping.put(16, "sixteen");
        mapping.put(17, "seventeen");
        mapping.put(18, "eighteen");
        mapping.put(19, "nineteen");
        mapping.put(20, "twenty");
        mapping.put(30, "thirty");
        mapping.put(40, "forty");
        mapping.put(50, "fifty");
        mapping.put(60, "sixty");
        mapping.put(70, "seventy");
        mapping.put(80, "eighty");
        mapping.put(90, "ninety");
        mapping.put(100, "one hundred");
        mapping.put(200, "two hundred");
        mapping.put(300, "three hundred");
        mapping.put(400, "four hundred");
        mapping.put(500, "five hundred");
        mapping.put(600, "six hundred");
        mapping.put(700, "seven hundred");
        mapping.put(800, "eight hundred");
        mapping.put(900, "nine hundred");
        mapping.put(1000, "one thousand");

        for (int i = 1; i <= 1000; i++) {
             getCount(i);
        }

        System.out.println(count);



    }

    private static int getCount(int i) {
        if(mapping.containsKey(i)) {
            count += mapping.get(i).replace(" ", "").length();
        }
        else {
            if(i <100) {
                int k = i % 10;
                int m = i - k;
                count += mapping.get(m).replace(" ", "").length();
                count += mapping.get(k).replace(" ", "").length();
            }
            else{
                if(i<1000) {
                    int k = i % 100;
                    count += mapping.get(i-k).replace(" ", "").length();
                    if(k!=0) {
                        count +=3;
                        getCount(k);
                    }
                }
                else {
                    if (i == 1000) {
                        count += mapping.get(1000).replace(" ", "").length();
                    }
                    }
                }

        }
        return count;
    }
}
