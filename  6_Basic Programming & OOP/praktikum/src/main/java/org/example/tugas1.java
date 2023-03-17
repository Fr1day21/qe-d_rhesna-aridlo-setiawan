package org.example;

public class tugas1 {

    public static String[] joinArrays(String[] array1, String[] array2) {
        String[] array1Plus2 = new String[array1.length + array2.length];

        int lengthNoDuplicate = 0;

        for (int i = 0; i < array1.length; ++i) {
            array1Plus2[lengthNoDuplicate] = array1[i];
            ++lengthNoDuplicate;
        }
        for (int i = 0; i < array2.length; ++i) {
            boolean isDuplicate = false;

            for (int j = 0; j < array1.length; ++j) {
                if (array2[i].equals(array1[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array1Plus2[lengthNoDuplicate] = array2[i];
                ++lengthNoDuplicate;
            }
        }
        String[] newStringNoDuplicate = new String[lengthNoDuplicate];

        for (int i = 0; i < lengthNoDuplicate; ++i){
            newStringNoDuplicate[i] = array1Plus2[i];
        }

        return newStringNoDuplicate;
    }
}
