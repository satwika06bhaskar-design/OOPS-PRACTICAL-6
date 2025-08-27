package javaprogramming;
import java.util.*;

public class AScivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc = new Scanner (System.in);
System.out.print("Enter a character: ");
char ch = Sc.next().charAt(0);

// Get ASCII value (implicitly converted to int)
int AScivalue  = (int) ch;

// Display results
System.out.println("The ASCII value of '" + ch + "' is: " + AScivalue );
System.out.println("Converted ASCII value as integer: " + AScivalue );
Sc.close();
	}

}
