package epam_java_online.chapter2;

public class task_3_6 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №3.6");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана последовательность. Отростировать по возрастанию. Метод Шелла.");
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
        // Выводим массив ДО сортировки
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(" -----------------------------------------------");


        // Сортировка Шелла
        int index = 0;
        while (index < (arr.length - 1)) {
            if(arr[index] <= arr[index+1]) {
                index++;
            } else {
                int buffer = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = buffer;
                if(index > 0) {
                    index--;
                }
            }
        }

        
        // Выводим массив ПОСЛЕ сортировки
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(" -----------------------------------------------");


    }

}
