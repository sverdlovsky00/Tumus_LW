package timus;

import java.util.Scanner;

public class tim2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чётное количество цифр в номере билета: ");
        int N = scanner.nextInt();
        if (N % 2 != 0 || N < 2 || N > 8) {
            System.out.println("Ошибка: Введите чётное число от 2 до 8.");
            return;
        }

        int halfLength = N / 2;
        int count = 0;
        for (int sum = 0; sum <= 9 * halfLength; sum++) {
            count += countCombinations(sum, halfLength) * countCombinations(sum, halfLength);
        }
        System.out.println("Количество счастливых билетов: " + count);
    }

    private static int countCombinations(int targetSum, int digits) {
        int[][] dp = new int[digits + 1][targetSum + 1];
        dp[0][0] = 1;
        for (int digit = 1; digit <= digits; digit++) {
            for (int sum = 0; sum <= targetSum; sum++) {
                for (int d = 0; d <= 9; d++) {
                    if (sum >= d) {
                        dp[digit][sum] += dp[digit - 1][sum - d];
                    }
                }
            }
        }

        return dp[digits][targetSum];
    }
}