package epam_java_online.chapter2;

import javax.imageio.ImageTranscoder;

public class task_2_7 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.7");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Сформировать квадратную матрицу порядка n по правилу. Подсчитать количество отрицательных элементов в ней");
        System.out.println(" -----------------------------------------------");

        // Количество столбцов и рядов матрицы ( от 10 до 20)
        int n = (int) (Math.random() * 10 + 10);
        System.out.println(" Порядок матрицы n - " + n);
        double[][] matrix = new double[n][n];
        // Количество положительных элементов
        int count = 0;
        // Расчет
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i-1][j-1] = Math.sin((i*i - j*j)/n);
                if (matrix[i-1][j-1] > 0) {
                    count++;
                }
            }
        }

        System.out.println("Количество положительных элементов: " + count);

    }
}
