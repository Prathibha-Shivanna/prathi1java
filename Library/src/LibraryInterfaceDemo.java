
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		KidsUser kid = new KidsUser();
		System.out.println("Test case 1");
		System.out.print( "when age is 10"+ "=" );
		kid.registerAccount(10);
		System.out.print( "when age is 18"+ "=" );
		kid.registerAccount(18);
		kid.requestBook("kids");
		kid.requestBook("fiction");
		
		
		System.out.println("******************************");
		
		AdultUser adult = new AdultUser();
		System.out.println("Test case 2");
		System.out.print( "when age is 5"+ "=" );
		 adult.registerAccount(5);
		 System.out.print( "when age is 23"+ "=" );
		adult.registerAccount(23);
		adult.requestBook("kids");
		adult.requestBook("fiction");
		
	}

}
