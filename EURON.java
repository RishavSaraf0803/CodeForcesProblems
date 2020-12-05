import java.util.Scanner;
import java.util.Stack;

 class EURON {
	
	public static void main(String[]args) 
	{
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long ans=mergesort(arr,0,n-1);
		System.out.println(ans);
	}
	
	
	static long mergesort(int[] arr,int low,int high)
	{
		if(low>=high)return 0;
		
			long count=0;
			int mid=(low+high)/2;
			count+=mergesort(arr,low,mid);
			count+=mergesort(arr,mid+1,high);
			count+=merge(arr,low,mid,high);
		
		return count;
	}
	static long merge(int[] arr,int low,int mid,int high)
	{
		long count=0;
		int n1=mid-low+1,n2=high-mid;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			a1[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++)
		{
			a2[i]=arr[mid+i+1];
		}
		int k=low;
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(a1[i]<=a2[j])
			{
				arr[k]=a1[i];
				i++;
			}
			else
			{
				arr[k]=a2[j];
				j++;
				count+=n1-i;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=a1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=a2[j];
			j++;
			k++;
		}
		return count;
		
	}
	//TLE Occured
	static long usingstack(int[] arr,int n)
	{
		long count=0;
		Stack<Integer> st1=new Stack<>();
		Stack<Integer> st2=new Stack<>();
		
		st1.add(arr[0]);
		for(int i=1;i<n;i++)
		{
			if(arr[i]>=st1.peek())
				st1.push(arr[i]);
			else
			{
				while(!st1.isEmpty() && st1.peek()>arr[i])
				{
					st2.push(st1.pop());
					count++;
				}
				st1.push(arr[i]);
				while(!st2.isEmpty())
				{
					st1.push(st2.pop());
				}
			}
		}
		return count;
	}
	//TLE Occured
	static int bruteforce(int[] arr,int n)
	{
		int ans=0;
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<max)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(arr[j]>arr[i])
						ans++;
				}
			}
			else
			{
				max=arr[i];
			}
		}
		return ans;
		
		
		
	}

}
