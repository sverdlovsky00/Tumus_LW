package timus;
import java.util.Scanner;
public class tim6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты k1, k2, k3 по порядку:");
        double k1=in.nextDouble();
        double k2=in.nextDouble();
        double k3=in.nextDouble();
        double total=1000.0;

        double sum = 1/k1+1/k2+1/k3;
        double W1 = total/(k1 * sum);
        double W2 = total/(k2 * sum);
        double W3 = total/(k3 * sum);
        double win = W1 * k1;

        System.out.print("Распределение ставок:");
        System.out.printf("\nS1 (первый исход): %.2f%n", W1);
        System.out.printf("S2 (второй исход): %.2f%n", W2);
        System.out.printf("S3 (третий исход): %.2f%n", W3);
        System.out.print("\nМаксимальный гарантированный выигрыш: " + Math.round(win));
        in.close();}
}