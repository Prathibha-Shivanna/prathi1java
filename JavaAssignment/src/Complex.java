
public class Complex {

	double real;
	double imaginary;

	Complex(double r, double i) {
		this.real = r;
		this.imaginary = i;
	}

	void sum() {
		double result = real + imaginary;
		System.out.println(result);
	}

	void sub() {
		double result = real - imaginary;
		System.out.println(result);
	}

	void mul() {
		double result = real * imaginary;
		System.out.println(result);
	}

	void swap() {
		double temp;
		temp = real;
		real = imaginary;
		imaginary = temp;
		System.out.print("real=" + real);
		System.out.print("Imaginary=" + imaginary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex obj = new Complex(213.43, 13);
		obj.sum();
		System.out.println("multiplication =");
		obj.mul();
		System.out.println("subtract =");
		obj.sub();
		System.out.println("swap =");
		obj.swap();

	}
}