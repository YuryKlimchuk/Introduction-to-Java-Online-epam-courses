package epam_java_online.chapter2;

public class task_1_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.3");
        System.out.println(" Данна последовательность чисел, подсчитать положительные, отрицательные и нулевые значения");
        System.out.println("-----------------------------------------------");

        // Генерируем массив рандомных действительных чисел от -100 до 100
        // Размер массива от 1 до 100 чисел
        int lengthArr = (int) (Math.random() * 100) + 1;
        System.out.println("Длинна массива : " + lengthArr);
        // Инициализация массива, элементы в диапазоне от -100 до +100
        float[] arr = new float[lengthArr];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        for (int i = 3; i < lengthArr; i++) {
            arr[i] = (float) (Math.random() * 201 - 100);
        }

        // инициализация счетчиков
        int negative = 0;
        int positive = 0;
        int zero = 0;

         // Расчет
        for (float n: arr) {
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        // Вывод результата
        System.out.println("Положительных элементов : " + positive);
        System.out.println("Отрицательных элементов : " + negative);
        System.out.println("Нулевых элементов : " + zero);




    }



}
