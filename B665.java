import java.util.Scanner;

public class B665 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t>0) {
			int  x1=sc.nextInt();int y1=sc.nextInt();int z1=sc.nextInt();
			sc.nextLine();
			int x2=sc.nextInt();int y2=sc.nextInt();int z2=sc.nextInt();
			
		 int count=0;
		 if(z1>y2) {
		 count=2*y2;
		 z1-=y2;
		 y2=0;
		 }
		 else {
			 count=2*z1;
			 z1=0;
			 y2-=z1;
		 }
		 if(z2>(x1+z1))
			 count-=2*(z2-z1-x1);
		 
		 
		 
		 System.out.println(count);
		 t--;
		 
			
        
          }
}
	
}
