package org.example;

import java.util.Arrays;

import static org.example.tugas1.*;
import static org.example.tugas2.*;

public class Main {
    public static void main(String[] args) {

        String[] array1 = {"Kazuya", "Jin", "Lee"};
        String[] array2 = {"Kazuya", "Feng"};
        String[] array3 = {"Lee", "Jin",};
        String[] array4 = {"Kazuya", "Panda"};

        System.out.println("Tugas 1");
        String[] tugas1input1 = joinArrays(array1, array2);
        System.out.println(Arrays.toString(tugas1input1));
        String[] tugas1input2 = joinArrays(array3, array4);
        System.out.println(Arrays.toString(tugas1input2));

        System.out.println("\nTugas 2");
        String tugas2input1 = "76523752";
        System.out.println(uniqueNumber(tugas2input1));
        String tugas2input2 = "1122";
        System.out.println(uniqueNumber(tugas2input2));
    }
}