package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        Boolean isActive = true;
        while (isActive) {
            key = reader.readLine();
           switch (key){
               case "soapOpera":
                   Movie soapOpera = MovieFactory.getMovie("soapOpera");
                   System.out.println(soapOpera.getClass().getSimpleName());
                   break;
               case "cartoon":
                   Movie cartoon = MovieFactory.getMovie("cartoon");
                   System.out.println(cartoon.getClass().getSimpleName());
                   break;
               case "thriller":
                   Movie thriller = MovieFactory.getMovie("thriller");
                   System.out.println(thriller.getClass().getSimpleName());
                   break;
               default:
                   Movie movie = MovieFactory.getMovie(key);
                   isActive = false;
                   break;
           }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}

