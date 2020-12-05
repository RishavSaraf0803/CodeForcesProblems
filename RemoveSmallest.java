import java.util.*;

public class RemoveSmallest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<n;i++) {
				int num=sc.nextInt();
				al.add(num);
			}
			Collections.sort(al);
			int i=0;
			while(i<al.size()-1) {
				if(al.get(i+1)-al.get(i)<=1) {
					al.remove(i);
				}
				else i++;
			}
			if(al.size()<=1)System.out.println("YES");
			else System.out.println("NO");
			t--;
			
		}
		}
}
