package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        String netProtocol1 = "http";
        String netProtocol2 = "https";
        if (url.startsWith("https"))
            return netProtocol2;
        if (url.startsWith("http"))
            return netProtocol1;
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        String domainRu = "ru";
        String domainCom = "com";
        String domainOrg = "org";
        String domainCc = "cc";
        String domainNet = "net";
        if (url.endsWith(".ru"))
                return domainRu;
        if (url.endsWith(".com"))
            return domainCom;
        if (url.endsWith(".org"))
            return domainOrg;
        if (url.endsWith(".cc"))
            return domainCc;
        if (url.endsWith(".net"))
            return domainNet;
        else
        return "неизвестный";
    }
}
