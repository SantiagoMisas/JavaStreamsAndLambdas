package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {
                List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
                //Traer la longitud e imprimir la longitud
                vehicles.stream().map(v->v.length()).forEach(l-> System.out.println(l));
        /* for (String v : vehicles) {
           System.out.println(v.length());
        }*/
    }
}
