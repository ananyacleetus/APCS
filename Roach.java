
public class Roach {
	
	private int roaches;

	public Roach (int r){
		roaches=r;
	}
	
	public int Wait(){
		roaches= roaches*2;
		return roaches;
	}
	
	public int spray(int t){
		roaches = (int) (roaches *Math.pow(0.9, t));
		return roaches;
		
	}
	public int spray (){
		
		roaches = (int) (roaches *0.9);
		return roaches;
	}
	
	public int getCount(){
		return roaches;
		
	}
}
