package epam_java_online.chapter4;

public class task_2_2 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №2.2");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать объект класса Автомобиль, используя классы Колесо, ДВигатель. Методы ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.");
        System.out.println(" -----------------------------------------------");

        Car car = new Car();
        car.move(500);
        car.refuel(70);
        car.changeWheel(new Wheel(15), 0, 1);

    }
}

// Класс описания двигателя, поле volume - объем двигателя.
class Engine {
    int volume;

    Engine(int volume) {
        this.volume = volume;
    }
}

// Класс описывающий колесо
class Wheel {
    int diameter;
    Wheel(int diameter) {
        this.diameter = diameter;
    }
}

// Класс описывающий авто
class Car {

    // Колеса задней оси
    public Wheel[] rearAxis = new Wheel[2];
    // Колеса передней оси
    public Wheel[] fontAxis = new Wheel[2];

    // двигатель
    public Engine engine;

    // объем топлива в баке
    public float tankVolume;

    // Марка авто
    public String mark;


    Car() {

        engine = new Engine(1600);

        rearAxis[0] = new Wheel(15);
        rearAxis[1] = new Wheel(15);

        fontAxis[0] = new Wheel(15);
        fontAxis[1] = new Wheel(15);

        tankVolume = 55;

        mark = "SuperCar";

    }

    // Метод вывода марки авто
    public void printMark() {
        System.out.println("Марка автомобиля : " + mark);
    }

    // Метод ехать на заданное количество км
    public void move(int km){
        tankVolume -= 0.001f*engine.volume * km;
    }

    // заправка
    public void refuel(int fuelCount) {
        this.tankVolume = fuelCount;
    }

    // Замена колеса, axis - 0 задняя ось, 1 передняя ось, side - 0 левое, 1 правое
    public void changeWheel(Wheel wheel, int axis, int side) {
        switch (axis) {
            case 0:
                switch (side) {
                    case 0:
                        rearAxis[0] = wheel;
                        break;
                    case 1:
                        rearAxis[1] = wheel;
                        break;

                }
            case 1:
                switch (side) {
                    case 0:
                        fontAxis[0] = wheel;
                        break;
                    case 1:
                        fontAxis[1] = wheel;
                        break;

                }
        }
    }


}



