import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A672 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    boolean flag=solve(arr,n);
		    if(flag==true)System.out.println("YES");
		    else System.out.println("NO");
		    t--;
		}
	}
	static boolean solve(int a[],int n) {
		boolean flag=true;
		Integer b[]=new Integer[n];
		for(int i=0;i<n;i++)
			b[i]=a[i];
		
		 Arrays.sort(b,Collections.reverseOrder());
		 
		
		 for(int i=0;i<n;i++) {
			 if(a[i]==b[i]) {
				 flag=true;
				 
				 
			 }
			 else {
				 flag=false;
			 
			 }
	
		 }
			 if(flag==false)return true;
			 else return false;
		 
	}
}
	
		
		
		
		