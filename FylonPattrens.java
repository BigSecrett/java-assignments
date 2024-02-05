package ai.dv.ui;
import java.util.Scanner;

public class FylonPattrens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number you want to print:");
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
			scan.close();
		}
	}

}
