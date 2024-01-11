/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 
{	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) 
	{
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) 
	{
		String commonOrLeap = "common";
		if (isLeapYear(year)) 
		{
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) 
	{
		//Here we will send the month to the function which returns the number of days
		int Month = 1;
		while (Month <= 12) 
		{
			System.out.println("Month " + Month + " has " + nDaysInMonth(Month, year) + " days");
			Month++;
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) 
	{
	    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		{ 
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) 
	{
		int days;
        //For the months which has 30 days- April, June, September, November
        if( month == 4 || month == 6 || month == 9 || month == 11)
		{
            days = 30;
		}
        // for February only
        else if (month == 2)
		 {
			//In case the year is leap
            if(isLeapYear(year))
                days = 29;
            else
                days = 28;
        }
        // For the months with 31 days- January, March, May, July, August, October, December
        else
            days = 31;

        return days;
	}
}
