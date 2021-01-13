package epam_java_online.chapter2;

import utils.Support;

public class task_2_8 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.8");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана матрица. Поменять в ней два столбца местами.");
        System.out.println(" -----------------------------------------------");


        // Количество столбцов матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);
        // Количество строк матрицы
        int rows = (int) (Math.random() * 10 + 10);
        // Генерируем матрицу положительных целых числел
        int[][] matrix = Support.generateMatrixInt(rows, columns);

        // Выберем номера стобцов для замены
        int column1 = (int) (Math.random() * columns);
        int column2;
        do {
            column2 = (int) (Math.random() * columns);
        } while (column1 == column2);

        System.out.println("Первый столбец под замену: " +column1);
        System.out.println("Второй столбец под замену: " +column2);
        System.out.println(" -----------------------------------------------");

        // Расчет
        System.out.println("Матрица ДО замены:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + ";  ");
            }
            System.out.println(" ");
        }
        System.out.println(" -----------------------------------------------");
        for (int i = 0; i < rows; i++) {
            int buffer = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = buffer;
        }
        System.out.println("Матрица ПОСЛЕ замены:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + ";  ");
            }
            System.out.println(" ");
        }

    }

}
