package com.company;

public class triangle extends Shape{
    private double W;
    private double H;

    @Override
    public double calculateArea()
    {
       return W*H/2;
    }

    @Override
    public double calculateCircumference()
    {
       return  W*H/2;
    }
}


