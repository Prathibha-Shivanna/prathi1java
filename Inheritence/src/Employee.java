
public class Employee {

	long employeeId;
	String employeeName;
	String employeeAddress;
	Long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

	public Employee(long id, String name, String address, Long phone) {

		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}

	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println("Salary = " + salary);
	}

	public void calculateTransportAllowance() {
		double transportAllowance = 15 * basicSalary / 100;
		System.out.println("TransportAllowance = " + transportAllowance);
	}
}
