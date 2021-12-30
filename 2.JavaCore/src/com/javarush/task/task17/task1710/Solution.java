package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));//сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код

        if (args[0].equals("-c")) {
            String name = args[1];
            String db = args[3];
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date parse = formatter.parse(db);
                if (args[2].equals("м")) {
                    Person male = Person.createMale(name, parse);
                    allPeople.add(male);
                    System.out.println(allPeople.lastIndexOf(male));
                }
                if (args[2].equals("ж")) {
                    Person female = Person.createFemale(name, parse);
                    allPeople.add(female);
                    System.out.println(allPeople.lastIndexOf(female));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }


        if (args[0].equals("-r")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));

            String name = person.getName();
//            String[] s = name.split(" ");
            String russianNameSex = "";
            if (person.getSex().name().equals("MALE")) {
                russianNameSex = "м";
            }
            if (person.getSex().name().equals("FEMALE")) {
                russianNameSex = "ж";
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(name + " " + russianNameSex + " " + dateFormat.format(person.getBirthDate()));
        }

        if (args[0].equals("-u")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            person.setName(args[2]);
            String sex = args[3];
            if (sex.equals("м")) {
                person.setSex(Sex.MALE);
            }
            if (sex.equals("ж")){
                person.setSex(Sex.FEMALE);
            }
            String db = args[4];
            try {
                person.setBirthDate(formatter.parse(db));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("Checking array's size " + allPeople.size());
        }

        if (args[0].equals("-d")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
}
