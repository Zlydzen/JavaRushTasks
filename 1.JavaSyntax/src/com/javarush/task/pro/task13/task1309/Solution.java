package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Nikita", 7.8);
        grades.put("Elza", 8.2);
        grades.put("Liza", 7.7);
        grades.put("Svytozar", 8.5);
        grades.put("Pamella", 4.6);
    }
}
