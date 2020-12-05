import java.util.*;

public class A668 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int  n=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				
			
				}
			int res[]=new int[n];
			for(int i=0;i<n;i++) {
				res[i]=arr[(n-1)-i];
			
			System.out.print(res[i]+" ");
			}
			System.out.println();
			t--;
		}

}
		
		
	}
