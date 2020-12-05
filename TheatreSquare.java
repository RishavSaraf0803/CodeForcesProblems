import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	    long m=sc.nextLong();
	    long n=sc.nextLong();
	    long a=sc.nextLong();
	    long countm=m/a;
	    long countn=n/a;
	   if(m%a!=0)++countm;
	    if(n%a!=0)++countn;
	    System.out.print(countm*countn);
	
	    
	}

}
