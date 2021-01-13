package epam_java_online.chapter2;

import java.util.ArrayList;

public class task_1_9 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.9");
        System.out.println(" Данна последовательность целых чисел, определить наиболее часто встречающееся число в данной последовтаельнсоти, если таких несколько то наименьшее");
        System.out.println("-----------------------------------------------");

        // Генерируем массив рандомных действительных чисел от -100 до 100
        // Размер массива от 1 до 25 чисел
        int lengthArr = (int) (Math.random() * 25) + 1;
        System.out.println("Длинна массива : " + lengthArr);
        // Инициализация массива, элементы в диапазоне от -10 до +10, для хранения используем ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < lengthArr; i++) {
            arr.add((int) (Math.random() * 20 - 10));
        }

    }




}
