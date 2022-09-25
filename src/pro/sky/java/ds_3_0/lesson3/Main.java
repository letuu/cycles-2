package pro.sky.java.ds_3_0.lesson3;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ - 2");
        System.out.println("Задание 1");
        //комета, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого
        //в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз
        //вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления
        int thisYear = 2022;
        int minus200Year = thisYear - 200; //год за 2оо лет до текущего
        int endYear = thisYear + 100; //год завершения периода расчета
        for (int i = minus200Year ; i <= endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n" + "Задание 2");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2 - 2*1=2 - 2*10=20
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
