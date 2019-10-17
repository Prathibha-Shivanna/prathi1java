
public class Subject7 {

	int sub1, sub2, sub3;

	Subject7(int s1, int s2, int s3) {

		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}

	void evaluate() {
		if ((sub1 > 60 && sub2 > 60 && sub3 > 60) || (sub1 > 60 && sub2 > 60 && sub3 < 60)
				|| (sub1 < 60 && sub2 > 60 && sub3 > 60) || (sub1 > 60 && sub2 < 60 && sub3 > 60))

		{

			System.out.println("The Student is promoted to next level");

		} else {

			System.out.println("Failed");

		}

	}

	public static void main(String[] args) {

		Subject7 obj = new Subject7(92, 18, 80);
		obj.evaluate();
	}
}
