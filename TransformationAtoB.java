import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransformationAtoB {
    static List<Long> flist;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	flist = new ArrayList<>();

	helper(a, b, new ArrayList<>());
	if (flist.size() == 0)
	    System.out.println("No");
	else {
	    System.out.println("Yes");
	    System.out.println(flist.size());
	    for (Long ele : flist) {
		System.out.print(ele + " ");
	    }
	}

    }

    private static List<Long> helper(long a, long b) {
	

}
