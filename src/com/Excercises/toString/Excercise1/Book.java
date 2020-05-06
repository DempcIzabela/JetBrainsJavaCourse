package com.Excercises.toString.Excercise1;

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
    public String toString(){
        String authors2 = java.util.Arrays.toString(authors);
        authors2 = authors2.replace(", ", ",");
        return "title="+title+",yearOfPublishing="+yearOfPublishing+",authors="+authors2;
    }
}