
public class Loan {
	int loanNo;
	int accountNo;
	int customerNo;
	float loanAmount;
	int loanDuration;
	float interest;
	private static int loanCounter;
	
	static {
		loanCounter=100;
	}
	
	Loan(){
		loanCounter++;
	}
	
	Loan(int acountNo, int customerNo, float loanAmount, int loanDuration, float interest){
		loanCounter++;
	}
	

	public static int getLoanCounter() {
		return loanCounter;
	}

	public int getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	

}
