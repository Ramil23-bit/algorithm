package org.homeworkthree;

public class Palindrome {

    public static String palindromString(String word){
        if(word.length() == 1){
            return "Palindrome";
        }else{
            if(word.substring(0,1).equals(word.substring(word.length() -1))){
                return palindromString(word.substring(1, word.length() -1));
            }
            else {
                return "NO";
            }
        }
    }
}
