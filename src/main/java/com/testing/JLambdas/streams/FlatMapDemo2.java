package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jony","Kitty");

       List<List<String>> people=new ArrayList<List<String>>();
       people.add(teamA);
       people.add(teamB);
       people.add(teamC);

/*       for(List<String>equipo:people){
        for (String name:equipo){
            System.out.println(name);
        }
       }*/
        List<String> names=people.stream().flatMap(c->c.stream()).collect(Collectors.toList());
        System.out.println(names);
    }
}
