package epam_java_online.chapter1;

import java.util.Scanner;

public class task_3_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.3");
        System.out.println(" Вычислить сумму квардратов первых 100 чисел");
        System.out.println("-----------------------------------------------");

        // Ввод значений
        Scanner sc = new Scanner(System.in);

        // Расчет
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i*i;
        }

        System.out.println("Ответ : " + sum);


    }

}
