package epam_java_online.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class task_3_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.4");
        System.out.println(" Вычислить произведение квардратов первых 200 чисел");
        System.out.println("-----------------------------------------------");

        // Ввод значений
        Scanner sc = new Scanner(System.in);

        // Расчет
        BigInteger multi = new BigInteger("1");
        for (long i = 1; i < 201; i++) {

            long sqr = i * i;
            multi = multi.multiply(BigInteger.valueOf(sqr));
            System.out.println("i : " + i);
            System.out.println("sqr : " + sqr);
            System.out.println("multi : " + multi);
        }

        System.out.println("Ответ : " + multi);


    }

}
