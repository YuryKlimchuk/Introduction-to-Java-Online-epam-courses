package epam_java_online.chapter2;

import utils.Support;

public class task_2_10 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.10");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана матрица квадаратная матрица. Определить положительные элементы главное диоганали.");
        System.out.println(" -----------------------------------------------");


        // Количество столбцов матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);

        // Генерируем матрицу положительных целых числел
        int[][] matrix = Support.generateMatrixInt(columns, columns);


        //Расчет
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                if((j == i) && matrix[i][j] > 0) {
                    System.out.println("Элемент arr[" + i + ", " + j + "] = " + matrix[i][j] + " > 0");
                }
            }
        }
        System.out.println(" -----------------------------------------------");


    }


}
