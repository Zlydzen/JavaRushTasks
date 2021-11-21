package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(2.2,"hello");
        labels.put(4.0,"world");
        labels.put(43.2d,"Java!");
        labels.put(0.001,"I'm");
        labels.put(0.0,"beginner developer");
    }
}
