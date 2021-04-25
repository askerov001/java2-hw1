/*1)
Основное
a)  Доделать все пункты практического задания по презентации
b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии),
 последний 3й класс сделать не наследуемым
c)  Все поля классов должны быть приватными, одно из полей должно быть
сложного типа созданного вами же
 (4й класс), одно из полей сделать сложного типа (enum)
d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать
 неперезаписываемым
f)  В классе 3-го уровня перезаписать один из методов родителя
g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го
уровня (objectB, objectC), также распечатать все свойства объектов и вызвать перегруженные методы через
каждый из экземпляров ваших объектов.
На сообразительность
h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC*/

package com.company;

import java.text.BreakIterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Fuel fuel = new Fuel("Бензин", 7);
        Category objectA = new Category(Color.BLACK, fuel, "Седан", 1200);
        System.out.println(objectA.getInfo());
        objectA.drawAuto('B', "Легковой");

        Fuel fuel1 = new Fuel("Дизель", 10);
        Brand objectB = new Brand(Color.RED, fuel1, "Кабриолет", 1500, "BMW", 6, 2010, 10000);
        System.out.println(objectB.getInfo1());
        objectB.drawAuto("Легковой", 'B');

        Fuel fuel2 = new Fuel("Electro", 0);
        Brand objectC = new Brand(Color.WHITE, fuel2, "Хетчбэк", 1400, "Tesla", 0, 2015, 1000);
        System.out.println(objectC.getInfo2());
        objectC.drawAuto('B');

        System.out.printf("Копированные свойства\n");
        Brand copy=new Brand(objectC);
        objectC.copyBufer(objectB);
        System.out.println(objectC.getInfo2());
    }
}
