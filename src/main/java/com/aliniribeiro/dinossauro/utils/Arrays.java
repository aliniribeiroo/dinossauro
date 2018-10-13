package com.aliniribeiro.dinossauro.utils;

public class Arrays {

    private void arrayStringToArrayInt(){
        String stringOfNumbers = "1;2;3;4;5;6";
        String[] arrayOfStrings = stringOfNumbers.split(";");
        int arrayOfInteger[] = new int[arrayOfStrings.length];
        for(int i = 0; i < arrayOfStrings.length; i++)
            arrayOfInteger[i] = Integer.valueOf(arrayOfStrings[i]);

        System.out.println(arrayOfInteger[0]);
    }
}
