public class Year{
	private int year;
	
	public Year(int y){
		year=y;
		
	}
	
	public boolean isLeapYear(){
		if (year%4==0 ){
			
			if (year%100==0){
				
				
				if (year%400==0){
					return true;
				}
				
				else {
					return false;
				}
			}
			
			else{
				return true;
			}
			
		}
		else {
			return false;
		}
	
		
	}
	
	public String toString(){
		if (isLeapYear()){
			return (year + " is a leap year.");
		}
		else {
			return (year + " is not a leap year.");
		}
	}
	
	
	
}