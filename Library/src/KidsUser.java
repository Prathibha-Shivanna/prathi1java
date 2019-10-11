
public class KidsUser implements LibraryUser {

	int age;
	String bookType;
	@Override
	public void registerAccount(int a) {
		// TODO Auto-generated method stub
		if(a<12) {
			System.out.println("You have successfully registered under a Kids Account");
			
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kids");
		}
		
	}
	@Override
	public void requestBook(String book) {
		// TODO Auto-generated method stub
		if(book=="kids") {
			System.out.println("oops you are allowed to take only kids book");
		}
			else { 
		System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		
	}
}
