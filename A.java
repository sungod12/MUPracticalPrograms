import java.util.*;
public class A{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no of bits you want to send");
		n=sc.nextInt();
		t(n);
		System.out.println("Sender is sending.....");
		System.out.println("Did you receive the data?");
		System.out.println("Yes=1 & No=0");
		int c=sc.nextInt();
		if(c==1){
			System.out.println("Transmission successful....");
		}
		else
		{
			System.out.println("data needs to be retransmitted");
			t(n);
			System.out.println("Transmission successful....");

		}
	}
	public static void t(int n){
			Scanner sc=new Scanner(System.in);
			int i=0;
			int a[]=new int[n];
			while(i<n){
				System.out.println("data at "+(i+1));
				a[i]=sc.nextInt();
				i++;
			}
		}
}