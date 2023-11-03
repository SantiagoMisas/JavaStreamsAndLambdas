package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OtherLambdasFF {
    public static void main(String[] args) {
        List<String> llista= Arrays.asList("one","two","three","one");
        //FindAny method encontrar alguno
        Optional<String> ele=llista.stream().findAny();
        System.out.println(ele.get());

        List<String> llista2= Arrays.asList("one","two","three","one");
        //Mehotd find first
        Optional<String> ele2=llista2.stream().findFirst();
        System.out.println(ele2.get());
    }
}
