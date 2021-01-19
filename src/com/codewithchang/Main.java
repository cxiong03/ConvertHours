package com.codewithchang;

import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {
        System.out.println("Version 1");
	    Utility.convertHours(8,0,5);
	    Utility.convertHours(21, 0, 5);
	    Utility.convertHours(21, 0, 36);

        System.out.println("----------------");

        System.out.println("Version 2");
        Utility.convertHours(21, 0, -5);

        System.out.println("----------------");

        System.out.println("Version 3");
        Utility.convertMinutes(21, 00, 147);

        System.out.println("----------------");

        System.out.println("Version 4");
        Utility.militaryHourToStandard(21, 27, 2, true);
        Utility.militaryHourToStandard(21, 27, 2,false);
        Utility.militaryHourToStandard(21, 0, 147, true);
        Utility.militaryHourToStandard(21, 0, 147, false);


    }
}
