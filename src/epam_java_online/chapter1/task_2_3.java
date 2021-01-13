package epam_java_online.chapter1;

import java.util.Scanner;

public class task_2_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №2.3");
        System.out.println(" Проверить лежат ли три точки на одной прямой?)");
        System.out.println("-----------------------------------------------");

        // ввод значений точек
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.println("Точка №1");
        System.out.print("x1 = ");
        float x1 = sc.nextFloat();
        System.out.print("y1 = ");
        float y1 = sc.nextFloat();

        System.out.println("Точка №2");
        System.out.print("x2 = ");
        float x2 = sc.nextFloat();
        System.out.print("y2 = ");
        float y2 = sc.nextFloat();

        System.out.println("Точка №3");
        System.out.print("x3 = ");
        float x3 = sc.nextFloat();
        System.out.print("y3 = ");
        float y3 = sc.nextFloat();

        System.out.println("-----------------------------------------------");

        // Расчет
        // Определим уравление кривой через две первые точки в виде: у=kx+b
        // Расчт коэф. k
        float k = (y2-y1)/(x2-x1);
        // Расчт коэф. b
        float b = y1 - x1*((y2-y1)/(x2-x1));
        System.out.println("Коэфициент k = " + k);
        System.out.println("Коэфициент b = " + b);

        // Проверям лежит ли точка №3 на прямой
        float _y3 = k*x3+b;
        if(y3 == _y3) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки НЕ лежат на одной прямой");
        }

    }

}
