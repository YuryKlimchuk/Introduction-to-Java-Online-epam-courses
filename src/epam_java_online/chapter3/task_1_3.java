package epam_java_online.chapter3;

public class task_1_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №3, ЗАДАНИЕ №1.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Подсчитать покличество цифр в строке.");
        System.out.println(" -----------------------------------------------");

        // Задаем данную строку
        String str = "23/06/1989. hello world!    the world is mine. 666 + 333 =   999. world world. 555 123456789";

        // определяем число цифр
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        //Вывод результатов
        System.out.println("Количество цифр в строке: " + count);

    }
}
