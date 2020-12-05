import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Aprctice {
	
	public static void main(String[] args) throws IOException
	{

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int tt=0;tt<t;tt++) 
		{
			
			int n=sc.nextInt();
			int []a= new int[n];
			for(int i=0;i<n;i++)
				
			{
				a[i]=sc.nextInt();
			}
			int[] res=new int[n];
			for(int i=0;i<n-1;i+=2)
			{
				res[i]=-a[i+1];
				res[i+1]=a[i];
			}
		
			for(int ele:res)
				System.out.print(ele+" ");
			
			System.out.println();
		}
	}
}