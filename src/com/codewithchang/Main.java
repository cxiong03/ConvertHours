package com.codewithchang;

import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {
        // Version 1
	    Utility.convertHours(8,0,5);
	    Utility.convertHours(21, 0, 5);
	    Utility.convertHours(21, 0, 36);

	    // Version 2
        Utility.convertHours(21, 0, -5);

        // Version 3

        Utility.convertMinutes(21, 00, 147);

        // Version 4
        Utility.militaryHourToStandard(21, 27, 2, false);

    }
}
