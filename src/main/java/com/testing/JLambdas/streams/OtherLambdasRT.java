package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OtherLambdasRT {
    public static void main(String[] args) {
       List<String> listaT= Arrays.asList("A","B","C","1","2","3","4");
       //Reduce Method
       Optional<String> reduced=listaT.stream().reduce((value, combinedValue)->{return combinedValue+value;});
        System.out.println(reduced.get());

    }
}
