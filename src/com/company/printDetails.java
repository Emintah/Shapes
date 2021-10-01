package com.company;

import java.util.List;

public class printDetails {

    public static void printShape(Shape[]List)
    {
       for(int i=0; i< List.length; i++)
       {
           double calculateArea = List[i].calculateArea();
           double calculateCircumference =List[i].calculateCircumference();
           System.out.println("Area:"+ calculateArea);
           System.out.println("circumference" + calculateCircumference);
       }

    }

}
