package com.Excercises.toString.Excercise2;

class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString(){
        String hours3 = String.valueOf(hours);
        String minutes3 = String.valueOf(minutes);
        String seconds3 = String.valueOf(seconds);

        String hours2;
        String minutes2;
        String seconds2;
        String x = "0";
        hours2 = (hours<10 ? x.concat(hours3) : hours3);
        minutes2 = ((minutes<10) ? x.concat(minutes3) : minutes3);
        seconds2 = ((seconds<10) ? x.concat(seconds3) : seconds3);
        return hours2+":"+minutes2+":"+seconds2;
    }
}

