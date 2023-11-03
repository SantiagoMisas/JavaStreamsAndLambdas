package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OtherLambdasSA {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(2,4,1,5,8,4,0);
        //Sorted Method
        List<Integer>sortedList=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        //Sorted Method Reverse Order
        List<Integer>sortedList2=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList2);

        List<String> list2= Arrays.asList("John","Mary","Kim", "David", "Smith");
        List<String> sortedlist3=list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist3);

        List<String> sortedlist4=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedlist4);

    }
}
