import java.util.Scanner;

public class LoginModel {
	private Scanner scanner = new Scanner("src/Logins.txt");
	
	public boolean Check(String Uname, String Password) {
		while (scanner.hasNext()) {
			String[] User = scanner.nextLine().split(";");
			if(User[0].equals(Uname) && User[1].equals(Password)) {
				return true;
			}
		}
		return false;
	}
}
