package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        String name = args[i];
                        String bd = args[i + 2];
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        if (args[i + 1].equals("м")) {
                            try {
                                Person male = Person.createMale(name, formatter.parse(bd));
                                allPeople.add(male);
                                System.out.println(allPeople.indexOf(male));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                        if (args[i + 1].equals("ж")) {
                            try {
                                Person female = Person.createFemale(name, formatter.parse(bd));
                                allPeople.add(female);
                                System.out.println(allPeople.indexOf(female));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        String name = args[i + 1];
                        String sex = args[i + 2];
                        String bd = args[i + 3];
                        try {
                            person.setBirthDate(formatter.parse(bd));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        person.setName(name);
                        if (sex.equals("м")) {
                            person.setSex(Sex.MALE);
                        }
                        if (sex.equals("ж")) {
                            person.setSex(Sex.FEMALE);
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 1) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 1) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String name = person.getName();
                        Date birthDate = person.getBirthDate();
                        String bd = formatter.format(birthDate);
                        String russianSex = "";
                        if (person.getSex().name().equals("MALE")) {
                            russianSex = "м";
                        }
                        if (person.getSex().name().equals("FEMALE")) {
                            russianSex = "ж";
                        }
                        System.out.println(name + " " + russianSex + " " + bd);
                    }
                    break;
                }
        }

    }
}
