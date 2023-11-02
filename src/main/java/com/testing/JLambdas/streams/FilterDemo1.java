package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList=new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(20);
        numberList.add(35);
        numberList.add(150);
        numberList.add(30);

        List<Integer> numberList1= Arrays.asList(10,20,25,30);
        List<Integer> evenNumberList=new ArrayList<Integer>();

        /*for (int n:numberList1){
            if(n%2==0)
                evenNumberList.add(n);
        }
        System.out.println(evenNumberList);*/

        evenNumberList=numberList1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        //numberList.stream().filter(n->n%2==0).forEach(System.out::println);
        //Filtrar los que pueden ser divididos por 2 e imprimir
        numberList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));


    }
}
