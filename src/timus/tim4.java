package timus;
import java.util.*;
public class tim4 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");
    	int n = in.nextInt();
        System.out.println("\nВведите " + n + " целых неотрицательных чисел: ");
    	int[] nums = new int[n];
    	for (int i=0; i<n; i++) {nums[i] = in.nextInt();}
       
    	Arrays.sort(nums);
        double mid;
        if (n % 2==1) {mid = nums[n/2];}
        	else {mid = (nums[(n/2)-1] + nums[n/2])/2.0;}

        System.out.print("Медиана последовательности: ");
        System.out.printf("%.1f%n", mid);
        in.close();}
    
}