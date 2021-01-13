package epam_java_online.chapter2;

public class task_3_7 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №3.7");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Даны две неубывающих последовательности  a, ....; и b, ...... . Требуется указать места в которые необходимо вставить элементы последовательности b, ..... в последовательность a, ....., так чтобы последовательность осталась возврастающей.");
        System.out.println(" -----------------------------------------------");

        // Генерируем последовательности
        // Количество элементов в последовательности А
        int length_A = (int) (Math.random() * 15 + 10);
        System.out.println(" Количество элементов в последовательности А: " + length_A);
        // Количество элементов в последовательности B
        int length_B = (int) (Math.random() * 15 + 10);
        System.out.println(" Количество элементов в последовательности B: " + length_B);

        // Генерируем массив A
        int[] arr_A = new int[length_A];
        for (int i = 0; i < length_A; i++) {
            if(i == 0) {
                arr_A[i] = (int) (Math.random() * 5);
            } else {
                arr_A[i] = arr_A[i-1] + (int) (Math.random() * 3 + 1);
            }
        }

        // Генерируем массив B
        int[] arr_B = new int[length_B];
        for (int i = 0; i < length_B; i++) {
            if(i == 0) {
                arr_B[i] = (int) (Math.random() * 5);
            } else {
                arr_B[i] = arr_B[i-1] + (int) (Math.random() * 3 + 1);
            }
        }

        // Расчет
        // Выводим массив А
        System.out.println(" Последовательность А:");
        for (int i = 0; i < length_A; i++) {
            System.out.print(arr_A[i] + "  ");
        }
        System.out.println(" ");
        System.out.println(" ----------------------------------------------- ");
        // Выводим массив B
        System.out.println(" Последовательность B:");
        for (int i = 0; i < length_B; i++) {
            System.out.print(arr_B[i] + "  ");
        }
        System.out.println(" ");
        System.out.println(" ----------------------------------------------- ");

        // Просчитываем места вставки
        for (int i = 0; i < length_B; i++) {
            for (int j = 0; j < length_A; j++) {
                if(arr_B[i] <= arr_A[j]) {
                    System.out.println("Элемент arr_b[" + i + "] = " + arr_B[i] + ", вставляем на место " + j);
                    break;
                }
                if(j == (length_A-1)) {
                    System.out.println("Элемент arr_b[" + i + "] = " + arr_B[i] + ", вставляем на место " + length_A);
                }
            }

        }



    }
}
