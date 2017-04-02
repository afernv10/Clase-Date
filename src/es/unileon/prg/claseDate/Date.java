package es.unileon.prg.claseDate;


public class Date{
	
	private int day;
	private int month;
	private int year;

      public Date(){
	//public Date(int day, int month, int year) throws DateException{
		this.day = day;
		
		/*if(month < 1 || month > 12){ // primero se hacen las comprobaciones de todo lo que puede ir mal
			throw new DateException("Mes " + month + " no válido" +
				" valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}*/

            this.month = month;
		
		this.year = year;
	}
      //}

      public Date(int day, int month, int year) {
            
            this.day=day;
            this.month=month;
            this.year=year;
	}

      /*public Date(int randomYear){ //este constructor iría para el método getNumGuess que no funciona
            
            this.year= randomYear;
            int rangeMonths=(12-1)+1;
            this.month= (int)Math.random()*(rangeMonths) + 1;
            int rangeDays= (getNumDaysMonth(this.month) - 1) + 1;
            this.day= (int)Math.random()*(rangeDays)+ 1 ;
      }*/

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
      public String booleanToWords(boolean checking){

            String toWord=" ";
            
            if(checking==true){
                  toWord= "Yes";
            } else if(checking==false){
                  toWord="No";
            }

            return toWord;
      }


      public String toString() {
            
            return this.day + "/" + this.month + "/" + this.year;
      }
      

	public String monthName() {
          
          String month = " ";
        
        switch (this.month){

        	case 1: month = "January";   
         		break;
        	
        	case 2: month = "February";
         		break;
       	
       	case 3: month = "March";
         		break;
         	
         	case 4: month = "April";
         		break;
         	
         	case 5: month = "May";
         		break;
         	
         	case 6: month = "June";
         		break;
         	
         	case 7: month = "July";
         		break;
         	
         	case 8: month = "August";
         		break;
         	
         	case 9: month = "September";
         		break;
         	
         	case 10: month = "October";
         		break;
         	
         	case 11: month = "November";
         		break;
         	
         	case 12: month = "December";
         		break;
       	
       	}
        
            return month;
        
    	}

      
      public String printMonthName(){

            return monthName();
      }

    	
      public String monthSeason(){

    		String season= (" ");

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

      
      public String printSeason(){

            return monthSeason();
      }

     	
      public String checkDay(){
     		String correct=" ";

     		switch(this.month){
     			
     			case 1:
     			case 3:
     			case 5:
     			case 7:
     			case 8:
     			case 10:
     			case 12:    if(this.day<0 || this.day>31){
     					      correct="No";
                              } else {
                                    correct= "Yes"; 
                              }
     				break;

                  case 4:
                  case 6:
                  case 9:
                  case 11:    if (this.day<0 || this.day>30){
                                    correct="No";
                              } else {
                                    correct= "Yes"; 
                              }
                        break;

                  case 2:     if (this.day<0 || this.day>28){
                                    correct="No";
                              }else {
                                    correct= "Yes"; 
                              }
                        break;
     			
     		}

            return correct;
     	}

      

      public int monthsLeft(){

            int count = 0;

            for(int i=this.getMonth(); i<12 ; i++){

                  count = count + 1;
            }

            return count;
      }

      
      
     
      public int getNumDaysMonth(int month){

            int daysMonth=0;

            switch(month){

                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 8:
                  case 10:
                  case 12:    daysMonth=31;
                        break;

                  case 4:
                  case 6:
                  case 9:
                  case 11:    daysMonth=30;
                        break;

                  case 2:     daysMonth=28;
                        break;
            }

            return daysMonth;
      }

      

      public String printMonthsSameAmountDays(){

            Date monthsSolution=new Date(this.day,this.month,this.year);
            StringBuffer printMonthsSameDays=new StringBuffer();
            for(int i=1;i<=12;i++){

                  if(getNumDaysMonth(i)==getNumDaysMonth(this.month)){

                        monthsSolution.setMonth(i);
                        printMonthsSameDays.append("\n-->" + monthsSolution.printMonthName() + "\n");
                  }
            }

            return printMonthsSameDays.toString();
      }

      

      public String printDatesUntilEndMonth(){

            StringBuffer printDatesUntil=new StringBuffer();

            for(int i=this.day;i<=getNumDaysMonth(this.month);i++){

                  printDatesUntil.append("\n-->" + i + "/" + getMonth() + "/" + getYear() + "\n");
                  
            }
            

            return printDatesUntil.toString();
      }

      

      public int countAllYearDaysSinceFirstOne(){

            int month,counter=0; //counter=this.day; 

            for(int i=1;i<this.month;i++){
                  
                  counter=counter+getNumDaysMonth(i);
            }
            
            counter=counter+this.day; //si inicializáramos el contador en this.day quitaríamos esta línea
            return counter;
      }

      
      /*public int getNumGuess(){ // da siempre 0, no va

            int counter=0;
            Date randomDate;
            boolean end=false;
            
            while(end=false){
                  randomDate=new Date(this.year);
                  counter++;
                  if(this.equals(randomDate)){
                        end=true;
                  }
            }

            return counter;
      }*/

      public int getNumGuessWhile(){

            int counter=0;
            int randomDay=0, randomMonth=0,randomYear=0;
            
            
            while(!this.isSame(new Date(randomDay,randomMonth,randomYear))){
                  
                  randomYear = this.year;
                  int rangeMonths=(12-1)+1;
                  randomMonth = (int)(Math.random()*(rangeMonths)) + 1;
                  int rangeDays= (getNumDaysMonth(randomMonth) - 1) + 1;
                  randomDay= (int)(Math.random()*(rangeDays)) + 1 ;

                  counter++;
                  
            }

            return counter;
      }

      public int getNumGuessDoWhile(){

            int counter=0;
            int randomDay=0, randomMonth=0,randomYear=0;

            do{
                  randomYear = this.year;
                  int rangeMonths=(12-1)+1;
                  randomMonth = (int)(Math.random()*(rangeMonths)) + 1;
                  int rangeDays= (getNumDaysMonth(randomMonth) - 1) + 1;
                  randomDay= (int)(Math.random()*(rangeDays)) + 1 ;

                  counter++;

            } while(!this.isSame(new Date(randomDay,randomMonth,randomYear)));

            return counter;
      }


      

}