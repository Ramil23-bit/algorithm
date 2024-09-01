package org.homeworkthree;

public class Main {

    public static void main(String[] args) {
        if(NaturalNumber.naturalNumber(16) == 1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        System.out.println(SumNumber.sumNumber(985));
        System.out.println(FibonacciNumbers.fibonacciNumber(7));
        System.out.println(Palindrome.palindromString("structure"));
    }
}
