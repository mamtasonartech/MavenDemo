package com.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;

    private String name;

    private String department;

    private double salary;

    public Employee(int i, String mamta, String it, int i1) {
    }
}