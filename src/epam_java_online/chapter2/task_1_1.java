package epam_java_online.chapter2;

import java.util.Scanner;

public class task_1_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №3.8");
        System.out.println(" Даны два числа, определить числа которые входит в первое и второе число");
        System.out.println("-----------------------------------------------");

        // Ввод данных
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Введите значение переменных");

        /*
        System.out.print("Первое число A = ");
        int A = sc.nextInt();
        System.out.print("Второе число B = ");
        int B = sc.nextInt();
        */

        // Размер массива
        int lengthArr = (int) (Math.random() * 100);
        System.out.println("Длинна массива : " + lengthArr);

        // делитель
        int k = (int) (Math.random()/5 * 100);
        System.out.println("Делитель k : " + k);

        // Инициализация массива
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        int sum = 0;

        //расчет елементов кратных k
        for(int i = 0; i < arr.length; i++) {
            if((arr[i]%k) == 0) {
                System.out.println("arr[" + i + "] = " + arr[i] + " кратно " + k);
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов : " + sum);

    }



}
