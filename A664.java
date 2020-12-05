import java.util.Scanner;

public class A664 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		int w=sc.nextInt();
		if(solve(r,g,b,w)==true)System.out.println("Yes");
		else System.out.println("No");
		t--;
	}
}

    static boolean solve(int r,int g,int b,int w) {
		
    	   boolean flag =true;
    	   int length=r+b+g+w;
    	   int counteven=0;int countodd=0;
    	  
    	  if(r%2==0)counteven++;else countodd++;
		  if(g%2==0)counteven++;else countodd++;
		  if(b%2==0)counteven++;else countodd++;
    	  if(w%2==0)counteven++;else countodd++;
		  
    	  
    	  if(length%2==0&&counteven==2)
			  flag =false;
		  if(length%2==1) {
			  boolean zero =false;
			  if(r==0||g==0||b==0)
				  zero=true;
			  
			  if(zero==true&&w!=0&&countodd==3)
				  flag=false;
		  }
			  
    	
		  return flag;
    }
}
