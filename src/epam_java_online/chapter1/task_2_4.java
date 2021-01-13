package epam_java_online.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class task_2_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №2.4");
        System.out.println(" Проверить пройдет ли кирпич с размерами x,y,z в прямоугольное отверстие A,B ?");
        System.out.println("-----------------------------------------------");

        // Ввод значений
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменных");

        System.out.println("Размеры кирпича");
        System.out.print("x = ");
        float x = sc.nextFloat();
        System.out.print("y = ");
        float y = sc.nextFloat();
        System.out.print("z = ");
        float z = sc.nextFloat();

        System.out.print("");
        System.out.println("Размеры отверстия");
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();

        System.out.println("-----------------------------------------------");

        // Проводим проверку пройдет ли кирпич
        // Проверка по грани XY
        if(((a > x) && (b > y)) || ((a > y) && (b > x))) {
            System.out.println("Кирпич проходит в отверстие гранью XY");
        } else {
            System.out.println("Кирпич НЕ ПРОХОДИТ в отверстие гранью XY");
        }
        // Проверка по грани YZ
        if(((a > y) && (b > z)) || ((a > y) && (b > z))) {
            System.out.println("Кирпич проходит в отверстие гранью YZ");
        } else {
            System.out.println("Кирпич НЕ ПРОХОДИТ в отверстие гранью YZ");
        }
        // Проверка по грани XZ
        if(((a > x) && (b > z)) || ((a > x) && (b > z))) {
            System.out.println("Кирпич проходит в отверстие гранью XZ");
        } else {
            System.out.println("Кирпич НЕ ПРОХОДИТ в отверстие гранью XZ");
        }
    }

}
