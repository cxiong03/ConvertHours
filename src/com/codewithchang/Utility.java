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

    // Version 4
    public static void militaryHourToStandard(int hour, int minutes, int hoursPassed, boolean standard) {
        int timeOfHour = (hour + (hoursPassed % 60)) % 24;

        if (standard == true) {
            System.out.println(timeOfHour % 12 + ":" + minutes);
        } else {
            System.out.println(timeOfHour + ":" + minutes);
        }

    }

    // Version 5
    static void convertMinutes(int hours, int minutes, int minutesPassed, boolean standard) {
        String time;
        int timeOfHour = hours + (minutesPassed / 60);
        int timeOfMinutes = (minutesPassed + minutes) % 60;

    }

}
