package com.codewithchang;

public class Utility {

    // Version 1
    public static void convertHours(int hours, int minutes, int hoursPassed) {

        int timeOfHour = (hours + hoursPassed) % 24;

        String minString = ":0";
        if (minutes < 10) {
            minString += minutes;
        } else {
            minString = ":" + minutes;
        }

        System.out.println("The time is " + timeOfHour + minString);
    }

    // Version 2 allow negative time

    // Version 3
    public static void convertMinutes(int hours, int minutes, int minutesPassed) {
        int finalHours = hours + minutes + (minutesPassed / 60);
        int finalMinutes = (minutesPassed % 60);
        System.out.println(finalHours + ":" + finalMinutes);
    }



}
