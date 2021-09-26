import java.util.Arrays;
import java.util.Scanner;

public class dongyang_11339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int total_time=0;
		int wait_time=0;
		
		for(int i=0; i<N; i++) {
			wait_time += arr[i];
			total_time += wait_time;
		}
		System.out.println(total_time);
	}

	
}