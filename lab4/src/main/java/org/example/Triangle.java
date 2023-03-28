package org.example;

public class Triangle extends Figure {//объявление производного класса тругольник
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){ //метод для получения значений переменных
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double p = (a + b + c) / 2;//вычисление полупериметра
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));//вычисление площади
    }

    @Override
    public double gerPerimeter() {
        return a + b + c;//вычисление периметра
    }
}
