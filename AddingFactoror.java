package ai.dv.ui;
import java.util.Scanner;

public class AddingFactoror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		System.out.println("the sum of the factors is :"+sum);
		
		scan.close();
	}
	
}
