package com.proftelran.org.homework.homework26_09;

public class Main {
    public static void main(String[] args) {

        Person Tom = new Person();
        Tom.setName("Tom");
        Tom.setFullname("Tom Mayer");
        Tom.setAge(32);


        Person Lina = new Person("Lina", "Lina Schmidt", 30);

        System.out.println(Tom);
        System.out.println(Lina);
    }
}
