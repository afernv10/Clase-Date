package es.unileon.prg.claseDate;

public class MainDate{
	
	public static void main(String[] args){

		Date today=new Date(28,03,2017); //ella lo tiene sin el new.....

		/*try {
			today = new Date(99, 13,2017);
			System.out.println(today);
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}*/


		Date yesterday=new Date(27,03,2017);
		System.out.println(today.toString());
		System.out.println(yesterday.toString());
		System.out.println();
		System.out.println("Is it the same year? " + today.booleanToWords(today.isSameYear(yesterday)));
		System.out.println("Is it the same month? " + today.booleanToWords(today.isSameMonth(yesterday)));
		System.out.println("Is it the same day? " + today.booleanToWords(today.isSameDay(yesterday)));
		System.out.println("Is it the same date? " + today.booleanToWords(today.isSame(yesterday)));

		System.out.println("Month name: " + today.monthName());
		System.out.println("Season: " + today.monthSeason());
		System.out.println("Is the day number correct? " + today.checkDay());
		//System.out.println(today.m());
		System.out.println("Months with the same amount of days: " + today.printMonthsSameAmountDays()); 
		System.out.println("Months left until the end of year: " + today.monthsLeft());
		System.out.println("Dates left until the end of the month: " + today.printDatesUntilEndMonth());
		System.out.println("Number of days since the first day of the year: " + today.countAllYearDaysSinceFirstOne());
		System.out.println("Number of attempts needed to generate a random date equals to our date: " + today.getNumGuess());






	}
}