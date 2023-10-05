package com.proftelran.org.homework.homework26_09;

public class Person {
    private String name;
    private String fullname;
    private int age;

//    public void move();

    


    public Person() {
        System.out.println("constructor without parameters");

    }

    public Person(String name, String fullname, int age) {
        System.out.println("constructor with params");

        this.name = name;
        this.fullname = fullname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}



// 1 уровень сложности: 1.Создать класс Person, который содержит:
//         переменные name, fullName, age;
//         a) Добавьте два конструктора  - Person() и Person(name, fullName, age).
//         b) Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
//         другой - Person(name, fullName, age)
//         c) Для объекта созданного с помощью конструктора Person(), заполните значение полей name, fullName, age, с помощью сеттеров
//
//         Дополнительно * :
//         Добавьте в класс Person методы move() и talk(), (пример public void move(), public void talk())
//        в которых просто вывести на консоль сообщение -"Такой-то fullName идет" и "Такой-то fullName говорит"
//        Вызовите данные методы у своих объектов.