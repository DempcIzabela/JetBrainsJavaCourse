package com.Excercises.Polymorphism.Excercise6;

import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        for (Shape element : array) {
            if(element.getClass()==Polygon.class){
                Polygon element2 = (Polygon) element;
                polygons.add(element2);
            }
            else if(element.getClass()==Square.class){
                Square element2 = (Square) element;
                squares.add(element2);
            }
            else if (element.getClass()==Circle.class){
                Circle element2 = (Circle) element;
                circles.add(element2);
            }
            else if (element.getClass()==Shape.class){
                shapes.add(element);
            }

        }
        // write your code here
    }
}
