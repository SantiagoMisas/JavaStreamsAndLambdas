package com.testing.JLambdas.streams;

import java.util.Arrays;
import java.util.List;

class Student2{
    String name;
    int score;

     Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }


    public int getScore() {
        return score;
    }

}
public class ParallelStreamsDemo {
    public static void main(String[] args) {
        List<Student2> stlist= Arrays.asList(
                new Student2("Bob", 90),
                new Student2("David", 82),
                new Student2("John", 65),
                new Student2("Canedy", 55),
                new Student2("Eric", 85),
                new Student2("Smith", 88),
                new Student2("Scott", 50)
        );
        //Using stream secuencial
        stlist.stream()
                .filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(a-> System.out.println("Student: "+a.getName()+"\n"+"Score: "+a.getScore()));

        //Using ParalellStream diferentes pipelines mas rapido
        stlist.parallelStream()
                .filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(a-> System.out.println("Student: "+a.getName()+"\n"+"Score: "+a.getScore()));


    //Convertir Stream a ParallelStream using Parallel Method
    stlist.stream()
                .parallel()
                .filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(a-> System.out.println("Student: "+a.getName()+"\n"+"Score: "+a.getScore()));


    }
}
