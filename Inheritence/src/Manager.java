
public class Manager extends Employee {

	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
		// TODO Auto-generated constructor stub
	}

}
