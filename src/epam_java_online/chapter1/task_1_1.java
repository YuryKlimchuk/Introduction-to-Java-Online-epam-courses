package epam_java_online.chapter1;

import java.util.Scanner;

/*
    Найти значение функции: z = ((a-3)*b/2)+c
 */
public class task_1_1 {
// добавить проверку введенных значений
    public static void main(String[] args) {

        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №1.1");
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
        float result = ((a-3)*b/2)+c;
        System.out.println("Результат = " + result);

    }

}
