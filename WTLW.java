import java.util.*;
public class WTLW {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
			String s=sc.next();
			StringBuilder sb=new StringBuilder();
			int count=0;
			
			if(s.length()>10) {
				count=s.length()-2;
			}
			sb.append(s.charAt(0));sb.append(count);sb.append(s.charAt(s.length()-1));
			
			if(count==0)System.out.println(s);
			else System.out.println(sb.toString());
			n--;
		}
	}

}
