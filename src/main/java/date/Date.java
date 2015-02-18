package date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date nextDate(){
		if(month == 1 && day == 31){
			return new Date(1, 2, year);
		}else if(month == 2 && isLeapYear()== false && day == 29){
			return new Date(1, 3, year);
		}else if(month == 2 && isLeapYear()==true && day==28){
			return new Date(1, 3, year);
		}else if(month == 3 && day == 31){
			return new Date(1, 4, year);
		}else if(month == 4 && day == 30){
			return new Date(1, 5, year);
		}else if(month == 5 && day == 31){
			return new Date(1, 6, year);
		}else if(month == 6 && day == 30){
			return new Date(1, 7, year);
		}else if(month == 7 && day == 31){
			return new Date(1, 8, year);
		}else if(month == 8 && day == 31){
			return new Date(1, 9, year);
		}else if(month == 9 && day == 30){
			return new Date(1, 10, year);
		}else if(month == 10 && day == 31){
			return new Date(1, 11, year);
		}else if(month == 11 && day == 30){
			return new Date(1, 12, year);
		}else if(month == 12 && day == 31){
			return new Date(1, 1, year+1);
		}else{
			return new Date(day+1, month, year);
		}
	}
	public boolean isLeapYear(){
		if(year>=1900 && year<=2200 && year%400==0){
			return true;
		}else if(year>=1900 && year<=2200 && year%100==0){
			return false;
		}else if(year>=1900 && year<=2200 && year%4==0){
			return true;
		}else{
			return false;
		}
	}
	
}
