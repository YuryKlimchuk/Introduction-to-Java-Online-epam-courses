package epam_java_online.chapter4;

public class task_1_2 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.2");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Test2 с двумя переменными. Добавить конструктр с входными параметрами, добавить конструктор иницилизирующий начлаьные значения переменных. Добавить get и set методы.");
        System.out.println(" -----------------------------------------------");

        Test2 test2 = new Test2();
        Test2 test21 = new Test2(15,60);

        System.out.println("test2 x = " + test2.getX() + "; test2 y = " + test2.getY());
        System.out.println("test21 x = " + test21.getX() + "; test21 y = " + test21.getY());
    }

}


class Test2 {
    private int x,y;

    Test2() {
        this.x = 10;
        this.y = 20;
    }

    Test2(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int _x) {
        this.x = _x;
    }

    public void setY(int _y) {
        this.y = _y;
    }
}
