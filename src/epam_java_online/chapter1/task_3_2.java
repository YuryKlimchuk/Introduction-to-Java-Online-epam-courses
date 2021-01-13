package epam_java_online.chapter1;

import java.util.Scanner;

public class task_3_2 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.2");
        System.out.println(" Вычислить значение фнкции, на интервале [a, b] с шагом h");
        System.out.println("-----------------------------------------------");

        // Ввод значений
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.println("Введеное значение начало интервала");
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.println("Введеное значение конец интервала");
        System.out.print("b = ");
        float b = sc.nextFloat();
        System.out.println("Введеное значение шага");
        System.out.print("h = ");
        float h = sc.nextFloat();

        //расчет
        for (float i = a; i <=b; i+=h) {
           if(i > 2) {
               System.out.print("Значение аргумента, х = " + i);
               System.out.println(";    Значение функции, y = " + i);
           }  else {
               System.out.print("Значение аргумента, х = " + i);
               System.out.println(";    Значение функции, х = " + i*(-1));
           }
        }


    }


}
