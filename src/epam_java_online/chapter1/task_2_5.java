package epam_java_online.chapter1;

import java.util.Scanner;

public class task_2_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №2.5");
        System.out.println(" Вычислить значение функции");
        System.out.println("-----------------------------------------------");

        // Ввод значений
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.println("Значение аргумента");
        System.out.print("x = ");
        double x = sc.nextFloat();

        System.out.println("-----------------------------------------------");
        // Расчет значения функции
        double y;
        if(x<=3) {
            y = (Math.pow(x, 2) - 3*x + 9);
        } else {
            y = 1/(Math.pow(x, 3) + 6);
        }
        System.out.println("Значение функции f(x) = " + y);
    }

}
