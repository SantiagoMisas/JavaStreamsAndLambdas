package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        List<Integer> numbers2=numbers.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(numbers2);
        List<Integer>lista1=Arrays.asList(1,2);
        List<Integer>lista2=Arrays.asList(3,4);
        List<Integer>lista3=Arrays.asList(5,6);

        List<List<Integer>>finalList=Arrays.asList(lista1,lista2,lista3);
        List<Integer>finalResults= finalList.stream().flatMap(c->c.stream().map(n->n+15)).collect(Collectors.toList());
        System.out.println(finalResults);
    }
}
