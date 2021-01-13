package epam_java_online.chapter2;

import utils.Support;

public class task_2_14 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.14");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Сформировать квадратную матрицу MxN. Заполнить нулями и единицами, причем число единиц в столбце равно номеру столбца.");
        System.out.println(" -----------------------------------------------");



        int columns = (int) (Math.random() * 5 + 4);
        int rows = columns + 5;
        int[][] matrix = new int[rows][columns];


        // Расчет
        for (int j = 1; j < columns; j++) {
            int count1 = 0;
            int i = 0;
            while(count1 != j) {
                double random = Math.random();
                //System.out.print(random + "   ");
                if(random < 0.5) {
                    matrix[i][j] = 1;
                    count1++;
                }

                i++;

                if (i == rows) {
                    i =0;
                }
            }

        }
        // Выводим матрицу на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //System.out.print("arr[" + i + ", " + j + "] = " + matrix[i][j] + ";    ");
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println(" ");
        }
        System.out.println(" -----------------------------------------------");


    }

}
