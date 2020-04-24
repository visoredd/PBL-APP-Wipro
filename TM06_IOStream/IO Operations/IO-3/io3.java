import java.io.*;
import java.util.*;
public class io3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String fin = sc.nextLine();
		System.out.println("Enter the output file name");
		String fout = sc.nextLine();
	
		File fileIn = new File(fin);
		File fileOut = new File(fout);
		
		BufferedReader br = new BufferedReader(new FileReader(fileIn));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
		
		Map<String, Integer> map = new TreeMap<>();
		
		String str;
		while ((str = br.readLine()) != null) {
			str = str.trim();
			String[] words = str.split(" ");
			
			for (String word : words) {
				if (!map.containsKey(word))
					map.put(word, 1);
				else
					map.put(word, map.get(word) + 1);
			}		
		};
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> me = it.next();
			
			bw.write(me.getKey() + " : " + me.getValue() + "\n");
		}
		
		br.close();
		bw.close();
		sc.close();
	}

}