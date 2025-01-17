package timus;
import java.util.Scanner;
public class tim8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        
        int n = s.length();
        boolean[][] palindrome = new boolean[n][n];
        int[] dp = new int[n];
        int[] sindex = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i - j <= 1) {
                    	palindrome[j][i] = true;} 
                    else {
                    	palindrome[j][i] = palindrome[j + 1][i - 1];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (palindrome[0][i]) {
                dp[i] = 1;
                sindex[i] = -1;
            } else {
                dp[i] = i + 1;
                for (int j = 0; j < i; j++) {
                    if (palindrome[j + 1][i] && dp[j] + 1 < dp[i]) {
                        dp[i] = dp[j] + 1;
                        sindex[i] = j;
                    }
                }
            }
        }

        int index = n - 1;
        String result = "";
        while (index >= 0) {
            int start = sindex[index] + 1;
            result = s.substring(start, index + 1) + " " + result;
            index = sindex[index];}
        System.out.println("Минимальное количество палиндромов: " + dp[n - 1]);
        System.out.println("Разбиение: " + result.trim());
        in.close();
    }
}