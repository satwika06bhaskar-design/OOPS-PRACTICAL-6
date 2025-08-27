package javaprogramming;

import java.util.Scanner;

public class Integernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int number =sc.nextInt();
		if(number>0) {
			System.out.println("it is a positive number");
		}
		else if(number==0) {
			System.out.println("it is a zero number");
		}
		else {
			System.out.println("it is a negative number");
		}
	sc.close();
	
	}

}