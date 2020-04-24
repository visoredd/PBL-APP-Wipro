import java.io.*;
import java.util.*;
public class M1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();
		int c;
		do {
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			c = sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Enter the item to be inserted:");
				String name = sc.next();
				list.add(name);
				System.out.println("Insterted Successfully");
				break;
			case 2:
				System.out.println("Enter the item to search: ");
				if(list.contains(sc.next())) {
					System.out.println("Item found in the list");
				}
				else {
					System.out.println("Item not found in the list");
				}
				break;
			case 3:
				System.out.println("Enter the item to delete: ");
				String nd = sc.next();
				if(list.contains(nd)) {
					list.remove(nd);
					System.out.println("Item successfully deleted");
				}else
					System.out.println("Item not found in the list");
				break;
			case 4:
				Iterator<String> it =list.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 5:
				System.out.println("Exitting...");
				break;
			}
		}while(c!=5);
	}
}
