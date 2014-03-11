
public class Barcode {

	private int bc;
	private int d1;
	private int d2;
	private int d3;
	private int d4;
	private int d5;
	
	
	public Barcode (int c){
		bc = c;
		d1=0;
		d2=0;
		d3=0;
		d4=0;
		d5=0;
		
		if (bc > 99999){
			throw new IllegalArgumentException();
		}
		
		int n = 10000;
		int z = 1;	
		
	int v = 0;
	
		 while (c>0){
		 v =  c/n; 
		 c = c%n;
			if (z==1){
				d1 = v;
				
			}
			if (z==2){
				d2 = v;
				
			}
			if (z==3){
				d3 = v;
				
			}
			if (z==4){
				d4 = v;
				
			}
			if (z==5){
				d5 = v;
				
				
			}
			
			n= n/10;
			z++;
		 }
		
	
	
	}
	
	
	public String toBars (){
		
	CodeConverter a = new CodeConverter(d1);
	CodeConverter b = new CodeConverter(d2);
	CodeConverter c = new CodeConverter(d3);
	CodeConverter d = new CodeConverter(d4);
	CodeConverter e = new CodeConverter(d5);

	
	
		
		
		
		return a.toBars() + b.toBars() +c.toBars() + d.toBars() + e.toBars();
		
	}

	
}
