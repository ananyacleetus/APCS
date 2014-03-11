public class DartSimulation{
	
	private int hits;
	private int total;
	
	public DartSimulation(){
		int hits =0;
		int total=0;
	}
	
	

		// TODO Auto-generated method stub

	
	public void run(int r) {
		
		for (int i= 0; i<r; i++){
			
		
	
		Dart d = new Dart();
		
		d.throwDart();
		total++;
		if (d.checkDart()){
			hits++;
			
		}
		}
	}
		public double estimate(){
	System.out.println("The estimate is " + (4 *(double) hits/total));
	return (4*(double)hits/total); 
}
	
	public static void main (String[] args){
		DartSimulation d = new DartSimulation();
		
		d.run(10001);
		d.estimate();
		
	
	}
	
	
}
