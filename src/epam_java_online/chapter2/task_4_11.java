package epam_java_online.chapter2;

public class task_4_11 {
    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.11");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Даны два числа. Определить в каком числе больше цифр.");
        System.out.println(" -----------------------------------------------");

        // генерируем числа
        int A = (int) Math.pow(10, Math.random() * 10);
        int B = (int) Math.pow(10, Math.random() * 10);

        // Выводим числа
        System.out.println("Первое число А = " + A);
        System.out.println("Второе число B = " + B);

        // определяем количество цифр в каждом числе
        int A1 = calcNumeralCount(A);
        int B1 = calcNumeralCount(B);

        if(A1 > B1) {
            System.out.println("Цифр больше в первом числе");
        } else if(A1 < B1) {
            System.out.println("Цифр больше во втором числе");
        } else {
            System.out.println("Цифр в числах равное количество");
        }
    }


    // Метод определяющий количество цифр в данной числе
    public static int calcNumeralCount(int number) {
        int count = 1;
        while(((int) number / 10) > 0) {
            number = number/10;
            count++;
        }
        return count;
    }
}
