package epam_java_online.chapter2;

import utils.Support;

public class task_2_9 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.9");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана матрица неотрицательных чисел. Подсчитать сумму элементов в каждом столбике. Определить номер столбика где наибольшая сумма.");
        System.out.println(" -----------------------------------------------");


        // Количество столбцов матрицы ( от 10 до 20)
        int columns = (int) (Math.random() * 10 + 10);
        // Количество строк матрицы
        int rows = (int) (Math.random() * 10 + 10);
        // Генерируем матрицу положительных целых числел
        int[][] matrix = Support.generateMatrixInt(rows, columns);

        // Расчет
        int buffer = 0;
        int sum = 0;
        int numColumn = 0;

        for (int j = 0; j < columns; j++) {
            sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            if(sum > buffer) {
                buffer = sum;
                numColumn = j;
            }

            System.out.println(" Стобец: " + j + "; Сумма элементов столбца: " + sum);
            
        }

        System.out.println(" Номер столбца с max суммой: " + numColumn);

    }

}
