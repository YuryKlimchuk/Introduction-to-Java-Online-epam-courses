package epam_java_online.chapter1;

import java.util.Scanner;

public class task_2_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №2.1");
        System.out.println(" Проверить можно ли создать треугольник из двух данных углов? будет ли треугольник прямоугольным?");
        System.out.println("-----------------------------------------------");

        // ввод значений уголов
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение углов, от 0 до 180 град");

        System.out.print("Первый угол, a = ");
        float a = sc.nextFloat();
        System.out.print("Второй угол, b = ");
        float b = sc.nextFloat();
        System.out.println("-----------------------------------------------");

        // Проверка есть ли такой треугольник?
        if((a+b)<180) {
            System.out.println("Из данных углов можно сделать треугольник!");
            if((a==90) || (b==90) || ((180 - (a+b))==90)) {
                System.out.println("Треугольник прямоуголный");
            } else {
                System.out.println("Треугольник НЕ прямоуголный");
            }
        } else {
            System.out.println("Из данных углов НЕ ВОЗМОЖНО сделать треугольник");
        }

    }
}
