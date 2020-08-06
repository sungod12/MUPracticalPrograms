import java.util.*;
public class GpBackN{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int y=0,c=2,n;
			System.out.println("enter the no of packets you want to send");
			n=sc.nextInt();
			tr(c,n,y);
	
	}
	public static void tr(int c,int n,int y){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		if(y==0){
			int i=0;
			System.out.println("Sender:");
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println("Receiver:");
			System.out.println("Did you receive the packets..?");
			System.out.println("Yes=1 & No=0");
			System.out.println("enter your choice");
			c=sc.nextInt();

			if(c==1)
			{
				System.out.println("Transmission successful..");

			}
			else if(c==0){
				System.out.println("which packet you didnt receive..?");
				int r=sc.nextInt();
				System.out.println("Packets retransmitting at position "+r);
				System.out.print(a[r-1]+"\n");
				System.out.println("Transmission successful...");
			}

		}
	}
}
	
