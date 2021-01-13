package epam_java_online.chapter2;

import utils.Support;

public class task_2_11 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.11");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана матрица 10х20. Заполнить ее числами 0 до 15. Вывести на экран саму матрицу и номера строк где число 5 встречается 3 и более раз.");
        System.out.println(" -----------------------------------------------");

        // Генерируем матрицу положительных целых числел
        int rows = 10;
        int columns = 20;
        int[][] matrix = Support.generateMatrixInt0_15(rows, columns);

        //Расчет
        // Выводим матрицу на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                    System.out.print("arr[" + i + ", " + j + "] = " + matrix[i][j] + ";    ");
            }
            System.out.println(" ");
        }
        System.out.println(" -----------------------------------------------");
        // Считаем 5рки
        int count5 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j] == 5) {
                    count5++;
                }
            }
            if (count5 >= 3) {
                System.out.println("В строке №" + i + " 5рка встречается " + count5 + " раз.");
            }
            count5 = 0;
        }

        System.out.println(" -----------------------------------------------");

    }


}
