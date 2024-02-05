package ai.dv.ui;
import java.util.Scanner;

public class PrintingPrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter the number :");
		int num = scan.nextInt();
		int count = 0;
		for(int i=2;i<=num;i++) {
			if(num%i==0 ) 
				count++;
		}
		if(count == 2){
			System.out.println("it is not a prime number");
		}else {
			System.out.println("It is a prime number");
		}
		scan.close();
		
	}
}
