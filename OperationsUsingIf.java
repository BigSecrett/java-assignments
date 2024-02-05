package ai.dv.ui;

import java.util.Scanner;

public class OperationsUsingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two numbers :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result;
		
		
		System.out.println("Enter your operator: ");
		String oparator = scan.next();		
		
		if(oparator.equals("+")) {
			result = num1 + num2;
			System.out.println("Result is :"+result);
		}else if(oparator.equals("-")){
			result = num1 - num2;
			System.out.println("Result is :"+result);
		}else if(oparator.equals("*")){
			result = num1 * num2;
			System.out.println("Result is :"+result);
		}else if(oparator.equals("/")){
			result = num1 / num2;
			System.out.println("Result is :"+result);
		}else if(oparator.equals("%")){
			result = num1 % num2;
			System.out.println("Result is :"+result);
		}else {
			System.out.println("Enter a valid number");
		}
		scan.close(); 
		
	}

}
