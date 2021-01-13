package epam_java_online.chapter2;

public class task_3_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №3.4");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана последовательность a1<=a2<=a3 ... <=an. Расположить элементы по убыванию. Использовать сортировку обменами.");
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

        int buffer = 0;
        boolean flag = true;
        int replace_amount = 0; // счетчик перестановок
        while (flag) {
            flag = false;
            for (int i = 0; i < (lengthArr - 1); i++) {
                if(arr[i+1] > arr[i]) {
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                    flag = true;
                    replace_amount++;
                }
            }
        }

        
        // Выводим обновленный массив
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("Количество перестановок: " + replace_amount);

    }


}
