package org.example;




public class Aufgabe19 {


    static void main(){
            System.out.println(getCounter());
    }

    private static int getCounter() {
        int daysToAdd = 0;
        int sundaysCounter =0;
        int currentDay=1;

        for(int year=1901;year<=2000;year++) {
            for(int month=0;month<12;month++) {
                if (month == 3 || month == 5 || month == 8 || month == 10) {
                    daysToAdd = 30;
                } else if (month == 11 || month == 9 || month == 7 || month == 6 || month == 4 || month == 2 || month == 0) {
                    daysToAdd = 31;
                } else if ((year % 100 ==0 && year % 400 == 0 )|| (year % 4 == 0 && year %100 !=0)) {
                        daysToAdd = 29;
                } else{
                    daysToAdd = 28;
                }
                currentDay = (currentDay + daysToAdd) % 7;
                if (currentDay == 6) {
                    sundaysCounter++;
                }
            }
        }
        return sundaysCounter;
    }

}
