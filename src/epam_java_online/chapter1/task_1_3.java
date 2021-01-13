package epam_java_online.chapter1;

import java.util.Scanner;

public class task_1_3 {
    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №1.3");
        System.out.println(" Вычислить значение выражения : ((a-3)*b/2)+c");
        System.out.println("-----------------------------------------------");

        // ввод значений переменных
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите значения переменных");

        System.out.print(" x = ");
        float x = sc.nextFloat();
        System.out.print(" y = ");
        float y = sc.nextFloat();
        System.out.println("-----------------------------------------------");

        // расчет и вывод результата
        double result =
                    ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)))
                    * Math.tan(x*y);
        System.out.println("Результат = " + result);
    }

}
