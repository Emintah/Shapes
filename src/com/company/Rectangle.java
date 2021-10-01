package com.company;



class Rectangle extends Shape {
private double W;
private double H;


   @Override
    public double calculateArea()
    {
       return W*H;
    }


    @Override
    public double calculateCircumference()
    {
        return  2*(W+H);
    }






}
