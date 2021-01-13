package epam_java_online.chapter5;

import java.util.ArrayList;

public class task_1_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №5, ЗАДАНИЕ №1.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Calendar с внутренним классом, " +
                "с помощью можно хранить информацию о выходных и празничных днях.");

        Calendar calendar = new Calendar();
        calendar.addDay(31, 1, "Вторник", "Новый год");
        calendar.addDay(23, 2, "Чертверг", "ДР");
        calendar.addDay(9, 2, "Среда", "Хороший день");

        calendar.printDays();
    }
}


class Calendar {

    class Day{

        // число
        int date;

        // тип дня: 1 - выходной, 2 - праздничный.
        int day;

        // День недели
        String weekDay;

        // описание дня
        String description;

        public Day(int date, int day, String weekDay, String description) {
            this.date = date;
            this.day = day;
            this.weekDay = weekDay;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Число - " + this.date + "; день недели - " + this.weekDay + "; тип - " +
                    ((this.day == 1) ? "Выходной." : "Праздничный.") +System.lineSeparator() + "Описание - " + this.description;
        }
    }

    ArrayList<Day> days = new ArrayList<Day>();

    // добавить день
    public void addDay(int date, int day, String weekDay, String description) {
        days.add(new Day(date, day, weekDay, description));
    }

    // печать всех дней
    public void printDays() {
        for (Day day: days) {
            System.out.println(day.toString());
        }
    }
}
