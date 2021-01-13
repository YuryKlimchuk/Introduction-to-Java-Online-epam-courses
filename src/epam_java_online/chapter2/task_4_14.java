package epam_java_online.chapter2;

public class task_4_14 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.14");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Определить все числа Амстронга в диапазоне от 1 до K.");
        System.out.println(" -----------------------------------------------");

        // генерируем число K
        int K = (int) (Math.random() * 10000 + 25);
        // Выводим границы диапазона проверки
        System.out.println("Диапазон проверки: [" + 1 + ", " + K + "]");

        //Расчет
        for (int i = 1; i < K; i++) {
            if(isAmstrong(i)) {
                System.out.println("Число <" + i + "> является числом Амстронга!");
            }
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

    // Метод считающий сумму чисел в массиве
    public static int calcArrNumberSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], arr.length);
        }
        return sum;
    }

    // метод проверяющий является ли число, числом амстронга
    public static boolean isAmstrong(int num) {
        int numeralSum = calcArrNumberSum(createArrFromNumber(num));
        if(numeralSum == num) {
            return true;
        } else return false;
    }
}
