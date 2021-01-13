package epam_java_online.chapter1;

import java.util.Scanner;

public class task_3_8 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.8");
        System.out.println(" Даны два числа, определить числа которые входит в первое и второе число");
        System.out.println("-----------------------------------------------");

        // Ввод данных
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.print("Первое число A = ");
        int A = sc.nextInt();
        System.out.print("Второе число B = ");
        int B = sc.nextInt();

        //Расчет
        String strA = String.valueOf(A);
        String strB = String.valueOf(B);

        for (char chA: strA.toCharArray()) {
            for (char chB: strB.toCharArray()) {
                if(chA == chB) {
                    System.out.println("Цифра " + chA + " присутствует в двух числах");
                    break;
                }
            }
        }



    }

}
