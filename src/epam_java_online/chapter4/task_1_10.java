package epam_java_online.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class task_1_10 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.10");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы," +
                " сет и гет методы. и метод toString(). Создать второй класс, агрегирующий массив типа Airline, " +
                "с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль." +
                "Класс Airline: пунк назначения, номер рейса, тип самолета, время вылета, дни недели." +
                "Найти и вывести: список рейсов для заданого пункта назначения, список рейсов для заданного дня недели," +
                "список рейсов для заданого дня недели, время вылета каторых больше чем заданное.");
        System.out.println(" -----------------------------------------------");

        AirlineAdapter airlineAdapter = new AirlineAdapter(25);
        airlineAdapter.printAirLines();
        System.out.println(" -----------------------------------------------");
        airlineAdapter.findDest("MINSK");
        System.out.println(" -----------------------------------------------");
        airlineAdapter.findDays("WEDNESDAY");
        System.out.println(" -----------------------------------------------");
        airlineAdapter.findDaysAfterTime("SATURDAY", 15, 10);

    }

}

// агрегирующий класс
class AirlineAdapter {

    Airline[] airlines;

    AirlineAdapter(int count) {
        airlines = new Airline[count];
        generateAirlines();
    }

    public void printAirLines() {
        System.out.println(" печать всех рейсов");
        for (Airline airline: airlines) {
            System.out.println(airline.toString());
        }
        System.out.println(" -----------------------------------------------");
    }

    private void generateAirlines() {
        String[] destinations = {"MINSK", "MOSCOW", "BERLIN", "WARSAW", "KIEV", "MILAN"};
        String[] type = {"Suhoi", "Boing", "Aibus"};
        String[] days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        for (int i = 0; i < airlines.length; i++) {
            // Генерируем время
            int[] time = new int[2];
            time[0] = ThreadLocalRandom.current().nextInt(0, 24);
            time[1] = ThreadLocalRandom.current().nextInt(0, 59);

            airlines[i] = new Airline(
                    destinations[ThreadLocalRandom.current().nextInt(0, 6)],
                    1000 + i,
                    type[ThreadLocalRandom.current().nextInt(0, 3)],
                    time,
                    generateDays(days)
            );
        }
    }

    // поиск рейсов по заданному пункту назначения
    public void findDest(String dest) {
        System.out.println(" -----------------------------------------------");
        System.out.println(" Поиск по пункту назаначения - " + dest + "; ");
        for(Airline airline: airlines) {
           if(airline.getDestination().equals(dest)) {
               System.out.println(airline.toString());
           }
        }
    }

    // поиск рейсов в заданный день
    public void findDays(String _day) {
        System.out.println(" -----------------------------------------------");
        System.out.println(" Поиск по Дню - " + _day + "; ");
        for(Airline airline: airlines) {
            for (String day: airline.getDays()) {
                if(day.equals(_day)) {
                    System.out.println(airline.toString());
                    break;
                }
            }
        }
    }

    // поиск рейсов в заданный день после заданного времени
    public void findDaysAfterTime(String _day, int mm, int hh) {
        System.out.println(" -----------------------------------------------");
        System.out.println(" Поиск по Дню - " + _day + "; после времени : " + hh + " : " + mm);
        for(Airline airline: airlines) {
            for (String day: airline.getDays()) {
                if(day.equals(_day)) {
                    if(hh < airline.getTime()[0]) {
                        System.out.println(airline.toString());
                        break;
                    } else if((hh == airline.getTime()[0]) && (mm < airline.getTime()[1])) {
                        System.out.println(airline.toString());
                        break;
                    }
                }
            }
        }
    }

    // Генератор дней недели
    private String[] generateDays(String[] _days) {

        ArrayList<String> daysList = new ArrayList<String>();

        int startIndex = -1;
        int endIndex = 7;

        while(startIndex < (endIndex - 1)) {
            startIndex = ThreadLocalRandom.current().nextInt(startIndex + 1, endIndex);
            daysList.add(_days[startIndex]);
        }

        String[] daysArr = new String[daysList.size()];

        for (int i = 0; i < daysArr.length; i++) {
            daysArr[i] = daysList.get(i);
        }
        return daysArr;
    }
}

class Airline {

    // пункт назначения
    private String destination;

    // номер рейса
    private int flightNumber;

    // тип самолета
    private String planeType;

    // время вылета (0 - элемент часы, 1 - элемент минуты)
    private int[] time = new int[2];

    // Дни недели для отправки
    private String[] days;


    private Airline(){}


    public Airline(String _destination, int _flightNumber, String _planeType, int[] _time, String[] _days) {
        setDestination(_destination);
        setFlightNumber(_flightNumber);
        setPlaneType(_planeType);
        setTime(_time);
        setDays(_days);
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int[] getTime() {
        return time;
    }

    public void setTime(int[] time) {
        this.time = time;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", planeType='" + planeType + '\'' +
                ", time=" + Arrays.toString(time) +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}