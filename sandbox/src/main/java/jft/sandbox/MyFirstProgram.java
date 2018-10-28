//пакет
package jft.sandbox;

//декларация класса, всегда с большой буквы! только класс! всё остальное с маленькой (фигурные скобки - это границы класса)
public class MyFirstProgram {

    //функция и метод - синонимы, после имени метода всегда есть скобки (после фигурные скобки - это границы функции)
    public static void main(String[] args) {
        //вывод на экран (консоль), можно писать команду *sout*
        System.out.println("Hello, world!");

        //арифметика
        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);

        System.out.println(1 / 2);
        //через точку (плавающая точка) пишутся дробные числа
        System.out.println(1.0 / 2);
        System.out.println(1 / 2.0);
        System.out.println(2.0 / 2);


        //в кавычках выделяются строки и их можно склеивать (операция конкатенации)
        System.out.println("2" + "2");
        System.out.println("2" + 2);
        System.out.println(2 + "2");

        System.out.println((2 + 2) * 2);

        System.out.println("2 + 2 = " + (2 + 2));
    }
}