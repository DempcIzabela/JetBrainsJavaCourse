package com.Excercises.Static.Excercise1;

class Cat {
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        name = this.name;
        age = this.age;
        counter+=1;
        if(counter>5){
            System.out.println("You have too many cats");
        }
    }


    public static int getNumberOfCats() {
        return counter;
    }

}
