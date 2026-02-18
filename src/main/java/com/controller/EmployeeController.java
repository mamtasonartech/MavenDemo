package com.controller;

import java.util.*;

public class EmployeeController {
    public static void main(String[] args) {

        System.out.println(Arrays.asList(new Employee(12,"mamta","IT",2000)));

//        Student s1 = new Student("Mamta",101);
//        System.out.println(s1);

        System.out.println(Arrays.asList(new Student("Mamta",101),(new Student("Sanu",102))));


    }
}
