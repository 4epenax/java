//пакет
package jft.sandbox;

//декларация класса, всегда с большой буквы! только класс! всё остальное с маленькой (фигурные скобки - это границы класса)
public class MyFirstProgram {

    //функция и метод - синонимы, после имени метода всегда есть скобки (после фигурные скобки - это границы функции)
    public static void main(String[] args) {
        //вызов функции
        hello("world");
        hello("user");
        hello("Alexej");

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

        //переменные:
        //int - целое число
        //double - число с плавающей точкой (дробь)
        //String - строка, значение "записывается в двойных ковычках"
        int l = 6;
        double s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);

        //вызов функции с типом double
        //переменный привязаны к фигурным скобкам (т.е. можно использовать переменный с одинаковыми названиями в разных местах)
        double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

        double a = 4;
        double b = 6;
        //вызов другой функции area возможен, т.к. у неё другие параметры
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

    //void - если указано, то функция не возвращает ничего
    //функция (подпрограмма, которую можно вызывать много раз в разных местах)
    //в скобках передаётся параметр (или агрумент), что является аналогом переменной, что задаётся при вызове функции, а не в самой функции
    public static void hello(String somebody) {
        //вывод на экран (консоль), можно писать команду *sout*
        System.out.println("Hello, " + somebody + "!");
    }

    //перед именем функции указывается тип возвращаемого результата ~ void [ничего], double [дробное число]
    public static double area(double l) {
        return l * l;
    }

    //java различает функции с одинаковыми названиями, но разными параметрами
    public static double area(double a, double b) {
        return a * b;
    }
}