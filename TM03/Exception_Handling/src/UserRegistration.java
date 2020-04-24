import java.io.*;
public class UserRegistration {
	public void registerUser(String username,String userCountry)throws InvalidCountryException {
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException();
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(",");
		String str1 = str[0];
		String str2 = str[1];
		UserRegistration ur = new UserRegistration();
		try {
			ur.registerUser(str1,str2);
		}
		catch(InvalidCountryException e) {
		}
		
	}
}
