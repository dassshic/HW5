public class Main {
    public static void main(String[] args) {
        int i;
        System.out.println("task1");
        for (i=1; i<11; i++) {
            System.out.println(i);
        }
        System.out.println("task2");
        for (i=10; i>0; i--) {
            System.out.println(i);
        }
        System.out.println("task3");
        for (i=0; i<17; i=i+2) {
            System.out.println(i);
        }
        System.out.println("task4");
        for (i=10; i>-11; i--) {
            System.out.println(i);
        }
        System.out.println("task5");
        for (i=1904; i<=2026; i=i+4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("task6");
        for (i=7; i<=98; i=i+7) {
            System.out.println(i);
        }
        System.out.println("task7");
        for (i=1; i<=512; i=i*2) {
            System.out.println(i);
        }
        System.out.println("task8");
        int salary = 29000;
        int total = 0;
        int percent;
        for (i=1; i<=12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("task9");
        total = 0;
        for (i=1; i<=12; i++) {
            percent = (int) (total*0.12);
            total = total + salary + percent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}