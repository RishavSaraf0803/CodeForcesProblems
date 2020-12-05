import java.util.*;

public class Firstnonrepeatingcharacter {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		    int n=sc.nextInt();
		   char s[]=new char[n];
		   for(int i=0;i<n;i++) {
				 s[i]=  sc.next().charAt(0);
		   }
		    solve(s,n);
		    System.out.println();
		    t--;
		}
		}
	static void solve(char[] a,int n) {
		Queue<Character> q=new LinkedList<>();
		int b[]=new int[26];
		Arrays.fill(b, 0);
		
	
		for(int i=0;i<n;i++) {
			char c=a[i];
			q.add(c);
			b[c-'a']++;
			while(!q.isEmpty()) {
				if(b[q.peek()-'a']>1) {
					q.remove();
				}
				else {
					System.out.print(q.peek()+" ");
					break;
				}
				
			}
			if(q.isEmpty()) {
				System.out.print("-1"+" ");
			}

			
		}
		
		
	}

}
