package epam_java_online.chapter2;

public class task_4_10 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.10");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дано число N. Создать массив который состоит из цифр числа N.");
        System.out.println(" -----------------------------------------------");

        // генерируем число N
        int N = (int) (Math.random() * 5 + 104500 + Math.random() * 5);

        // Расчет
        System.out.println("Число N = " + N + "; Количество цифр - " + calcNumeralCount(N));
        int[] arr = createArrFromNumber(N);
        // Выводим массив
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
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

    // Метод записывающий в масив цифры
    public static int[] createArrFromNumber(int number) {
        int countNumeral = calcNumeralCount(number);
        int[] arr = new int[countNumeral];

        for (int i = (countNumeral-1); i >= 0 ; i--) {
            arr[(countNumeral-1)-i] = (int) (number/Math.pow(10, i));
            number = (int) (number - arr[(countNumeral-1)-i]*Math.pow(10, i));
        }
        return arr;
    }

}
