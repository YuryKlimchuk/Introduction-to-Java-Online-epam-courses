package epam_java_online.chapter4;

public class task_1_7 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.7");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Опишите класс, представляющий треугольник. Предусмотреть методы для создания объектов, " +
                "вычисления площади, периметра и точки пересечения медиан.");
        System.out.println(" -----------------------------------------------");

        Triangle tr1 = new Triangle(3, 5, 4, 7, 11, 0);
        System.out.println("Площадь треугольника tr1: " + tr1.area);
        System.out.println("Периметр треугольника tr1: " + tr1.perimeter);
        System.out.println("Координаты медианы, х = " + tr1.getMedianCoord()[0] + "; y = " + tr1.getMedianCoord()[1]);

    }
}

    class Triangle {

        // стороны треульника
        public double a, b, c;

        // площадь и периметр треугольника
        public double area, perimeter;

        // координаты вершин, 0 строка - x; 1 строка - y.
        private double[][] vertices = new double[2][3];

        private Triangle() {}

        Triangle(double[][] _vertices) {
            this.vertices = _vertices;
            calcSides();
            calcPerimeter();
            calcArea();
        }

        public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
            this.vertices[0][0] = x1;
            this.vertices[0][1] = x2;
            this.vertices[0][2] = x3;
            this.vertices[1][0] = y1;
            this.vertices[1][1] = y2;
            this.vertices[1][2] = y3;
            calcSides();
            calcPerimeter();
            calcArea();
        }

        // координаты точки пересечения медиан
        public double[] getMedianCoord() {
            double[] medianCoord = new double[2];
            medianCoord[0] = (this.vertices[0][0] + this.vertices[0][1] + this.vertices[0][2])/3;
            medianCoord[1] = (this.vertices[1][0] + this.vertices[1][1] + this.vertices[1][2])/3;
            return medianCoord;
        }

        // метод высчитывающий полупериметр
        private void calcPerimeter() {
            this.perimeter = a + b + c;
        }

        // вычисление длин сторон
        private void calcSides() {
            this.a = Math.sqrt(
                    Math.pow((this.vertices[0][0] - this.vertices[0][1]), 2) +
                    Math.pow((this.vertices[1][0] - this.vertices[1][1]), 2)
            );

            this.b = Math.sqrt(
                    Math.pow((this.vertices[0][0] - this.vertices[0][2]), 2) +
                            Math.pow((this.vertices[1][0] - this.vertices[1][2]), 2)
            );

            this.c = Math.sqrt(
                    Math.pow((this.vertices[0][1] - this.vertices[0][2]), 2) +
                            Math.pow((this.vertices[1][1] - this.vertices[1][2]), 2)
            );

        }

        // метод вычисления площади
        private void calcArea() {
            this.area = Math.sqrt(
                    (this.perimeter/2) *
                    (this.perimeter-this.a) *
                    (this.perimeter-this.b) *
                    (this.perimeter-this.c)
            );

        }
    }

