package epam_java_online.chapter2;

public class task_1_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.5");
        System.out.println(" Данна последовательность чисел, вывести напечать те числа для которых i < ai");
        System.out.println("-----------------------------------------------");

        // Генерируем массив рандомных натуральных чисел от 1 до 100
        // Размер массива от 1 до 100 чисел
        int lengthArr = (int) (Math.random() * 100) + 1;
        System.out.println("Длинна массива : " + lengthArr);
        // Инициализация массива, элементы в диапазоне от 1 до +100
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        // Расчет
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] > i) {
                System.out.println("Для элемента arr[" + i + "] = " + arr[i] + "; значение элемента больше его индекса");
            }
        }


    }

}
