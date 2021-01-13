package epam_java_online.chapter1;

import java.util.Scanner;

public class task_3_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.1");
        System.out.println(" Подсчитать сумму числе от 1 до введеного значения");
        System.out.println("-----------------------------------------------");

        // Ввод значений
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.println("Введеное значение (целое положительное число)");
        System.out.print("x = ");
        int x = sc.nextInt();

        //Расчет
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел: " + sum);

    }


}
