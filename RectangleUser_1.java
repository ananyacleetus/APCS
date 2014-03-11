import java.awt.Rectangle;
public class RectangleUser {

public static void main(String[]x){
Rectangle r= new Rectangle(5,2,10,10);

r.grow(5, 5);
System.out.println(r.toString());
}
}