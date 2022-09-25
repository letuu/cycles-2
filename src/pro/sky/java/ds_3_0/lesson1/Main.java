package pro.sky.java.ds_3_0.lesson1;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ - 1");
        System.out.println("Задание 1");
        //сколько мес надо, чтобы накопить 2 459 000 р при условии, что первоначально мы имеем 0 р и готовы откладывать по 15 т р
        int monthMoney = 15_000;
        int totalMoney = 0;
        int i = 0;
        int totalMoneyLimit = 2_459_000;
        while (totalMoney <= totalMoneyLimit) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + monthMoney;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }
        System.out.println("Чтобы накопить " + totalMoneyLimit + " рублей, потребуется " + i + " месяцев");


        System.out.println("\n" + "Задание 2");
        // Выведите в одну строку через пробел числа от 1 до 10, используя цикл while
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for
        int n = 0;
        while (n < 10) {
            n = n + 1;
            System.out.print(n + " ");
        }
        // n после отработки цикла while равен 10
        System.out.print("\n");
        for (; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        System.out.println("Задание 3");
        // В стране Y население равно 12 миллионам человек
        // Рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек
        // Какая численность населения будет через 10 лет
        int population = 12_000_000;
        int yearFertility = 17;
        int yearMortality = 8;
        int year = 1;
        while (year < 11) {
            population = population + population * yearFertility / 1000 - population * yearMortality / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");
            year += 1;
        }
    }
}
