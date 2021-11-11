package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code
        System.out.println(ais(generateRandomAge(), 12));
        System.out.println(ais(generateRandomAge(), 0));
        System.out.println(ais(generateRandomAge(), 20));
        System.out.println(ais(generateRandomAge(),31));
        System.out.println(ais(generateRandomAge(),21));
    }

    public static String ais(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature <= 25) {
            return "Можно итди гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(50);
        return age;
       }


}