package ai.dv.ui;
import java.util.Scanner;

public class ColorDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("The color code :");
		String code = scan.next();
		
		switch(code)	{
		
		case "r": 		System.out.println("The color is red");
						break;
		
		case "g":		System.out.println("The color is green");
		             	break;
		             	
		case "b": 		System.out.println("The color is blue");
		  				break;
		default:		System.out.println("You have entered a unknown code");
		
		}
		scan.close();		
	}

}
