import java.util.Scanner;

public class ArrayWoddSum {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int num[]=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=sc.nextInt();
			}
	        printresult(num,n);
	        System.out.println();
	        t--;
		}
	}
	static void printresult(int[] num,int n) {
		int sum=0;int countodd=0;
		for(int i=0;i<n;i++) {
			sum+=num[i];
			if(num[i]%2==1)countodd++;
		}
		if(sum%2==1)System.out.print("YES");
		else {
			if(countodd==0||countodd==n)System.out.print("NO");
			else System.out.print("YES");
			
			
		}
		return;
	}
}
