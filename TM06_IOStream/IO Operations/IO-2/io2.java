import java.util.Scanner;
import java.io.*;
public class io2  {
	public static void main(String{} args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input file name");
		String fin = sc.nextLine();
		
		System.out.println("Enter the output file name");
		String fout = sc.nextLine();
		
		File fileIn = new File(fin);
		File fileOut = new File(fout);
		
		BufferReader br = new BufferReader(new FileReader(fileIn));
		BufferReader bw = new BufferReader(new FileReader(fileOut));
		
		int i;
		do {
			i = br.read();
			if(i != -1)
				bw.write(i);
		}while( i != -1);
		
		br.close();
		bw.close();
		sc.close();
	}
}
			

		