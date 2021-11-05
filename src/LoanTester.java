
public class LoanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan();
		System.out.println(Loan.getLoanCounter()); 
		Loan l2=new Loan();
		System.out.println(Loan.getLoanCounter());
		Loan l3=new Loan(12,12,12,12,12);
		System.out.println(Loan.getLoanCounter());
		Loan l4=new Loan(13,12,12,13,12);
		System.out.println(Loan.getLoanCounter());
	}

}
