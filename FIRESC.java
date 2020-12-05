import java.util.*;
public class FIRESC
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int tt=0;tt<t;tt++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			ArrayList<Integer> graph[]=new ArrayList[n];
			for(int i=0;i<m;i++)
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					graph[a-1].add(b-1);
					graph[b-1].add(a-1);
				}
				List<Integer> res=new ArrayList<>();
				res=solve(graph,n,m);
				System.out.println(res.get(0)+" "+res.get(1));
		}
		
	}
	static ArrayList<Integer> solve(ArrayList<Integer> graph[],int n,int m)
	{
		ArrayList<Integer> res=new ArrayList<>();
		int countexits=0;int countcaptain=1;int mod=(int)Math.pow(10, 9)+7;
		boolean visited[]=new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			if(!visited[i])
			{
				countexits++;
				int c=0;
				Queue<Integer> q=new LinkedList<>();
				q.add(i);
				visited[i]=true;
				
				while(!q.isEmpty())
				{
					c++;
					ArrayList<Integer> temp=new ArrayList<>();
					int x=q.poll();
					temp=graph[x];
					for(int ele:temp)
					{
						if(!visited[ele])
						{
							visited[ele]=true;
							q.add(ele);
						}
					}
				}
				countcaptain=countcaptain*c;
				countcaptain=countcaptain%mod;
			}
		}
		res.add(countexits);
		res.add(countcaptain);
		return res;
	}
}
