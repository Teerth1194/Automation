
public class EmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermanentEmployee pe1=new PermanentEmployee();
		pe1.setName("Anil");
		pe1.setEmpid(101);
		pe1.setBasicPay(10000);
		pe1.setHra(1500);
		pe1.setExperience(3);
		pe1.calculateSalary();
		
		ContractEmployee ce1=new ContractEmployee(); 
		ce1.setName("Ankit");
		ce1.setEmpid(102);
		ce1.setWage(500);
		ce1.setHour(10);
		ce1.calculateSalary();	
	}
}
