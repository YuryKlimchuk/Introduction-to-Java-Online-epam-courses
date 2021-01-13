package epam_java_online.chapter2;

public class task_3_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №2, ЗАДАНИЕ №3.5");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Дана последовательность. Отростировать по возрастанию. Метод вставок. Вставку осуществлять двоичным поиском, поиск оформить ввиде отдельной функции.");
        System.out.println(" -----------------------------------------------");


        //Количество элементов в массиве
        // Количество столбцов матрицы ( от 10 до 30)
        int lengthArr = (int) (Math.random() * 10 + 20);

        // Генерируем массив
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = (int) (Math.random() * 50);
        }

        // Расчет
        // Выводим массив ДО сортировки
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(" -----------------------------------------------");


        /*
        // Сортировка простыми вставками
        for (int i = 1; i < lengthArr; i++) {
            boolean flag = true;
            int index = i;
            while(flag) {
                if(arr[index] < arr[index-1]) {
                    int buffer = arr[index-1];
                    arr[index-1] = arr[index];
                    arr[index] = buffer;
                    index--;
                    if(index == 0) {
                        flag = false;
                    }
                } else {
                    flag = false;
                }
            }
        }
        */

        // Сортировка вставками с двоичным поиском
        for (int i = 1; i < lengthArr; i++) {
            int indexForInsert = binarySearch(arr, arr[i], 0, i-1);
            int buffer = arr[i];

            for (int j = i; j > indexForInsert ; j--) {
                arr[j] = arr[j-1];
            }
            arr[indexForInsert] = buffer;

        }


        // Выводим массив ПОСЛЕ сортировки
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println(" -----------------------------------------------");



    }

    public static int binarySearch(int[] _arrForSearch, int _elementForSearch, int _startPos, int _endPos) {

        //System.out.println("startPos = " + _startPos);
        //System.out.println("endPos = " + _endPos);

        if(_startPos >= _endPos) {
            if(_elementForSearch > _arrForSearch[_startPos]) {
                return _startPos+1;
            } else {
                return _startPos;
            }
        }

        int _midPos = (_endPos - _startPos)/2 + _startPos;
        //System.out.println("binarySearch, mid = " + _midPos);

        if(_elementForSearch == _arrForSearch[_midPos])
            return _midPos+1;

        if(_elementForSearch > _arrForSearch[_midPos]) {
            return binarySearch(_arrForSearch, _elementForSearch, _midPos+1, _endPos);
        } else {
            return binarySearch(_arrForSearch, _elementForSearch, _startPos, _midPos-1);
        }

    }

    /*
    public static int findPosition(int[] nums, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    */



}
