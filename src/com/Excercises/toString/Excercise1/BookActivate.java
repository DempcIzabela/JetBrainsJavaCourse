package com.Excercises.toString.Excercise1;

public class BookActivate {
    public static void main(String[] args)
    {
        BookActivate book1 = new BookActivate();
        book1.start();
}
    public void start() {
        String[] array1={"ax","ay"};
        Book book1 = new Book("xz",19,array1);
        System.out.print(book1);
    }



}