package javaprogramming;
import java.util.*;
public class Divisibleby3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc = new Scanner (System.in);
int a = Sc.nextInt();

if ( a % 3 == 0  && a % 5 == 0) {
	System.out.println("The given nummber is divisible by both 3 and 5  ");
}else {
	System.out.println("The given number is not  divisible by both 3 and 5 ");
}
Sc.close();
	}

}
