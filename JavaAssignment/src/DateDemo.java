import java.util.Date;

public class DateDemo {

	int day, month, year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	DateDemo() {
		System.out.println("Default constructor");
	}

	// parameterized constructor
	DateDemo(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	// print method

	void print() {
		System.out.println("Day is =" + day + " " + "Month is=" + month + " " + "year is" + year);
	}

	void swap(int a, int b) {
		System.out.println("before swapping : date1 is=" + a + " " + "date2 is=" + b);
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("after swapping : date1 is=" + a + " " + "date2 is=" + b);
	}

	public static void main(String args[]) {
		DateDemo dd = new DateDemo(15, 10, 2019);
		Date date = new Date();
		int p = date.getDate();
		System.out.println(date);
		// System.out.print(p);
		dd.print();
		dd.swap(4, 5);

	}
}
