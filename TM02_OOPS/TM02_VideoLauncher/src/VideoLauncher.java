import java.io.*;
import java.util.*;

class Video{
	String videoName;
	boolean checkout = false;
	int rating = 5;
	Video(String name){
		this.videoName = name;
	}
	String getName() {
		return videoName;
	}
	void doCheckout() {
		if(checkout == false) {
			checkout = true;
		}
	}
	void doReturn() {
		if(checkout == true) {
			checkout = false;
		}
	}
	void receiveRating(int rating) {
		this.rating = rating;
	}
	int getRating() {
		return rating;
	}
	boolean getCheckout() {
		return checkout;
	}	
}

class VideoStore{
	int count=0;
	Video[] store;
	VideoStore(){
		store = new Video[10];
	}
	
	int i=0;
	void addVideo(String name) {
		store[i++] = new Video(name);
		System.out.println("Video “"+name+"” added successfully");
		count++;
	}
	void doCheckout(String name) {
		boolean flag = false;
		for(int dc = 0;dc<count;dc++) {
			if(store[dc].getName().equals(name)) {
				store[dc].doCheckout();
				flag = true;
				System.out.println("Video “"+name+"” checkedout successfully");
				break;
			}
		}
		if(!flag) {
			System.out.println("There is no video named “"+name+"” to checkout");
		}
	}
	void doReturn(String name) {
		boolean flag = false;
		for(int dr = 0;dr<count;dr++) {
			if(store[dr].getName().equals(name)) {
				store[dr].doReturn();
				flag = true;
				System.out.println("Video “"+name+"” returned successfully");
				break;
			}
		}
		if(!flag) {
			System.out.println("There is no Video named “"+name+"” to return");
		}
	}
	void receiveRating(String name, int rating) {
		boolean flag = false;
		for(int rr = 0;rr<count;rr++) {
			if(store[rr].getName().equals(name)) {
				store[rr].receiveRating(rating);
				flag = true;
				System.out.println("Rating “"+rating+"” has been mapped to the Video “"+name+"”");
				break;
			}
		}
		if(!flag) {
			System.out.println("There is no Video named “"+name+"” to rate");
		}
	}
	void listInventory() {
		System.out.println("------------------------------------------");
		System.out.println("Video Name | Checkout Status | Rating");
		System.out.println();
		for(int j = 0;j<count;j++) {
			System.out.printf("%12s %12s %5d",store[j].getName()+" | ",store[j].getCheckout()+ "   |   ",store[j].getRating());
			System.out.println();
		}
		System.out.println("------------------------------------------");
	}
	
}
public class VideoLauncher {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int choice;
		VideoStore videoStore=new VideoStore();
		do {
				System.out.println("MAIN MENU \n=========");
				System.out.println("1. Add Videos:");
				System.out.println("2. Check Out Video:");
				System.out.println("3. Return Video:");
				System.out.println("4. Receive Rating:");
				System.out.println("5. List Inventory:");
				System.out.println("6. Exit:");
				System.out.print("Enter your choice(1..6): ");
				
				choice=input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the name of the video you want to add: ");
					videoStore.addVideo(input.next());
					break;
				case 2:
						System.out.print("Enter the name of the video you want to check out: ");
						videoStore.doCheckout(input.next());
						break;
				case 3:
					System.out.print("Enter the name of the video you want to Return:");
					videoStore.doReturn(input.next());;
					break;
				case 4:
					System.out.println("Enter the name of the video you want to Rate: ");
					videoStore.receiveRating(input.next(), input.nextInt());
					break;
				case 5:
					videoStore.listInventory();
					break;
				case 6:
					System.err.println("Exitting ...!! Thanks for using the application");
					System.exit(1);
					break;
				}
		}while(!(choice==6));		
				input.close();
	}
}