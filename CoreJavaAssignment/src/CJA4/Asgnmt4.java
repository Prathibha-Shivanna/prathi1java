package CJA4;

public class Asgnmt4 {

		int sub1, sub2, sub3;

		Asgnmt4(int s1, int s2, int s3) {

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

			Asgnmt4 obj = new Asgnmt4(92, 18, 80);
			obj.evaluate();
		}
	}

