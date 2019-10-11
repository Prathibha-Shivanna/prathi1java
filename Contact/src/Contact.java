import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Contact {

	static Scanner obj = new Scanner(System.in);
	static Map<String, Long> con = new HashMap<String, Long>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		String re;
		// Map<String, Long> con = new HashMap<String, Long>();
		con.put("prathi", 132667126l);
		con.put("sonu", 34876473l);
		con.put("vini", 34789234l);
		con.put("shreya", 3467832l);
		con.put("pavi", 27469832l);
		con.put("asha", 3284793l);
		con.put("manasa", 248978932l);
		con.put("raki", 239729425l);
		con.put("rajini", 27543413l);
		con.put("sacchi", 32487435l);
		con.put("punu", 137652842l);
		con.remove("shreya");

		System.out.println("Do wish to add or delete Contact \n 1.Add \n 2.Delete 3.Display \n ");
		choice = obj.nextInt();
		System.out.println(choice);
		switch (choice) {
		case 1:
			add();
			break;

		case 2:
			remove();
			break;

		case 3:
			show();

		}

	}

	public static void add() {
		String name;
		Long phone;
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = obj1.nextLine();
		System.out.println("Enter Number:");
		phone = obj1.nextLong();
		con.put(name, phone);
		show();
	}

	public static void remove() {
		System.out.println("Enter Name:");
		String re = obj.next();
		con.remove(re);
		show();
	}

	public static void show() {
		Set<Map.Entry<String, Long>> st2 = con.entrySet();
		for (Map.Entry<String, Long> me : st2) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());

		}

	}
}
