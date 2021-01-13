package epam_java_online.chapter2;

public class task_4_15 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.15");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Найти все натуральные N-значные числа, которые образуют строго возрастающую последовательность.");
        System.out.println(" -----------------------------------------------");

        // Генерируем число n в диапазоне от 2 до 9.
        int k = 2 + (int) (Math.random() * 7);
        //k = 8;
        System.out.println("Количество цифр в числах: " + k);

        //Расчет
        generateCombinations(k);

        

    }

    //Генератор сочетаний (без повторений) из цифр от 1 до 9, k количество цифр в сочетаний
    public static void generateCombinations(int k) {

        int countOfComb = 0;

        int[] arr = new int[k + 2];
        for (int i = 0; i < k; i++) {
            arr[i] = i;
        }
        arr[k] = 9;
        arr[k+1] = 0;

        for (int i = 0; i < (k + 2); i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
        System.out.println(" -----------------------------------------------");

        for(;;) {
            sortCombAndPrint(arr, k);
            countOfComb++;
            int j = 0;
            for (; arr[j] + 1 == arr[j+1];) {
                arr[j] = j;
                j = j + 1;
            }
            if(j < k) {
                arr[j]++;

            } else {
                System.out.println("Количество сочетаний: " + countOfComb);
                break;
            }

        }


    }

    // Сортировка сочетания по возрастанию, вывод на печать
    public static void sortCombAndPrint(int[] arr, int k) {
        //создаем новый укороченный массив
        /*int[] newArr = new int[N];
        for (int i = 0; i < N; i++) {
            newArr[i] = arr[i];
        }


        // сортируем массив
        int buffer = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < (N - 1); i++) {
                if(newArr[i+1] < newArr[i]) {
                    buffer = newArr[i];
                    newArr[i] = newArr[i+1];
                    newArr[i+1] = buffer;
                    flag = true;
                }
            }
        }
        */
        //выводим готовую последовательность
        for (int i = 0; i < k; i++) {
            System.out.print((arr[i]) + 1);
        }
        System.out.println();

    }


}
