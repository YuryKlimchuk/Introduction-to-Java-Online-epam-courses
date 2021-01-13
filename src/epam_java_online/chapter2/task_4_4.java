package epam_java_online.chapter2;

public class task_4_4 {



    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.4");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Даны координаты N точек, найти пару точек между которыми наименьшее растояние");
        System.out.println(" -----------------------------------------------");

        // Количество точек
        int N = (int) (Math.random() * 20 + 15);

        // Массив с коориднатами (X - нулевая строка, Y - первая строка)
        double[][] positions = new double[2][N];
        // Генерируем массив точек
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                positions[i][j] = Math.random() * 20;
            }
        }
        // Выводим масив точек
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(positions[i][j] + "    ");
            }
            System.out.println(" ");
        }

        //Расчет растоянний
        double tmpDist  = 10000;
        int tmpPoint1 = 0;
        int tmpPoint2 = 0;
        for (int i = 0; i < N; i++) {

            for (int j = i+1; j < (N-1); j++) {
                double distance =
                        calcDistance(
                            positions[0][i],
                            positions[0][j],
                            positions[1][i],
                            positions[1][j]
                        );
                if(distance < tmpDist) {
                    tmpDist = distance;
                    tmpPoint1 = i;
                    tmpPoint2 = j;
                }
            }

        }

        // Выводим результат
        System.out.println("Наименьшее растояние d = " + tmpDist);
        System.out.println("Между точками P1(" + positions[0][tmpPoint1] + ", " + positions[1][tmpPoint1] + "); P2("+ positions[0][tmpPoint2] + ", " + positions[1][tmpPoint2] + ")");


        
    }

    // Метод для расчета растоянния между двумя точками
    public static double calcDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(
          Math.pow((x1-x2),2) + Math.pow((y1-y2),2)
        );
    }

}
