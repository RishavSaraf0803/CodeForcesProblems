import java.util.Scanner;

public class C671 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		   int n=sc.nextInt();int x=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++)
			   arr[i]=sc.nextInt();
		    System.out.println(solve(arr,n,x));
		    t--;
		}
	}
	static int solve(int[]arr,int n,int x) {
		int sum=0;int same=0;
		for(int i=0;i<n;i++) {
			int k=arr[i]-x;
			sum+=k;
		   
			if(arr[i]==x)same++;
		}
		if(same==n)return 0;
		
		else if(same>0)return 1;
	    
		else if(sum==0)return 1;
	    
		else return 2;
		}
			
		
		
	}



