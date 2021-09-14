import java.util.Scanner;

public class dongyang2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] coin = new int[N];
		int count=0, nmg = 0;
		
		for (int i = 0; i < coin.length; i++) {
			coin[i] = sc.nextInt();
		}

		for (int i = coin.length-1; i >= 0; i--) {
			if(K >= coin[i]) {
				count += K / coin[i];
				K %= coin[i];
				
			}
			
		}
		System.out.println(count);
	
	}
}