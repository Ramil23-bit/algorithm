package org.homeworkthree;

public class SumNumber {

    public static int sumNumber(int number){
        if(number < 10){
            return number;
        }else {
            return number % 10 + sumNumber(number / 10);
        }
    }
}
