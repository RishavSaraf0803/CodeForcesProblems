import java.util.*;
public class Watermelon {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	boolean flag=false;
	for(int i=1;i<k;i++) {
		if(i%2==0&&(k-i)%2==0) {
			
			flag=true;
	
			System.out.print("YES");
			break;
	}
	}
	if(flag==false)
		System.out.print("NO");
}

}
