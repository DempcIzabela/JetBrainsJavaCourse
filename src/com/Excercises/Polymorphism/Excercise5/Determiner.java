package com.Excercises.Polymorphism.Excercise5;

class Determiner {

    public static void determineWhoIsWho(Employee[] employees) {
        for (Employee employee : employees) {
            if(employee.getClass()==DataAnalyst.class){
                System.out.println("DA");
            }
            else if(employee.getClass()==Developer.class){
                System.out.println("DEV");
            }
            else if (employee.getClass()==Employee.class){
                System.out.println("EMP");
            }
        }
    }
}
