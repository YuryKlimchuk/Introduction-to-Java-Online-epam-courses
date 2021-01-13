package epam_java_online.chapter2;

public class task_4_8 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.8");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дан массив D. Подсчитать суммы D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[5]+D[6]+D[7] ");
        System.out.println(" -----------------------------------------------");

        //Количество элементов в массиве
        int lengthArr = (int) (Math.random() * 5 + 10);

        // Генерируем массив
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random() * 50);
        }

        // Расчет
        // Выводим массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ");
        System.out.println(" ----------------------------------------------- ");

        System.out.println("D[1]+D[2]+D[3] = " + calcSum(arr, 1, 3));
        System.out.println("D[3]+D[4]+D[5] = " + calcSum(arr, 3, 5));
        System.out.println("D[5]+D[6]+D[7] = " + calcSum(arr, 5, 7));


    }

    // Метод считающий сумму последовательных элементов массива от start  до finish
    public static int calcSum(int[] _arr, int start, int finish) {
        if((start < finish) && (finish < _arr.length)) {
            int sum = 0;
            while(start <= finish) {
                sum += _arr[start];
                start++;
            }
            return sum;
        } else return -1;
    }
}
