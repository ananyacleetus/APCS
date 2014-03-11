
public class Vowel {
	
	public static String v= "aeiouyAIEOUY";
	private static int count;
	public String x;
	
	

	public Vowel (String s){
	x=s;
		count=0;
	}
	
	public  int CountVowels(){
		
		int n = 0;
		int length = x.length();
		
		while (n < length){
		if (v.contains(""+ x.charAt(n))){
			
			count ++;
		}
		
		
		if (n<= length){
			n++;
		}
		
		}
		return count;
	}
	
	
	public static int CountVowels(String m){
		
		int n = 0;
		int length = m.length();
		
		while (n < length){
		if (v.contains(""+ m.charAt(n))){
			
			count ++;
		}
		
		
		if (n<= length){
			n++;
		}
		}
		
		return count;
	}
	

}
