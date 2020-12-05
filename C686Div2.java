import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class C686Div2 {
	
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
		int result=0;
		ArrayList<Integer> newarr=new ArrayList<>();
		newarr.add(arr[0]);
		for(int i=1;i<n;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				newarr.add(arr[i]);
			}
		}
		if(newarr.size()==1)return 0;
		HashMap<Integer,Integer> occurence=new HashMap<>();
		
		for(int i=0;i<newarr.size();i++)
		{
			if(occurence.containsKey(newarr.get(i)))
			{
				occurence.put(newarr.get(i), occurence.get(newarr.get(i))+1);
				
			}
			else
			{
				occurence.put(newarr.get(i), 1);
			}
		}
		occurence.put(newarr.get(0), occurence.get(newarr.get(0))-1);
		occurence.put(newarr.get(newarr.size()-1), occurence.get(newarr.get(newarr.size()-1))-1);
		int min=Integer.MAX_VALUE;
		
		for(Integer value:occurence.values())
		{
			int count=value+1;
		
			min=Integer.min(min,count);
		}
		result=min;
		
		
		
		return result;
	}
	static int solvetle(int[] arr,int n)
	{
		if(n==1)return 0;
		int min=Integer.MAX_VALUE;
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			set.add(arr[i]);
		}
		
		
		for(Integer e:set)
		{
			ArrayList<Integer> l=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				if(e==arr[i])
					l.add(i);
			}
			list.add(l);
		}
		
		for(ArrayList<Integer> l:list)
		{
			int count=0;
			if(l.size()==1)
			{
				if(l.get(0)==0 || l.get(0)==n-1)
				{
					count=1;
					min=count;
					break;
				}
				else 
				{
					count=2;
				}
				min=Math.min(min, count);
			}
			else
			{
				for(int i=0;i<l.size()-1;i++)
				{
					if(l.get(i+1)-l.get(i)>1)
					{
						count++;
					}
					
				}
				if(l.get(0)-0>0)
				{
					count++;
				}
				if((n-1)-l.get(l.size()-1)>0)
				{
					count++;
				}
				min=Math.min(min,count);
			}
			//min=Math.min(min, count);
			
		}
		
		
		
		
		
		return min;
	}

}
