package epam_java_online.chapter2;

public class task_1_6 {
    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.6");
        System.out.println(" Данна последовательность чисел, найти сумму тех элементов, номера которых являются простыми числами");
        System.out.println("-----------------------------------------------");

        // Генерируем массив рандомных действительных чисел от -100 до 100
        // Размер массива от 3 до 100 чисел
        int lengthArr = (int) (Math.random() * 100) + 3;
        //lengthArr = 7;
        System.out.println("Длинна массива : " + lengthArr);
        // Инициализация массива, элементы в диапазоне от 0 до +100
        float[] arr = new float[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (float) (Math.random() * 101);
        }

        // Расчет
        float sum = arr[2];
        for (int i = 3; i < lengthArr; i++) {
            System.out.println("ИНДЕКС: " + i);
            int k = 2;
            boolean isPrimeNumber = true;
            while (k < i) {
                System.out.println("ДЕЛИТЕЛь: " + k);
                if ((i % k) == 0) {
                    isPrimeNumber = false;
                    break;
                }
                k++;
            }
            if(isPrimeNumber) {
                System.out.println("arr[" + i + "] = " + arr[i] + " - ИНДЕКС ПРОСТОЕ ЧИСЛО");
                sum += arr[i];
                System.out.println("Сумма элементов с индексами кторые простые числа: " + sum);
            } else {
                System.out.println("arr[" + i + "] = " + arr[i] + " - ИНДЕКС <<НЕ ПРОСТОЕ>> ЧИСЛО");
            }
            System.out.println("-----------------------------------------------");
        }

    }
}
