package epam_java_online.chapter4;

public class task_1_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Test1 с двумя переменными. Добавить методы вывода и изменения этих переменных, метод нахождения суммы, мептод нахождения наибольшей переменной.");
        System.out.println(" -----------------------------------------------");

        Test1 test1 = new Test1();
        test1.x = (int) (Math.random() * 10 + 10);
        test1.y = (int) (Math.random() * 50 + 15);

        test1.printX();
        test1.printY();
        System.out.println(test1.compareXY());

        test1.changeX(56);
        test1.changeY(35);

        test1.printX();
        test1.printY();

        System.out.println("Сумма (x и у) = " + test1.sumXY());

        System.out.println(test1.compareXY());

    }

}

class Test1 {
    int x, y;

    public void changeX(int _x) {
        this.x = _x;
    }

    public void changeY(int _y) {
        this.y = _y;
    }

    public void printX() {
        System.out.println("Значение X: " + this.x);
    }

    public void printY() {
        System.out.println("Значение Y: " + this.y);
    }

    public int sumXY() {
        return this.x + this.y;
    }

    public String compareXY() {
        if(x == y) {
            return new String("X=Y");
        } else if(x > y) {
            return new String("X>Y");
        } else {
            return new String("X<Y");
        }
    }


}
