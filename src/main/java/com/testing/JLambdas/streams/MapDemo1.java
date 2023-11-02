package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        //vehicles = vehicles.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
        List<String> vehiclesUpperCase=vehicles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());

        /*for (String name : vehicles){
            vehiclesUpperCase.add(name.toUpperCase());
        }*/
        System.out.println(vehiclesUpperCase);

    }
}
