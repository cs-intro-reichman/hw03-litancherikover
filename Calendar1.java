/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 
{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) 
	{
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
		int SundayCounter = 0;
		while (year != 2000) 
		{
			if (dayOfWeek == 1) 
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			}

			else 
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}

			if (dayOfMonth == 1 && dayOfWeek == 1) 
			{
				SundayCounter++;
			}

			advance();
			debugDaysCounter++;
		}
		System.out.println("During the 20th century, " + SundayCounter + " Sundays fell on the first day of the month");
    }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	private static void advance()
	{
		//Initializing the day of the week
		if (dayOfWeek == 7)
		{
			dayOfWeek = 1;
		}
		else
		{
			dayOfWeek++;
		}
		if (dayOfMonth == nDaysInMonth(month, year) && month == 12) 
		{
			year++;
			dayOfMonth = 1;
			month = 1;
		}
		else if(dayOfMonth == nDaysInMonth(month, year) && month != 12) 
		{
			month++;
			dayOfMonth = 1;
		}
		else
			dayOfMonth++;
	}  
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) 
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
	private static int nDaysInMonth(int month, int year) 
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
