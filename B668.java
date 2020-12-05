import java.util.Arrays;
import java.util.Scanner;

public class B668 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int  n=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				}
			
			long res=result(arr,n);
			System.out.println(res);
			t--;
		}
	}
	
	static long result(int arr[],int n) {
		
        long total=0;
		for(int i=0;i<n;i++) {
			
			if(arr[i]>0) 
				total+=arr[i];
				
				else if(arr[i]<0) {
						long k=Math.min(total, -arr[i]);
							arr[i]+=k;
							total-=k;
						}
					
						}
			
		
	
		long coins=0;
		
		for(int k=0;k<n;k++) {
			if(arr[k]<0)
				coins+=Math.abs(arr[k]);
				
			}
		return coins;
		}
	}
		
	

