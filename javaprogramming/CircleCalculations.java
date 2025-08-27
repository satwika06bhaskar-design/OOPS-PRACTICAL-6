package javaprogramming;
import java.util.*;
public class CircleCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double Pi=3.14159;
Scanner Sc = new Scanner (System.in);
double radius =Sc.nextDouble();
double area = Pi * radius*radius;
double circumference = 2 * Pi * radius;
System.out.println("Area of the circle = "+area);
System.out.println("Area of the circumference  = "+circumference );
Sc.close();
	}

}
