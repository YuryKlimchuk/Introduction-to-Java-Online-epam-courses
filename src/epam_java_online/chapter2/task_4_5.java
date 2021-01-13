package epam_java_online.chapter2;

public class task_4_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.5");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Найти Второе по виличение число в массиве и вывести его на печать");
        System.out.println(" -----------------------------------------------");


        //Количество элементов в массиве
        // Количество столбцов матрицы ( от 10 до 30)
        int lengthArr = (int) (Math.random() * 10 + 20);

        // Генерируем массив
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random() * 50);
        }


        // Расчет
        // Выводим массив
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        // Находим максимальный элемент
        int maxIndex = findMaxElement(arr);

        // меняем максимальный элемент на 0, и сохраняем в буфер max элемент
        int buffer = arr[maxIndex];
        arr[maxIndex] = 0;

        // Проверка на случай если максимальных элемнетов несколько
        boolean flag = true;
        do {

            maxIndex = findMaxElement(arr);
            if(arr[maxIndex] == buffer) {
                arr[maxIndex] = 0;
            } else {
                flag = false;
            }

        } while (flag);

        System.out.println(" Втрой по величине элемнет массива arr[" + maxIndex + "] = " + arr[maxIndex]);


    }

    // Метод нахождения максимального элемента (сортировка выбором)
    public static int findMaxElement(int[] arr) {
        int indexMax = 0;
        int buffer = 0;
        for (int j = 0; j < (arr.length - 1); j++) {
            for (int i = j; i <arr.length; i++) {
                if(arr[i] > arr[indexMax]) {
                    indexMax = i;
                }
            }
            buffer = arr[j];
            arr[j] = arr[indexMax];
            arr[indexMax] = buffer;
        }
        return indexMax;
    }

}
