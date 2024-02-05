package ai.dv.ui;
import java.util.Scanner;

public class Factoror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.println("the factors are :"+i);
			}
		}
		scan.close();
	}

}
