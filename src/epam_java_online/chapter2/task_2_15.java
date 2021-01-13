package epam_java_online.chapter2;

import utils.Support;

public class task_2_15 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.15");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Найти наибольший элемент матрицы, заменить им все нечетные элементы.");
        System.out.println(" -----------------------------------------------");


        // Количество столбцов матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);
        int rows = (int) (Math.random() * 10 + 10);

        // Генерируем матрицу положительных целых числел
        int[][] matrix = Support.generateMatrixInt(rows, columns);


        // Расчет
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j] > matrix[maxRow][maxColumn]) {
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println("Максимальный элемент [" + maxRow + "][" + maxColumn + "] = " + matrix[maxRow][maxColumn]);

        // Производим замену
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if((matrix[i][j]%2) != 0) {
                    matrix[i][j] = matrix[maxRow][maxColumn];
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
