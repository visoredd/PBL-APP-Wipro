interface LibraryUser{
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser{
	int age;
	String bookType;
	KidUsers(int age,String bookType){
		this.age=age;
		this.bookType = bookType;
	}
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook() {
		if(bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUsers implements LibraryUser{
	int age;
	String bookType;
	AdultUsers(int age,String bookType){
		this.age=age;
		this.bookType = bookType;
	}
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook() {
		if(bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}

public class LibraryInterfaceDemo {
	public static void main(String args[]) {
		KidUsers ku = new KidUsers(9,"Kids");
		AdultUsers au = new AdultUsers(21,"Fiction");
		ku.registerAccount();
		ku.requestBook();
		au.registerAccount();
		au.requestBook();
	}
}
