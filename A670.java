import java.util.Arrays;
import java.util.Scanner;

public class A670 {

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t>0) {
			int  n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
			System.out.println(solve(arr,n));
			t--;
	        }
}
	
	/*
	 * static int minimum(int a[]) { int count[]=new int[100];int min=0;
	 * Arrays.fill(count, 0); for(int i=0;i<a.length;i++) { count[a[i]]++;
	 * 
	 * } for(int i=0;i<count.length;i++) { if(count[i]==0) { min= i; break; } }
	 * return min; }
	 */
	
	static int solve(int a[],int n) {
    
		int count[]=new int[101];int min=0;
		Arrays.fill(count, 0);
		for(int i=0;i<a.length;i++) {
			count[a[i]]++;
			
		}
		int j=2;int i=0;
		int sum=0;
		while(j!=0) {
			if(count[i]==0) {
				j--;
				sum+=i;
				i=0;
			}
			else {
				count[i]--;
				i++;
			}
		}
		return sum;
		
	}
	
	}
