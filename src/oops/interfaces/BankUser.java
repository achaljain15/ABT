package oops.interfaces;

public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
RBI bank;

bank=new SBI();

BankUser b1= new BankUser();
b1.bankFeatures(bank);
	}
	
public void sum(int a) {
}

public void bankFeatures(RBI bank)
{
	bank= new ICICI();
	bank.savingsAccount();
	bank.currentAccount();
	bank.creditCard();
	bank.debitCard();
}
}
