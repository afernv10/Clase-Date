package es.unileon.prg.claseDate;


public class Date{
	
	private int day;
	private int month;
	private int year;


	public Date(int day, int month, int year) throws DateException{
		this.day = day;
		
		if(month < 1 || month > 12){ // primero se hacen las comprobaciones de todo lo que puede ir mal
			throw new DateException("Mes " + month + " no válido" +
				" valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		
		this.year = year;
	}

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
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

	public String monthName() {
          
          String monthName = " ";
        
        switch (month){

        	case 1: monthName = "January";   
         		break;
        	
        	case 2: monthName = "February";
         		break;
       	
       	case 3: monthName = "March";
         		break;
         	
         	case 4: monthName = "April";
         		break;
         	
         	case 5: monthName = "May";
         		break;
         	
         	case 6: monthName = "June";
         		break;
         	
         	case 7: monthName = "July";
         		break;
         	
         	case 8: monthName = "August";
         		break;
         	
         	case 9: monthName = "September";
         		break;
         	
         	case 10: monthName = "October";
         		break;
         	
         	case 11: monthName = "November";
         		break;
         	
         	case 12: monthName = "December";
         		break;
       	
       	}
        
      return month;
        
    	}

    	public String monthSeason(){

    		String season= ("NaN");

    		switch (month){

    			case 12:
    			case 1:
    			case 2: season = "Winter";
    				break;

    			case 3:
    			case 4:
    			case 5: season = "Spring";
    				break;

    			case 6:
    			case 7:
    			case 8: season = "Summer";
    				break;

    			case 9:
    			case 10:
    			case 11: season = "Autumn";
    				break;

    		}
    		
    		return season;
     	}



}