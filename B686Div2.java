import java.util.HashMap;
import java.util.Scanner;

public class B686Div2 {
	
	public static void main(String[]args) 
	{
	
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t!=0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int result=solve(arr,n);
			System.out.println(result);
			t--;
		}
	}
	static int solve(int[] arr,int n)
	{
		int result=-1;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++) 
		{
			if(map.containsKey(arr[i]))

				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		int index=-1;int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(map.get(arr[i])>1)
				continue;
			else
			{
				if(arr[i]<min)
				{
					index=i;
					min=arr[i];
				}
			}
		}
		if(index!=-1)

		{
			result=index+1;
		}
		return result;
	}

}
