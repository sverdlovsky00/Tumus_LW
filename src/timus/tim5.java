package timus;
import java.util.Scanner;
public class tim5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество экзаменов: ");
        int n = in.nextInt();
        System.out.println("Введите оценки за экзамены: ");
        int[] ngradee = new int[n];
        boolean three = false;	boolean allfive = true;
        int sum = 0;

        for (int i = 0; i < n; i++) {ngradee[i] = in.nextInt();
        sum += ngradee[i];
        if (ngradee[i] == 3) {three = true;}
        if (ngradee[i] != 5) {allfive = false;}}

        if (three) {
            System.out.println("Cтипендии не будет");}
        	else if (allfive) {
            System.out.println("Стипендия именная");}
        	else if (sum / (double) n >= 4.5) {
            System.out.println("Стипендия повышенная");}
        	else {System.out.println("Обычная стипендия");}
        in.close();
    }
}