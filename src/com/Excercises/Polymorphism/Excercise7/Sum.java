package com.Excercises.Polymorphism.Excercise7;

public class Sum {
    public static int sumOfAreas(Shape[] array) {
        int area =0;
        for (Shape element : array){
            if(element.getClass() == Square.class){
                Square element2 = (Square) element;
                area = area + (element2.getSide()*element2.getSide());
            }
            else if(element.getClass() == Rectangle.class){
                Rectangle element3 = (Rectangle) element;
                area = area + (element3.getWidth()*element3.getHeight());
            }
            else if(element.getClass() == Shape.class){

                area = area + 0;
            }
        }
        return area;
        // write your code here
    }
}
