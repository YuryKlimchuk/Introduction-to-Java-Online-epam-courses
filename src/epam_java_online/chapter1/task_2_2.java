package epam_java_online.chapter1;

import java.util.Scanner;

public class task_2_2 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №2.2");
        System.out.println(" Вычислить значение max{min(a,b), min(c,d)}");
        System.out.println("-----------------------------------------------");

        // ввод значений уголов
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();
        System.out.print("c = ");
        float c = sc.nextFloat();
        System.out.print("d = ");
        float d = sc.nextFloat();
        System.out.println("-----------------------------------------------");

        // Вычисление
        if(a <= b) {
            if(c <= d) {
                if(a <= c) {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + c);
                } else {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + a);
                }
            } else {
                if(a <= d) {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + d);
                } else {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + a);
                }
            }
        } else {
            if(c <= d) {
                if(b <= c) {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + c);
                } else {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + b);
                }
            } else {
                if(b <= d) {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + d);
                } else {
                    System.out.println("max{"+"min("+a+","+b+"), min("+c+","+d+")} = " + b);
                }
            }
        }
    }
}
