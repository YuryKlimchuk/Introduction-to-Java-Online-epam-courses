package epam_java_online.chapter4;

public class task_1_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.5");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне." +
                "Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, " +
                "и метод позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.");
        System.out.println(" -----------------------------------------------");

        Timer timer1 = new Timer();
        Timer timer2 = new Timer(50, 62, 80);

        for (int i = 0; i < 50; i++) {
            timer1.inc();
            timer2.dec();
            System.out.println("Значение тайметра 1 : " + timer1.getValue());
            System.out.println("Значение тайметра 2 : " + timer2.getValue());
            System.out.println(" - ");
        }


    }

}


class Timer {

    //Текущее значение
    private int currentValue;

    // Минимальное значение
    private int lowLimit;

    // Максимальное значение
    private int highLimit;

    Timer() {
        this.currentValue = 0;
        this.lowLimit = 0;
        this.highLimit = 40;
    }

    Timer(int _currentValue, int _lowLimit, int _highLimit) {
        this.currentValue = _currentValue;
        // если текущее значение не соответствует заданным границам, то устанавливаем границы равные текущему значению
        this.lowLimit = (_lowLimit > this.currentValue) ? this.currentValue : _lowLimit;
        this.highLimit = (_highLimit < this.currentValue) ? this.currentValue : _highLimit;

    }

    // методов инкремирующий таймер
    public void inc() {
        this.currentValue++;
        if(this.currentValue > this.highLimit) this.currentValue = this.lowLimit;
    }

    //метод декримирующий таймер
    public void dec() {
        this.currentValue--;
        if(this.currentValue < this.lowLimit) this.currentValue = this.highLimit;
    }

    // возращает текущее состояние
    public int getValue() {
        return this.currentValue;
    }
}
