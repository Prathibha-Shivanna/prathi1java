
public class Account {

	int amnt;
	int bal = 400;
	int total;

	void deposit(int a) {

		total = bal + a;
		System.out.println("Total balance after deposit" + total);

	}

	void withdraw(int w) {
		total = bal - w;
		System.out.println("Total balance after withdraw" + total);
	}

	void print() {
		System.out.println("Total balance" + total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.withdraw(200);
		acc.deposit(500);
		acc.print();

	}

}
