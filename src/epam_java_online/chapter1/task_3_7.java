package epam_java_online.chapter1;

import java.util.Scanner;

public class task_3_7 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.7");
        System.out.println(" Вести все делители для чисел из диапазона от N до M");
        System.out.println("-----------------------------------------------");

        // Ввод данных
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.print("Начало диапазона N = ");
        int N = sc.nextInt();
        System.out.print("Конец диапазона M = ");
        int M = sc.nextInt();


        //Расчет
        System.out.println("Расчет результатов:");
        for (int i = N; i <=M; i++) {
            System.out.println("Число :" + i);
            System.out.print("Множители : ");
            for (int j = 2; j < i; j++) {
                if((i%j) == 0) {
                    System.out.print(j + " ");
                }
            }
        }

    }


}
