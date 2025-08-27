package javaprogramming;
import java.util.*;
public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int []a = new int [n];
for (int i =0;i<n;i++) {
	a[i] = sc.nextInt();
}
int t = sc.nextInt();
int low=0;
int high=n-1;
int mid=(low+high)/2;


while(low<=high) {
  if(a[mid]==t) {
    System.out.println("found");
    break;
  }
  else if(a[mid]>t) {
    high=mid-1;
  }
  else {
    low=mid+1;
  }
  mid=(low+high)/2;
  
}
if(low>high) {
System.out.println("not found");

}
sc.close();
}
}
