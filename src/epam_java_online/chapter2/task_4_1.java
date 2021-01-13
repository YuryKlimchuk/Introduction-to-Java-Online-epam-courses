package epam_java_online.chapter2;

import java.util.ArrayList;

public class task_4_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Найти НОК двух чисел");
        System.out.println(" -----------------------------------------------");

        // Генерируем исходные данные
        int A =(int) (Math.random() * 30 + 5);
        int B =(int) (Math.random() * 20 + 15);

        System.out.println("A = " + A);
        System.out.println("B = " + B);

        //System.out.println("GCD = " + gcd(A, B));
        System.out.println("Evklid NOD = " + evklidMethod(A, B));
        System.out.println("HOK = " + A*B/evklidMethod(A, B));






    }
/*
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
*/
    // Алгорит нахождения НОД по Эвклиду
    public static int evklidMethod(int a, int b) {

        // если числа равны то люое из чисел и есть НОД
        if(a == b) {
            return a;
        } else if(a > b) {
            int buffer = b;
            b = a;
            a = buffer;
        }

        return evklidMethod(a, b-a);

    }
}
