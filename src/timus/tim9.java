package timus;
import java.util.Scanner;
public class tim9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Сообщение Анжелы :");
		String input = in.nextLine();
		String low_chars = input.toLowerCase();
		String result="";
		boolean new_m = true;
		for (int i=0; i<low_chars.length(); i++) {
			char c = low_chars.charAt(i);

			if (new_m && c >= 'a' && c <= 'z') {
				result += (char) (c - 'a' + 'A');
				new_m = false;} else {
                result += c;}
            if (c == '.' || c == '!' || c == '?') {
            	new_m = true;}
        }

        System.out.println("\nИсправленное сообщение:");
        System.out.println(result);
        in.close();
    }
}