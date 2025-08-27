package javaprogramming;
import java.util.*;
public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int []a = new int [n];
for(int i = 0 ; i<n;i++) {
	a[i]=sc.nextInt();
}
int t = sc.nextInt();
for (int j = 0; j<n;j++) {
	if (a[j]==t) {
		System.out.println("Found");
		break;
		
	}
}
sc.close();
	}

}
