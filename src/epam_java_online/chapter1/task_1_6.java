package epam_java_online.chapter1;

import java.util.Scanner;

public class task_1_6 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №1.6");
        System.out.println(" Провериь принадлежит ли точка с координатами (x,y) заданной области");
        System.out.println("-----------------------------------------------");

        // Координаты границ зоны
        float y_max = 4.0f;
        float y_min = -3.0f;
        float y_mid = 0f;

        float x_max = 4.0f;
        float x_mid_max = 2.0f;

        float x_min = -4.0f;
        float x_mid_min = -2.0f;
        //--------------------------------------------------------------

        // ввод координат точки (x,y)
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите координаты точки (x,y)");

        System.out.print(" x = ");
        float x = sc.nextFloat();
        System.out.print(" y = ");
        float y = sc.nextFloat();
        System.out.println("-----------------------------------------------");

        // проверка точки
        // проверяем пренадлежит ли большему прямоугольнику
        boolean first_cond = (x<=x_max) && (x>=x_min) && (y<=y_max) && (y>=y_min);
        System.out.println("Находитьсяли точка в большем прямоугольнике: " + first_cond);
        // проверям что точка не находиться в левом прямоугольнике
        boolean second_cond = !((x<=x_max) && (x>=x_mid_max) && (y<=y_max) && (y>=y_mid));
        System.out.println("Не находитьсяли точка в левом прямоугольнике: " + second_cond);
        // проверям что точка не находиться в левом прямоугольнике
        boolean third_cond = !((x<=x_mid_min) && (x>=x_min) && (y<=y_max) && (y>=y_mid));
        System.out.println("Не находитьсяли точка в правом прямоугольнике: " + third_cond);
        // выводим пренадлижит ли точка области?
        System.out.println("Находится ли точка в заданной области: " + (first_cond && second_cond && third_cond));
    }
}
