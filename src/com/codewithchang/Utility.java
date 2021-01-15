package com.codewithchang;

public class Utility {

    // Version 1
    public static void convertHours(int hours, int minutes, int hoursPassed) {

        String minString = ":0";
        if (minutes < 10) {
            minString += minutes;
        } else {
            minString = ":" + minutes;
        }
        int timeOfHour = (hours + hoursPassed) % 24;

        System.out.println("The time is " + timeOfHour + minString);
    }

    // Version 3
    public static void convertMinutes(int hours, int minutes, int minutesPassed) {

    }



}
