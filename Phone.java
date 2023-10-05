package com.proftelran.org.homework.homework26_09;

public class Phone {


    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
      this.number = number;
      this.model = model;
      this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}


//    Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных - используйте доступ через геттеры для этих полей
//        (аналогично выводу цвета одного из объекта Dog на уроке).
//
//
//        Дополнительно * :
//        Добавить в класс Phone методы:
//        a)receiveCall, имеет один параметр – имя звонящего(name). Выводит на консоль сообщение “Звонит {name}”.
//        b)Метод getNumber – возвращает номер телефона.
//
//
//        Вызвать эти методы для каждого из объектов.