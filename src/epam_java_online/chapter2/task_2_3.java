package epam_java_online.chapter2;

import utils.Support;

public class task_2_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Данна матрица. Вывести k-ую строку, p-ый столбец.");
        System.out.println(" -----------------------------------------------");

        // Количество столбцов матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);
        // Количество строк матрицы
        int rows = (int) (Math.random() * 10 + 10);
        // Генерируем матрицу положительных целых числел
        int[][] matrix = Support.generateMatrixInt(rows, columns);

        int k = (int) (Math.random() * rows);
        int p = (int) (Math.random() * columns);

        // Расчет
        // Выводим k строку
        System.out.println("Строка №" + k);
        for (int i = 0; i < columns; i++) {
            System.out.println("ARR[" + k + ", " + i + "] = " + matrix[k][i]);
        }
        System.out.println(" -----------------------------------------------");
        // Выводим p стобец
        System.out.println("Столбец №" + p);
        for (int i = 0; i < rows; i++) {
            System.out.println("ARR[" + i + ", " + p + "] = " + matrix[i][p]);
        }



    }

}
