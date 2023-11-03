package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;

public class OtherLambdasT {
    public static void main(String[] args) {
        List<String> listaT = Arrays.asList("A", "B", "C", "1", "2", "3", "4");
        Object arr[] = listaT.stream().toArray();
        System.out.println(arr.length);


        for (Object v : arr) {
            System.out.println(v);
        }
    }
}
