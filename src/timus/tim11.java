package timus;
import java.util.*;
public class tim11 {
	public static String find_min_key(String command, String[] commands) {
		for (int big_l = 1; big_l <= command.length(); big_l++) {
			for (int start = 0; start <= command.length()-big_l; start++) {
				String sub = command.substring(start, start+big_l);
                
				boolean unique = true;
				for (String otherCommand : commands) {
					if (!otherCommand.equals(command) && otherCommand.contains(sub)) {
						unique = false;	break;}}

				if (unique) {return sub;}
			}
		}
		return "";}
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		System.out.print("Введите количество команд: ");
		int n = in.nextInt(); 
		in.nextLine();
		String[] commands = new String[n];
        
		System.out.println("Введите команды:");
		for (int i = 0; i < n; i++) {
            commands[i] = in.nextLine();
        }

		System.out.print("\nРезультат (минимальные ключевые подстроки):");
		for (int i = 0; i < n; i++) {
			String command = commands[i];
			String keysub = find_min_key(command, commands);
			System.out.print(keysub + ", ");
        }

		in.close();
    }}
    
    