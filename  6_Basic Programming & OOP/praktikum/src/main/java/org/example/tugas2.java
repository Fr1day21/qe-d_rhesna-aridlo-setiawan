package org.example;

import java.util.ArrayList;

public class tugas2 {

    public static ArrayList<Character> uniqueNumber(String input){
        ArrayList<Character> uniqueNumbers = new ArrayList<Character>();

        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)){
                uniqueNumbers.add(currentChar);
            }
        }
        return uniqueNumbers;
    }
}
