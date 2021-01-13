package epam_java_online.chapter4;

import java.util.Arrays;

public class task_1_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.4");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. " +
                "Создать массив из 5 элементов типа Train. " +
                "Создать метод сортировки массива по номерам поезда. Метод вывода информации о поезде по введеному номеру. " +
                "Сортировка массива по пункту назначения, причем поезда с одинаковым пунктом назначения упорядочить по времени отправления.");
        System.out.println(" -----------------------------------------------");

        // Создаем массив элементов Train
        Train[] trains = new Train[5];

        String[] destinations = {
                "MINSK",
                "BREST",
                "MOSCOW"
        };
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train(
                    destinations[(int) (Math.random() * 3)],
                    2 * trains.length - i,
                    (int) (Math.random() * 24),
                    (int) (Math.random() * 60)
            );

        }
        // Вывод первоначального массива
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
        System.out.println(" -----------------------------------------------");

        // сортируем по Номеру
        System.out.println(" Сортировка по номеру");
        sortTrainsByNumber(trains);
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
        System.out.println(" -----------------------------------------------");
        // сортируем по имени пункта прибытия
        System.out.println(" Сортировка по месту прибытия");
        sortTrainByDestination(trains);
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
        System.out.println(" -----------------------------------------------");
        printTrainInfo(8, trains);
        printTrainInfo(55, trains);
        System.out.println(" -----------------------------------------------");
    }

    // сортировка массива по номеру поезда
    public static void sortTrainsByNumber(Train[] _trains) {
        Train buffer;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < (_trains.length - 1); i++) {
                if(_trains[i+1].trainNumber < _trains[i].trainNumber) {
                    buffer = _trains[i];
                    _trains[i] = _trains[i+1];
                    _trains[i+1] = buffer;
                    flag = true;
                }
            }
        }
    }

    // Сортировка по пунктуназначения и по времени отправки
    public static void sortTrainByDestination(Train[] _trains) {

        for (int i = 0; i < _trains.length; i++) {

            for (int j = i + 1 ; j < _trains.length; j++) {
                Train buffer;
                if (_trains[j].destinationName.compareTo(_trains[i].destinationName) < 0) {
                    buffer = _trains[i];
                    _trains[i] = _trains[j];
                    _trains[j] = buffer;
                } else if(_trains[j].destinationName.compareTo(_trains[i].destinationName) == 0) {
                    if(_trains[j].dispatchTime[0] < _trains[i].dispatchTime[0]) {
                        buffer = _trains[i];
                        _trains[i] = _trains[j];
                        _trains[j] = buffer;
                    } else if(_trains[j].dispatchTime[0] == _trains[i].dispatchTime[0]) {
                        if(_trains[j].dispatchTime[1] < _trains[i].dispatchTime[1]) {
                            buffer = _trains[i];
                            _trains[i] = _trains[j];
                            _trains[j] = buffer;
                        }
                    }
                }
            }
            
        }
        
    }


    // вывод инфы о поезде по номеру
    public static void printTrainInfo(int _trainNum, Train[] trains) {
        for (Train train: trains) {
            if(train.trainNumber == _trainNum) {
                System.out.println(train);
                return;
            }
        }
        System.out.println("Такого номера поезда нет");
    }
}


class Train {

    // Название пункта назначения
    String destinationName;

    // Номер поезда
    int trainNumber;

    // Время отправки, 0 элемент - часы, 1 элемент - минуты
    int[] dispatchTime = new int[2];

    public Train(String _destinationName, int  _trainNumber, int hh, int mm) {
        this.destinationName = _destinationName;
        this.trainNumber = _trainNumber;
        this.dispatchTime[0] = hh;
        this.dispatchTime[1] = mm;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destinationName='" + destinationName + '\'' +
                ", trainNumber=" + trainNumber +
                ", dispatchTime=" + Arrays.toString(dispatchTime) +
                '}';
    }
}
