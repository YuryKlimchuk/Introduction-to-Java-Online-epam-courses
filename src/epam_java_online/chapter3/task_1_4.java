package epam_java_online.chapter3;

public class task_1_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №3, ЗАДАНИЕ №1.4");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Подсчитать покличество чисел в строке.");
        System.out.println(" -----------------------------------------------");

        // Задаем данную строку
        String str = "23/06/1989. hello world!    the world is mine. 666 + 333 =   999. world world. 555 123456789";

        // определяем число чисел
        int count = 0;
        int index = 0;
        boolean flag1 = true;

        while(flag1) {
            char ch = str.charAt(index);
            if(Character.isDigit(ch)) {
                count++;
                boolean flag2 = true;
                while(flag2) {
                    index++;
                    if(str.length() == index) {
                        flag1 = false;
                        flag2 = false;
                    } else if(!Character.isDigit(str.charAt(index))) {
                        flag2 = false;
                    }
                }

            } else {
                index++;
                if(str.length() == index) {
                    flag1 = false;
                }
            }

        }

        //Вывод результатов
        System.out.println("Количество чисел в строке: " + count);


    }

}
