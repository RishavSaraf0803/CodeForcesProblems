import java.util.Arrays;
import java.util.Scanner;

public class D1671 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	
			
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++)
			   arr[i]=sc.nextInt();
		   
		   Arrays.sort(arr);
	
		   if(n%2==1) {
			   System.out.println((n-1)/2);
		   int i=0;int j=(n-1)/2;
		   while(j<n-1) {
			   System.out.print(arr[j]+" "+arr[i]+" ");
			   i++;j++;
		   }
		   System.out.print(arr[n-1]);
		   
				   
		   }
		   else {
			   System.out.println((n-2)/2);
		   int i=0;int j=(n-2)/2;
		   while(j<n-2) {
			   
			   System.out.print(arr[j]+" "+arr[i]+" ");
			   i++;j++;
		   }
		   System.out.print(arr[n-2]+" "+arr[n-1]);
		   
		   }
		   
		    
		   
	}

}
