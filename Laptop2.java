
import java.util.Scanner;

public class Laptop2 {
	
     String brand , colour ;
     double storage ;
     
     Scanner s = new Scanner(System.in);

     Laptop2() {
     
     System.out.println("Enter Storage");
		this.storage = s.nextDouble();
		s.nextLine();
		System.out.println("Enter Brand");
		this.brand = s.nextLine();
		s.nextLine();		
		System.out.println("Enter Colour");
		this.colour = s.nextLine();
		
			
	}
	
	
	
	Laptop2(String b, String c, double s){
			this.brand=b;
			this.colour=c;
			this.storage=s;
	}
}
