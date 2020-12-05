import java.util.Scanner;
import java.util.Stack;

public class CECR98 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			String s = sc.next();
			int result = solve(s);
			System.out.println(result);
			t--;
			
		}
		
	}
	static int solve(String s)
	{
		int res=0;
		
		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			if(c=='[')
				st1.push('[');
			
			else if(c=='(')
				st2.push('(');
			
			else if(c==']')
			{
				if(!st1.isEmpty())
				{
					res++;
					st1.pop();
				}
				else
				{
					continue;
				}
			}
			else
			{
				if(!st2.isEmpty())
				{
					res++;
					st2.pop();
				}
				else
				{
					continue;
				}
			}
		}
		
		
		return res;
	}
}
