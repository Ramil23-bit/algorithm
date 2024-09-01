package org.homeworkthree;

public class FibonacciNumbers {

    public static int fibonacciNumber(int number){
        if(number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }else {
            return fibonacciNumber(number - 2) + fibonacciNumber(number - 1);
        }
    }
}
