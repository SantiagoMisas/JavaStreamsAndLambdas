package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OtherLambdasDLC {
    public static void main(String[] args) {
        List<String> vehicleslist = Arrays.asList("bus","car","car","bicycle","bicycle","flight","train");
        //Distinct Method
       vehicleslist.stream().distinct().forEach(e-> System.out.println(e));

       //Count Method
        long contar=vehicleslist.stream().distinct().count();
        System.out.println(contar);
        //Limit Method
        List<String> limitLambda=vehicleslist.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitLambda);



    }
}
