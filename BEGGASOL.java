import java.util.Scanner;

public class BEGGASOL {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int res=Begagasol(arr,n);
			System.out.println(res);
			t--;
		}
	}
		
	static int Begagasol(int [] arr,int n)
	{
		int total=arr[0];
		if(total==0)return 0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=0)
			{
				total+=arr[i];
			}
			else
			{
				if(total-i<=0)
					break;
			}
		}
		return total;
	}

}
