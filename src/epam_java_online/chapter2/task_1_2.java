package epam_java_online.chapter2;

public class task_1_2 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.2");
        System.out.println(" Данна последовательность чисел, заменить все числа которые больше данного Z данным числом Z, подсчитать количество замен");
        System.out.println("-----------------------------------------------");


        // Генерируем массив рандомных действительных чисел
        // Размер массива от 1 до 100 чисел
        int lengthArr = (int) (Math.random() * 100) + 1;
        System.out.println("Длинна массива : " + lengthArr);

        // Инициализация массива, элементы в диапазоне от -100 до +100
        float[] arr = new float[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (float) (Math.random() * 201 - 100);
        }

        // Генерируем рандомное число  Z в диапазоне от -100 до +100
        float z = (float) (Math.random() * 201 - 100);
        System.out.println("Заданное число Z : " + z);
        System.out.println("-----------------------------------------------");

        // Инициализация счетчика замен
        int count = 0;

        // Расчет
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }



        // Вывод результатов
        System.out.println("Количество замен: " + count);

        // Вывод обновленого массива
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        
    }
}
