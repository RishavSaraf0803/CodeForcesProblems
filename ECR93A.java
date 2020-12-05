

import java.util.Scanner;

public class ECR93A {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		    int n=sc.nextInt();
		    int arr[]=new int[n+1];
		    
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    int i=0;int j=1;
		    if(arr[i]+arr[j]<=arr[n-1]) 
		    	System.out.println(i+1+" "+(j+1)+" "+n);
		    
		    else System.out.println(-1);
		    t--;
		}
	}
	

}
