import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;




 class SUBMEXTREES {
	

class Pair
{
	long mex;
	int size;
}
	
	public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t!=0)
		 {
			int n=sc.nextInt();
			ArrayList<Integer> arr[]=new ArrayList[n+1];
			for(int i=0;i<=n;i++)
			{
				arr[i]=new ArrayList<>();
			}
			for(int i=2;i<=n;i++) 
			{
				int x=sc.nextInt();
				arr[x].add(i);
			}
			SUBMEXTREES a=new SUBMEXTREES();
			Pair p=a.dfs(arr,1);
			System.out.println(p.mex);
			 t--;
		 }
	 }
	
	 Pair dfs(ArrayList<Integer> a[],int parent)
	{
	Pair p=new Pair();
	 p.mex=0;
	p.size=1;
	
	for(int ele:a[parent])
	{
		Pair g=dfs(a,ele);
		p.mex=Math.max(p.mex, g.mex);
		p.size+=g.size;
	}
	
	
		
		p.mex=p.mex+p.size;
		

	return p;	
	}
	
}
