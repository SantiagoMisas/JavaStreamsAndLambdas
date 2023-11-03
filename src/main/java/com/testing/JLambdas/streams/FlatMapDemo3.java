package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int usid;
    String name;
    char grade;

    Student(int usid, String name, char grade) {
        this.usid = usid;
        this.name = name;
        this.grade = grade;
    }
}
public class FlatMapDemo3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(101,"Smith", 'A'));
        students.add(new Student(102,"John", 'B'));
        students.add(new Student(103,"Kennedy", 'C'));

        List<Student> students1 = new ArrayList<Student>();
        students1.add(new Student(104,"Scott", 'A'));
        students1.add(new Student(105,"Mary", 'B'));
        students1.add(new Student(106,"Kitty", 'C'));

        List<List<Student>> allStudents = Arrays.asList(students,students1);
/*        for(List<Student> l1:allStudents){
            for(Student student:l1){
                System.out.println(student.name);
            }
        }*/

        List<String> studentsName=allStudents.stream().flatMap(s->s.stream()).map(s->s.name).collect(Collectors.toList());
        List<Student> otherStudents=allStudents.stream().flatMap(s->s.stream()).collect(Collectors.toList());
        otherStudents.stream().forEach(s-> System.out.println(s.name));
        System.out.println(studentsName);

    }
}
