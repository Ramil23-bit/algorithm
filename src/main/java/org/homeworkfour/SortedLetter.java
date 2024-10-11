package org.homeworkfour;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SortedLetter {

    public void splittingString(String stringLetter){
        int middleString = stringLetter.length() / 2;
        String firstHalf = stringLetter.substring(0, middleString).toUpperCase();
        String secondHalf = stringLetter.substring(middleString).toUpperCase();

        char[] firstString = firstHalf.toCharArray();
        Arrays.sort(firstString);

        char[] secondChar = secondHalf.toCharArray();
        Arrays.sort(secondChar);

        char[]newStringSorted = new char[firstString.length + secondChar.length];
        System.arraycopy(firstString,0, newStringSorted, 0, firstString.length);
        System.arraycopy(secondChar,0, newStringSorted, firstString.length, secondChar.length);

        Arrays.sort(newStringSorted);

        System.out.println(Arrays.toString(newStringSorted));
    }

}
