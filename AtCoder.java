import java.io.IOException;
import java.util.Scanner;

 class AtCoder {
	
	public static void main(String[] args) throws IOException
	{

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String s=sc.next();
		
		int sum=a+b+c;
		StringBuilder sb=new StringBuilder();
		sb.append(Integer.toString(sum));
		sb.append(" ");
		sb.append(s);
		System.out.println(sb.toString());
		
	
	}

}
