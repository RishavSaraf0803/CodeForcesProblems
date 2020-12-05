import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class New {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t!=0)
	{
		int n=sc.nextInt();
			
			  int arr[]=new int[n]; for(int i=0;i<n;i++) { arr[i]=sc.nextInt(); }
			 int ans=minincrement(arr,n);
		
		
		System.out.println(ans);
		t--;
	}
}
static int minincrement(int[] arr,int n)
{
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<n;i++)
	{
		if(map.containsKey(arr[i]))
			map.put(arr[i], map.get(arr[i])+1);
		else
			map.put(arr[i], 1);
		
	}

	int ans=0;
	ArrayList<Integer> extra=new ArrayList<>();
	for(int i=0;i<100000;i++)
	{
		if(map.containsKey(i) && map.get(i)>=2)
		{
			//extra.add(i*(map.get(i)-1));
			while(map.get(i)>1)
			{
				extra.add(i);
				map.put(i,map.get(i)-1);
			}
		}
		else if(extra.size()>0 && !map.containsKey(i))
		{
			ans+=i-extra.get(extra.size()-1);
			extra.remove(extra.size()-1);
		}
	}
	return ans;
}

	



 

static String ifpossible(int input1,int input2,int input3,int input4,int input5,int input6)
{
	
	int time1stintern=0;
    int temp1= input1%input2==0? input1/input2:input1/input2+1;
	 time1stintern=temp1*input5;
	int time2ndintern=0;
	int temp2=input1%input3==0? input1/input3:input1/input3+1;
		time2ndintern=temp2*(input5+2);
	int time3rdintern=0;
	int temp3=input1%input4==0? input1/input4:input1/input4+1;
		time3rdintern=temp3*(input5-2);
	int totaltime=time1stintern+time2ndintern+time3rdintern;
	StringBuilder sb=new StringBuilder();
	if(totaltime<=input6)
	{
		sb.append("Yes"+" "+totaltime);
	}
	else
	{
		sb.append("No"+" "+(totaltime-input6) );
	}
	return sb.toString();
	
}
}