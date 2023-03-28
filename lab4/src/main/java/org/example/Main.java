package org.example;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(5,0,0);//
        Figure rectangle = new Rectangle(3,4);//
        Figure triangle = new Triangle(3,4,5);//
        Figure ellipse = new Ellipse(5,3);//

        System.out.println("Circle area: " + circle.getArea());//Вывод надписи площадь и данных площади
        System.out.println("Circle perimeter: " + circle.gerPerimeter());//Вывод надписи периметр и числа равного ему

        System.out.println("Rectangle area: " + rectangle.getArea());//Вывод надписи площадь и данных площади
        System.out.println("Rectangle perimeter: " + rectangle.gerPerimeter());//Вывод надписи периметр и числа равного ему

        System.out.println("Triangle area: " + triangle.getArea());//Вывод надписи площадь и данных площади
        System.out.println("Triangle perimeter: " + triangle.gerPerimeter());//Вывод надписи периметр и числа равного ему

        System.out.println("Ellipse area: " + ellipse.getArea());//Вывод надписи площадь и данных площади
        System.out.println("Ellipse perimeter: " + ellipse.gerPerimeter());//Вывод надписи периметр и числа равного ему
    }
}