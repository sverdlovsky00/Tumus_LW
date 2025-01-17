package timus;
import java.util.Scanner;
public class tim7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество прямых (S): ");
        int S = in.nextInt();
        System.out.print("\nВведите количество поворотов (T): ");
        int T = in.nextInt();

        if (S + T < 4 || T < 2) {
            System.out.println("Atawazu");}

        System.out.println("\nРассчитывается максимальный путь.");
        StringBuilder path = new StringBuilder();
        int uF = 0, uL = 0, uR = 0;

        while (uF < S && uL + uR + 2 <= T) {
            if (uL < T / 2) {
                path.append("FLL");
                uF += 1;
                uL += 2;}
            
            if (uF < S && uR < T / 2) {
                path.append("FR");
                uF += 1;
                uR += 1;}
        }

        while (uF < S) {
            path.append("F");
            uF++;
        }

        if (uL + uR < T) {
            System.out.println("Atawazu");}
        	else {
            System.out.println("Результат:");
            System.out.println(path.length());
            System.out.println(path.toString());}
        in.close();}
	}