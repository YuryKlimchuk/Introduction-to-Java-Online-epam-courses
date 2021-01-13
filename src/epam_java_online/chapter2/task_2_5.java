package epam_java_online.chapter2;

public class task_2_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №2.5");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Сформировать матрицу порядка n по заданому закону. n - четное.");
        System.out.println(" -----------------------------------------------");

        // Количество столбцов и рядов матрицы ( от 10 до 20)
        int n = ((int) (Math.random() * 5 + 5)) * 2;
        System.out.println(" Порядок матрицы n - " + n);

        // Расчет
        int[][] matrix = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                    if((i+j) <= (n+1)) {
                        matrix[i-1][j-1] = i;
                    } else {
                        matrix[i-1][j-1] = 0;
                    }

            }
        }

        // Вывод матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + ";  ");
            }
            System.out.println(" ");
        }


    }


}
