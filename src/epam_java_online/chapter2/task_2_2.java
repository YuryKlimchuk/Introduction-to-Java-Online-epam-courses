package epam_java_online.chapter2;

import utils.Support;

public class task_2_2 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.2");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Данна квадратная матрица. Вывести на экран все элементы стоящие на диоганали.");
        System.out.println(" -----------------------------------------------");

        // Количество столбцов и строк матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);
        // Количество строк матрицы
        int[][] matrix = Support.generateMatrixInt(columns, columns);


        // Расчет
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                if(i==j) {
                    System.out.println("ARR[" + i + ", " + j + "] = " + matrix[i][j]);
                }
            }
        }

    }

}
