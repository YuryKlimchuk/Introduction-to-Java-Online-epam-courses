package epam_java_online.chapter2;

public class task_1_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.4");
        System.out.println(" Данна последовательность чисел, поменять местами наибольший и наименьший эемент");
        System.out.println("-----------------------------------------------");

        // Генерируем массив рандомных действительных чисел от -100 до 100
        // Размер массива от 1 до 30 чисел
        int lengthArr = (int) (Math.random() * 30) + 1;
        System.out.println("Длинна массива : " + lengthArr);
        // Инициализация массива, элементы в диапазоне от -100 до +100
        float[] arr = new float[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (float) (Math.random() * 201 - 100);
        }
        // Инициализация вспомогательных перменных
        int maxIndex = 0;
        int minIndex = 0;

        // Расчет
        // Ищем индексы max и min элемнетов
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }


        System.out.println("-----------------------------------------------");
        // Вывод первоначлаьного массива
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Максимальный элемент arr[" + maxIndex + "] = " + arr[maxIndex]);
        System.out.println("Минимальный элемент arr[" + minIndex + "] = " + arr[minIndex]);
        System.out.println("-----------------------------------------------");

        float maxElement = arr[maxIndex];
        float minElement = arr[minIndex];

        arr[maxIndex] = minElement;
        arr[minIndex] = maxElement;

        // Вывод обновленого массива
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arrNew[" + i + "] = " + arr[i]);
        }

    }
}
