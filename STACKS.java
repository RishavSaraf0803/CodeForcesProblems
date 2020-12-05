import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class STACKS {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int arr[] =new int [n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			List<Integer> list=solve(arr,n);
			StringBuilder sb=new StringBuilder();
			sb.append(list.size()+" ");
			for(int ele:list)
			{
				sb.append(ele+" ");
			}
			System.out.println(sb.toString());
			t--;
		}
	}
	static List<Integer> solve(int[] arr,int n)
	{
		List<Integer> list=new ArrayList<>();
		list.add(arr[0]);
		
		for(int i=1;i<n;i++)
		{
			if(list.get(list.size()-1)<=arr[i])
			{
				list.add(arr[i]);
			}
			else
			{
				int index=findindex(list,arr[i]);
				list.set(index, arr[i]);
			}
		}
		return list;
		
		
	}
	static int findindex(List<Integer> list,int x)
	{
	int start=0;int ans=0;
	int end=list.size()-1;
	while(start<=end)
	{
		int mid=(start+end)/2;
		
		if(list.get(mid)<=x)
		{
			start=mid+1;
		}
		else
		{
			ans=mid;
			end=mid-1;
		}
	}
		return ans; 
	}

}
