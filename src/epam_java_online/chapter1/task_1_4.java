package epam_java_online.chapter1;

import java.util.Scanner;

public class task_1_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №1.4");
        System.out.println(" Вычислить значение выражения : ((a-3)*b/2)+c");
        System.out.println("-----------------------------------------------");

        // ввод значений переменных
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите действительное число в формате XXX.YYY");

        System.out.print(" xxx.yyy = ");
        float x = sc.nextFloat();
        System.out.println("-----------------------------------------------");

        // расчет и вывод результата
        int xxx = (int) x;                  // Целая часть
        int yyy = (int) (1000*(x - xxx));   // Дробная часть
        System.out.println("Целая часть: " + xxx);
        System.out.println("Дробная часть: " + yyy);

        float result = ((float) xxx/1000) + yyy;       // Расчет преобразованного числа

        System.out.println("Результат = " + result);

    }



}
