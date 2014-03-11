public class BarcodeConverse {
	private String s;
	private int d1;
	private int d2;
	private int d3;
	private int d4;
	private int d5;
	private int checksum;

	public BarcodeConverse(String l) {
		s=l;
		d1=25;
		d2=25;
		d3=25;
		d4=25;
		d5=25;
		checksum =0;
		
		if (s.length()!= 32){
			throw new IllegalArgumentException("Code isn't right length.");
		}
		
		if (s.charAt(0)!= '|' || s.charAt(31) != '|'){
			throw new IllegalArgumentException("Code doesn't start and end properly.");
		}
		
		
		
	}
	
	
	public String toCode(){
		
		
		CodeConverter m1= new CodeConverter(s.substring(1,6));
		
		d1=m1.toInt();
		
CodeConverter m2= new CodeConverter(s.substring(6,11));
		
		d2=m2.toInt();
		
CodeConverter m3= new CodeConverter(s.substring(11,16));
		
		d3=m3.toInt();
		
CodeConverter m4= new CodeConverter(s.substring(16,21));
		
		d4=m4.toInt();
		
CodeConverter m5= new CodeConverter(s.substring(21,26));
		
		d5=m5.toInt();
		
CodeConverter m6= new CodeConverter(s.substring(26,31));
		
		checksum=m6.toInt();
		
		
		
		if ((d1+d2+d3+d4+d5+checksum)%10!=0){
			throw new IllegalArgumentException("The code is incorrect; The checksum didn't add up correctly.");
			
			
		}
		return "The number is " + d1+d2+d3+d4+d5 + ".";
		
		
	}
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
