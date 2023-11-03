package com.testing.JLambdas.streams;

import java.util.HashSet;
import java.util.Set;

public class OtherLambdasAAA {
    public static void main(String[] args) {
        Set<String> fruites=new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guavas");
        //Usar llaves si hay retorno en la lambda si no no usar las llaves{}
        //AnyMatch Method si lo encuentra retorna booleano
        boolean t=fruites.stream().anyMatch(v->{return v.startsWith("One");});
        System.out.println(t);

        //AllMatch Method si lo encuentra retorna booleano
        boolean u=fruites.stream().allMatch(v->{return v.startsWith("One");});
        System.out.println(u);

        //NoneMatch Method si lo encuentra retorna booleano
        boolean w=fruites.stream().noneMatch(v->{return v.startsWith("One");});
        System.out.println(w);

    }
}
