package es.unileon.prg.claseDate;

public class MainDate{
	
	public static void main(String[] args){

		Date today =new Date(28,03,2017); //ella lo tiene sin el new.....
		Date monthsSolution;
		Date yesterday=new Date(27,03,2017);

		/*try {
			today = new Date(99, 13,2017);
			System.out.println(today);
			yesterday = new Date(98,14,2017);
			monthsSolution=new Date(88,13,2017);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}*/


		//Date yesterday=new Date(27,03,2017);
		System.out.println("Date 1 (today): " + today.toString());
		System.out.println("Date 2 (yesterday): " + yesterday.toString());
		System.out.println();
		System.out.println("Is it the same year? " + today.booleanToWords(today.isSameYear(yesterday)));
		System.out.println("Is it the same month? " + today.booleanToWords(today.isSameMonth(yesterday)));
		System.out.println("Is it the same day? " + today.booleanToWords(today.isSameDay(yesterday)));
		System.out.println("Is it the same date? " + today.booleanToWords(today.isSame(yesterday)));

		System.out.println("\nMonth name: " + today.monthName());
		System.out.println("Season: " + today.monthSeason());
		System.out.println("Is the day number correct? " + today.checkDay());
		
		System.out.println("\nMonths with the same amount of days: " + today.printMonthsSameAmountDays()); 
		System.out.println("Months left until the end of year: " + today.monthsLeft());
		System.out.println("\nDates left until the end of the month: " + today.printDatesUntilEndMonth());
		System.out.println("Number of days since the first day of the year: " + today.countAllYearDaysSinceFirstOne());
		System.out.println("Number of attempts needed to generate a random date equals to our date(using while): " + today.getNumGuessWhile());
		System.out.println("Number of attempts needed to generate a random date equals to our date(using do while): " + today.getNumGuessDoWhile());
		System.out.println("\nDay of the week for Date 1: " + today.dayOfTheWeek());







	}
}