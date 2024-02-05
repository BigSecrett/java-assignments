package ai.dv.ui;
import java.util.Scanner;

public class AddingFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = scan.nextInt();
		double k;
		double sum = 1;
		for(int i = 2;i<=n ; i++) {
			k = 1.0/i;
			sum = sum + k;
		}
		System.out.print("The result is :"+sum);
		
		scan.close();
		
		
		
	}
		

}
