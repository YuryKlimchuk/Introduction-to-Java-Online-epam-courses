package epam_java_online.chapter2;

public class task_4_7 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.7");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Найти сумму факториалов нечетных числе от 1 до 9");
        System.out.println(" -----------------------------------------------");

        // Расчет
        int tmp = 0;
        for (int i = 1; i <= 9; i = i + 2) {
            //System.out.println("i = " + i);
            //System.out.println("tmp = " + tmp);
            //System.out.println(i + "! = " + calcFactorial(i));
            //System.out.println(" -----------------------------------------------");
            tmp = tmp + calcFactorial(i);

        }

        //Вывод результата
        System.out.println("Сумма факториалов ничетных чисел от 1 до 9, равна - " + tmp);



    }

    // Метод нахождения факториала
    public static int calcFactorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }


}
