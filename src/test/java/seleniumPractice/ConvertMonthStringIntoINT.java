package seleniumPractice;

import java.time.Month;

public class ConvertMonthStringIntoINT {

	public static void main(String[] args) {
		String monthName = "December"; // The name of the month
        Month month = Month.valueOf(monthName.toUpperCase()); // Convert to Month enum
        int monthNumber = month.getValue(); // Get the integer representation

        System.out.println("Month number for " + monthName + " is: " + monthNumber);

	}

}
