package epam_java_online.chapter1;

public class task_3_6 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №1, ЗАДАНИЕ №3.6");
        System.out.println(" Вывести символы и их коды в памяти ПК");
        System.out.println("-----------------------------------------------");

        int n = 255;

        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            char ch = (char) i;
            System.out.println("ch = " + ch);

            System.out.println("-----------------------------------------------");
        }
    }
}
