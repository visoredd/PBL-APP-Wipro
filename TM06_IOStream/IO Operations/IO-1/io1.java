import java.util.Scanner;
import java.io.*;
public class io1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename = sc.nextLine();
		System.out.println("Enter the Character to be found");
		char c = sc.nextLine().charAt(0);
		Character.toLowerCase(c);
		File file = new File(filename);
		int charCount = 0;
		
		BufferReader br = new BufferReader(new FileReader(file));
		char ch;
		do {
			ch = br.read();
			if(Character.isUpperCase(ch)) Character.toLowerCase(ch);
			
			if(c == ch) charCount++;
		} while(ch != -1);
		
		System.out.println("FileName"+filename+" has "+charCOunt+" instance of letter" +ch+".");
		
		br.close()
		sc.close();
	}
}

		