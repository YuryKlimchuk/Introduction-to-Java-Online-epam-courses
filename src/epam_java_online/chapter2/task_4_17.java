package epam_java_online.chapter2;

public class task_4_17 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №4.17");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дано число. Из него необходимо вычитать суммы цифр, пока не получится нуль. Сколько таких итераций необходимо сделать.");
        System.out.println(" -----------------------------------------------");

        // Генерируем число k
        int k = 2 + (int) (Math.random() * 7) + 250 + (int) (Math.random() * 50);
        //k = 8;
        System.out.println("Заданное число: " + k);

        // Расчет
        int count = 0;
        boolean flag = true;

        while(flag) {
            count++;
            k = k - calcSum(createArrFromNumber(k));
            System.out.println("Интерация №" + count + "; новое значение к = " + k);
            if(k < 10) {
                count++;
                flag = false;
            }
        }

        System.out.println("Количество итераций:" + count);

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

    // Метод считающий суммы элементов массива
    public static int calcSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
