package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код
    public boolean equals(Object mobilePhone) {
        if (this == mobilePhone)
            return true;
        if (mobilePhone == null)
            return false;
        Iphone phone = (Iphone) mobilePhone;
        return this.model == ((Iphone) mobilePhone).model && this.color == ((Iphone) mobilePhone).color &&
                this.price == ((Iphone) mobilePhone).price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
