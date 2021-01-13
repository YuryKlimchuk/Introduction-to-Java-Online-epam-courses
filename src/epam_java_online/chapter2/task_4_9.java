package epam_java_online.chapter2;

public class task_4_9 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.9");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Даны строны четырех угольника. Найти площадь?");
        System.out.println(" -----------------------------------------------");

        // Задаем значение сторон
        int X = (int) (Math.random() * 5 + 10);
        int Y = (int) (Math.random() * 5 + 15);
        int Z = (int) (Math.random() * 5 + 20);
        int T = (int) (Math.random() * 5 + 25);

        // Расчет
        System.out.println("Площадь четырех угольника S4 = " + calcArea(X, Y, Z, T));

    }

    // Расчет полупириметра четырехугольника
    public static double calcHalfPerimeter(int x, int y, int z, int t) {
        return 0.5 * (x + y + z + t);
    }

    // Расчет площади четырехугольника
    public static double calcArea(int x, int y, int z, int t) {
        double halfPerimeter = calcHalfPerimeter(x, y, z, t);
        return Math.sqrt(
                (halfPerimeter - x) *
                (halfPerimeter - y) *
                (halfPerimeter - z) *
                (halfPerimeter - t)
        );
    }

}
