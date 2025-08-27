package javaprogramming;
import java.util.Scanner;

public class Print1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n =sc.nextInt();
for(int i=1;i<=n;i++) {
	System.out.println(i);
}
sc.close();
	}

}