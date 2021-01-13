package epam_java_online.chapter1;

import java.util.Scanner;

public class task_1_2 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №1.2");
        System.out.println(" Вычислить значение выражения : ((a-3)*b/2)+c");
        System.out.println("-----------------------------------------------");

        // ввод значений переменных
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите значения переменных");

        System.out.print(" a = ");
        float a = sc.nextFloat();
        System.out.print(" b = ");
        float b = sc.nextFloat();
        System.out.print(" c = ");
        float c = sc.nextFloat();
        System.out.println("-----------------------------------------------");

        // расчет и вывод результата
        double result =
                ((b + Math.sqrt(Math.pow(b, 2)+4*a*b)) / (2*a))
                - (Math.pow(a,3)*c)
                + (Math.pow(b,-2));
        System.out.println("Результат = " + result);
    }

}
