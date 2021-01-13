package epam_java_online.chapter1;

import java.util.Scanner;

public class task_3_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.5");
        System.out.println(" Найти сумма членов ряда, модуль которых больше или равен E");
        System.out.println(" Nый член ряда: an= 1/(2^n) + 1/(3^n)");
        System.out.println("-----------------------------------------------");


        // Ввод данных
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.println("Модуль числа E");
        System.out.print("E = ");
        float e = sc.nextFloat();

        // Расчет результов
        float sum = 0;       // здесь храним сумму членов
        int n = 0;           // счетчик
        boolean flag = true;

        while (flag) {
            float an = (float) ((1/Math.pow(2, n)) + (1/Math.pow(3, n)));
            if(an >= e) {
                sum +=an;
                n++;
            } else {
                flag = false;
            }
        }

        System.out.println(" Cумма членов ряда sum: " + sum);
        System.out.println(" Количество членов n : " + n);

    }


}
