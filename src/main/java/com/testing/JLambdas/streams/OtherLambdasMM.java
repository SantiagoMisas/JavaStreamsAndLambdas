package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OtherLambdasMM {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Count Method
        long numberEl = numberList.stream().filter(n -> n % 2 == 0).count();
        System.out.println(numberEl);

        //Min Method valor minimo
        Optional<Integer> mini = numberList.stream().min((v1, v2)->{return v1.compareTo(v2);});
        System.out.println(mini.get());

        //Max Method valor maximo
        Optional<Integer> maxi = numberList.stream().max((v1, v2)->{return v1.compareTo(v2);});
        System.out.println(maxi.get());

    }
}