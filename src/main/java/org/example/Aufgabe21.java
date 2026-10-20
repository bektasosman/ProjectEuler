package org.example;

public class Aufgabe21 {

     static void main(){

         int sumAmicibleNumbers = 0;

         for (int i = 1; i < 10000; i++) {
             int sum = sumOfProperDivisors(i);
             int sum2 = sumOfProperDivisors(sum);
            if(i == sum2 && sum != i) {
                sumAmicibleNumbers+= i;
            }
         }
         System.out.println(sumAmicibleNumbers);
    }

    static int sumOfProperDivisors(int zahl){
        int sum = 0;
        int biggestDivisor = zahl / 2;
        for(int i = biggestDivisor; i >=1;i--) {
            if (zahl % i == 0) {
                sum += i;
            }
        }
        return sum;
    }


}
