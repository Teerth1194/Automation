
public class Bank {
	String bankName,area,phoneNo;
	public static void main(String[] args){
		Bank bank=new Bank();
		//System.out.println(bank.bankName);
		Bank bank2=new Bank("abc","xyz","pqr");
		System.out.println(bank2.bankName);
	}
	Bank(){
		System.out.println("inside constructor");
	}
	Bank(String x,String y,String z){
		bankName=x;
		area=y;
		phoneNo=z;
	}

}
