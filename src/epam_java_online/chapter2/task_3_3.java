package epam_java_online.chapter2;

public class task_3_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №3.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана последовательность a1<=a2<=a3 ... <=an. Расположить элементы по убыванию. Использовать сортировку выбором.");
        System.out.println(" -----------------------------------------------");


        //Количество элементов в массиве
        // Количество столбцов матрицы ( от 10 до 20)
        int lengthArr = (int) (Math.random() * 10 + 10);

        // Генерируем массив
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = i+1;
        }

        // Расчет
        // Выводим массив до сортировки
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(" -----------------------------------------------");
        int indexMax = 0;
        int buffer = 0;
        for (int j = 0; j < (lengthArr - 1); j++) {
            for (int i = j; i <lengthArr; i++) {
                if(arr[i] > arr[indexMax]) {
                    indexMax = i;
                }
            }
            buffer = arr[j];
            arr[j] = arr[indexMax];
            arr[indexMax] = buffer;
        }

        // Выводим обновленный массив
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }


}
