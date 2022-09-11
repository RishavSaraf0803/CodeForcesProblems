import java.util.Scanner;

public class B_MirrorInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t!= 0) {
			int n = sc.nextInt();
			String word = sc.next();
			
			String result = getLexoSmallestString(word);
			System.out.println(result);
			t--;
		}
	}
	static String getLexoSmallestString(String word) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(word.charAt(0));
		boolean flag = false;
		for(int i = 1; i < word.length(); i++) {
			if(word.charAt(i) < word.charAt(i-1)) {
				sb.append(word.charAt(i));
				flag = true;
			}
			else if(word.charAt(i) == word.charAt(i-1) && flag) {
				sb.append(word.charAt(i));
			}
			else {
				break;
			}
		}
		
		return sb.toString() + sb.reverse().toString();
		
	}
}
