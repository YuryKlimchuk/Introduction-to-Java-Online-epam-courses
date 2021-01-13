package epam_java_online.chapter2;

import utils.Support;

public class task_2_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Данна матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
        System.out.println(" -----------------------------------------------");

        // Количество столбцов матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);
        // Количество строк матрицы
        int rows = (int) (Math.random() * 10 + 10);
        // Генерируем матрицу положительных целых числел
        int[][] matrix = Support.generateMatrixInt(rows, columns);
        

        // Расчет
        for (int i = 0; i < rows; i = i + 2) {
            if(matrix[i][0] > matrix[i][columns - 1]) {
                System.out.println("Номер столбца - " + i);
                for (int j = 0; j < columns; j++) {
                    System.out.println("ARR[" + i + ", " + j + "] = " + matrix[i][j]);
                }
            }
        }

    }
}
