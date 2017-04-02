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
		System.out.println(today.isSameYear(yesterday));
		System.out.println(today.isSameMonth(yesterday));
		System.out.println(today.isSameDay(yesterday));

		System.out.println(today.isSame(yesterday));

		System.out.println(today.monthName());
		System.out.println(today.monthSeason());
	}
}