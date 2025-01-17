package timus;
import java.util.*;
public class tim3 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите количество карт (n) и количество взятых карт (m): ");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Введите последовательность чисел: ");
        int[] s = new int[m];
        for (int i = 0; i < m; i++) {s[i] = in.nextInt();}

        Set<Integer> validNumbers = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            validNumbers.add(i - 1);
            validNumbers.add(i);}

        boolean ctry = true;
        for (int num : s) {
            if (!validNumbers.contains(num)) {
                ctry = false;
                break;
            }
        }

        if (ctry) {System.out.println("Последовательность возможна");} 
        	else {System.out.println("Последовательность невозможна");}
        in.close();
    }
}