import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B681 {

	
	public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t!=0)
		 {
			int a=sc.nextInt();
			int b=sc.nextInt();
			String s=sc.next();
			int count= 0;
			
			int res=0;
			boolean flag=false;
			if(s.charAt(0)=='1')
			{
				res+=a;
				flag=true;
			}
			ArrayList<Integer> l= new ArrayList<Integer>();
			for(int i=1;i<s.length();i++) 
			{
			
				if(s.charAt(i-1)=='0' && s.charAt(i)=='1')
				{
					res+=a;
				}
				if(s.charAt(i)=='1')
				{
					flag=true;
					if(count!=0)
					{
						l.add(count);
						count=0;
					}
				}
				if(s.charAt(i)=='0'&&flag==true)
				{
					count++;
				}
				
			}
			
			
			for(int ele:l)
			{
				
				if(ele*b<a)
				{
					res=res-a+ele*b;
				}
				
			}
			 System.out.println(res);
			
			 t--;
		 }
	 }
	
}
