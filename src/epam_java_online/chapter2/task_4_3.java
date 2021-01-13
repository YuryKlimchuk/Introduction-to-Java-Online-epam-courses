package epam_java_online.chapter2;

public class task_4_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Найди площадь правильного шестиугольника со стороной a, через площадь треугольника");
        System.out.println(" -----------------------------------------------");

        // Строна шестиугольника
        double a = (Math.random() * 30 + 5);

        // Площадь шестиугольника
        double s6 = 6 * a;

        // Вывод на консоль
        System.out.println("Сторона шестеугольника a = " + a);
        System.out.println("Площадь шестеугольника s = " + s6);

    }




    // метод нахождения площади равносторонненго треугольника
    public static double triangleArea(double _a) {
        return (Math.sqrt(3)/4) * Math.pow(_a, 2);
    }


}
