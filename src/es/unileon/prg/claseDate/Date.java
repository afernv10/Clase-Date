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

	int getDay(){
		return this.day;
	}

	void setDay(int day){
		this.day=day;
	}

	int getMonth(){
		return this.month;
	}
	void setMonth(int month){
		this.month=month;
	}

	int getYear(){
		return this.year;
	}

	void setYear(int year){
		this.year=year;
	}

	public boolean isSameYear(Date another){
		return this.year == another.year;

	}

	public boolean isSameMonth(Date another){
		return this.month == another.month;

	}

	public boolean isSameDay(Date another){
		return this.day == another.day;

	}

	public boolean isSame(Date another){
		return ((this.isSameYear(another)) && (this.isSameMonth(another)) && (this.isSameDay(another)));
	}

	/*public String getMonthName(){
		int 
	}*/

}