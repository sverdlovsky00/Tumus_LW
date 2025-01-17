package timus;
import java.util.*;
public class tim10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите количество камей: ");
		int N = in.nextInt();
		boolean[] dp = new boolean[N + 1];
		dp[0] = false;
        
		for (int i = 1; i <= N; i++) {
			for (int x = 1; x <= i; x *= 2) {
				if (!dp[i - x]) {
					dp[i] = true;
					break;}
			}
		}
        
		if (dp[N]) {
			System.out.println("Победил игрок 1");
			for (int x = 1; x <= N; x *= 2) {
				if (!dp[N - x]) {
					System.out.println("Минимальное количество камней для победы: " + x);
					break;}
			}
		} else {System.out.println("Победил игрок 2");}
		in.close();
	}
}