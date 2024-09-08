public class Main {
    public static void main(String[] args) {
        // задача 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
// задача 2
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        // задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // задача  7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //задача 8
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        // задача 9
        int money = 29000;
        int totaly = 0;
        for (int i = 1; i <= 12; i++) {
            totaly = totaly + totaly / 100;
            totaly = totaly + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totaly + " рублей.");
        }
        // задача 10
        int numeric = 2;
        for (int i = 1; i <= 10; i++) {
            int result = numeric * i;
            System.out.println(numeric + "*" + i + "=" + result);
        }

    }
}