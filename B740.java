import java.util.Scanner;

public class B740 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[] array = new int[n];
	for (int i = 0; i < n; i++) {
	    array[i] = sc.nextInt();
	}
	int[][] query = new int[m][2];
	for (int i = 0; i < m; i++) {
	    query[i][0] = sc.nextInt() - 1;
	    query[i][1] = sc.nextInt() - 1;
	}
	int[] preffixSum = new int[n];
	for (int i = 0; i < n; i++) {
	    preffixSum[i] = (i == 0 ? array[i] : preffixSum[i - 1] + array[i]);
	}
	int result = getMax(preffixSum, query);
	System.out.println(result);

    }

    private static int getMax(int[] arr, int[][] query) {
	int sum = 0;
	for (int i = 0; i < query.length; i++) {
	    int currSum = arr[query[i][1]] - (query[i][0] == 0 ? 0 : arr[query[i][0] - 1]);
	    sum += currSum < 0 ? 0 : currSum;
	}
	return sum;
    }

}
