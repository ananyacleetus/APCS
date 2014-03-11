
public class GPAA {
private double gpa;
public Grade gra;
public Grade grb;
public Grade grc;
public Grade grd;
public Grade gre;




public GPAA(Grade a, Grade b, Grade c, Grade d, Grade e ){
	gra= a;
	grb=b;
	grc=c;
	grd=d;
	gre=e;
	
	
}

public GPAA(int i, String string, int j, String string2, int k, String string3,
		int l, String string4, int m, String string5) {
	 gra = new Grade(i, string);
	grb= new Grade(j, string2);
	grc = new Grade(k, string3);
	grd= new Grade (l, string4);
	gre = new Grade (m, string5);
	
}

public double getGPA(){
	gpa = (gra.getEquivalent()+grb.getEquivalent()+grc.getEquivalent()+grd.getEquivalent()+gre.getEquivalent())/5;
	return gpa;
}


}
