package org.homeworkthree;

public class NaturalNumber {

    public static double naturalNumber(double number){
        if (number == 1) {
            return number;
        } else if (number > 1 && number < 2) {
            return 0;
        } else{
            return naturalNumber(number / 2);
        }
    }
}
