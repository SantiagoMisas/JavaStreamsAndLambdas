package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OtherLambdasCCC {
    public static void main(String[] args) {
        List<String> animalList=Arrays.asList("Dog","Cat","Elephant");
        List<String> birdList=Arrays.asList("peackock","parrot","Crow");
        Stream <String> stream1=animalList.stream();
        Stream <String> stream2=birdList.stream();

        List<String> finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());
        //System.out.println(finalList);

        finalList.stream().forEach(o-> System.out.println(o));

/*        for(String item:finalList){
            System.out.println(item);
        }*/
    }
}
