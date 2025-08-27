package javaprogramming;
import java.util.*;
public class BitwiseOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc= new Scanner (System.in);
int a = Sc.nextInt();
int b = Sc.nextInt();
System.out.println("a (binary): " + toBinary(a));
System.out.println("b (binary): " + toBinary(b));
System.out.println(" And operation "+ (a & b) + toBinary(a & b));
System.out.println(" or operation "+ (a | b) +toBinary(a | b) );
System.out.println(" xor operation "+ (a ^ b) + toBinary(a ^ b));
System.out.println(" leftshift operation "+ (a << b) + toBinary(a << b));
System.out.println(" right operation "+ (a >> b) +toBinary(a >> b));
Sc.close();
	}

	private static String toBinary(int i) {
        String binary = Integer.toBinaryString(i);
        String padded = String.format("%8s", binary).replace(' ', '0');
        return "(" + padded + ")";
	}

}
