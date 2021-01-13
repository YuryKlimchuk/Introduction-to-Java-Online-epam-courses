package epam_java_online.chapter2;

public class task_1_8 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №1.8");
        System.out.println(" Данна последовательность целых чисел, сформировать новую последователньость выбросив из данной все элементы равные min(a1, a2, ...., an)");
        System.out.println("-----------------------------------------------");

        // Генерируем массив рандомных действительных чисел от -100 до 100
        // Размер массива от 1 до 25 чисел
        int lengthArr = (int) (Math.random() * 25) + 1;
        System.out.println("Длинна массива : " + lengthArr);
        // Инициализация массива, элементы в диапазоне от -10 до +10
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random() * 20 - 10);
        }

        // Вывод данной последовтаельности
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Расчет
        // Определяем наименьший элемент
        int minElement = arr[0];
        for (int i = 1; i < lengthArr; i++) {
            if(arr[i] <= minElement) {
                minElement = arr[i];
            }
        }

        // Определяем количество элементов равных minElement
        int amountMinElem = 0;
        for (int i = 0; i < lengthArr; i++) {
            if(arr[i] == minElement) {
                amountMinElem++;
            }
        }

        // Создаем новую последователньость
        int[] newArr = new int[lengthArr - amountMinElem];
        int index = 0;
        for (int i = 0; i < lengthArr; i++) {
            if(!(arr[i] == minElement)) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // Вывод новой последовтаельности
        for (int i = 0; i < (lengthArr - amountMinElem); i++) {
            System.out.println("newArr[" + i + "] = " + newArr[i]);
        }


    }
}
