package org.example;

public class Rectangle extends  Figure{//объявление производного класса прямоугольник
    private double wight;//объявление длины прямоугольника
    private  double height;//объявление ширины прямоугольника

    public Rectangle(double wight, double height){
        this.wight = wight;//
        this.height = height;//
    }
    @Override
    public double getArea() {
        return wight * height;//вычисление площади
    }

    @Override
    public double gerPerimeter() {
        return 2 * (wight * height);//вычисление периметра
    }




}
