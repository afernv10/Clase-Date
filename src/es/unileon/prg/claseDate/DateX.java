package es.unileon.prg.claseDate;

public class Date{
	
	private int day;
	private int month;
	private int year;


	public Date(int day, int month, int year) throws DateException{
		this.day = day;

		if(month >= 0 && month <=12){ // primero se hacen las comprobaciones de todo lo que puede ir mal
			throw new DateException("mes " + month + " no valido" + " valores posibles entre 1 y 12.");
		} else {
			this.month = month;

		}
		this.year = year;

	}
}