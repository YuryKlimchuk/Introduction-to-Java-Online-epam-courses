package epam_java_online.chapter1;

import java.util.Scanner;

public class task_1_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число секунд:");

        System.out.print(" T = ");
        int t = sc.nextInt();
        System.out.println("-----------------------------------------------");

        int hours = (int) t/3600;
        int minutes = (int) ((t - (hours*3600))/60);
        int seconds = (int) (t - (hours*3600) - minutes*60);

        // расчет и вывод результата

        System.out.println("Прошло: часов - " + hours +"; минут - " + minutes + "; секунд - " + seconds);

    }


}
