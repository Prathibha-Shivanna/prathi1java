
public class Taxcalculator {
	
	int taxAmt;
	public Taxcalculator(String empName,boolean isIndain, double empsal)
	{
		super();
		this.empName=empName;
		this.isIndain=isIndain;
		this.empsal=empsal;
	}
  int calculateTax(String empName, boolean isIndain, double empsal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		if(isIndian==false) {
			return throw new CountryNotValidException;
		}
	  
		else if(empName==" ") {
			return throw new EmployeeNameInvalidException;
		}
		
		else if(empSal>100000 && isIndain==true)
		{
		  return	taxAmt= empSal*8/100;
		}
		
		else if(empSal>=50000 && empSal<=100000 && isIndain==true)
		{
			return taxAmt= empSal*6/100;
		}
		
		else if(empSal>=30000 && empSal<=50000 && isIndain==true)
		{
			return taxAmt= empSal*5/100;
		}
  

		else if(empSal>=10000 && empSal<=30000 && isIndain==true)
		{
			return taxAmt= empSal*4/100;
		}
	
		else
		{
			return throw new TaxNotEligibleException;
		}
	}
 
	public static void main(String args[]) {
		
	}


}
