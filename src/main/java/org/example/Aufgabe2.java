package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Aufgabe2 {

    static void main(){
        long first =0;
        long second =1;
        List<Long> numbers = new ArrayList<>();
        long sum =0;
        while(sum < 4000000){
            sum = first +second;
            first = second;
            second= sum;
            numbers.add(sum);
        }
        System.out.println("numbers = " +  numbers.stream().filter(a -> a % 2 ==0).mapToLong(a -> a).sum());

    }


}
