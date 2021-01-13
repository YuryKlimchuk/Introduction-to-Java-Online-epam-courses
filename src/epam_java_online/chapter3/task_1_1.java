package epam_java_online.chapter3;

public class task_1_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №3, ЗАДАНИЕ №1.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дан массив с именами переменных в camelCase, перемести их в snake_case.");
        System.out.println(" -----------------------------------------------");

        String[] variables = new String[]{
                "nameEnemy",
                "arrNames",
                "arrSpeeds",
                "nameStreets",
                "countMoney"};

        // Вывод значений переменных до форматирования
        for (String str: variables) {
            System.out.println(str);
        }

        // Форматирование
        for (int j = 0; j < variables.length; j++) {
            for (int i = 0; i < variables[j].length(); i++) {
                if(Character.isUpperCase(variables[j].charAt(i))) {
                    variables[j] = addChar(variables[j], i);
                }
            }
        }

        // Вывод значений переменных ПОСЛЕ форматирования
        System.out.println(" -----------------------------------------------");
        for (String str: variables) {
            System.out.println(str);
        }


    }

    // метод дабавления символа "_" в заданную позицию
    public static String addChar(String str, int position) {
        char ch = '_';
        int strLength = str.length();
        char[]newArr = new char[strLength + 1];
        str.getChars(0, position, newArr, 0);
        newArr[position]= ch;
        str.getChars(position, strLength, newArr, position + 1);
        newArr[position + 1] = Character.toLowerCase(newArr[position+1]);
        return new String(newArr);
    }

}
