package oops.interfaces;

public class AbstractInterfaceBank implements RBI {

	public void savingsAccount() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class savings account method");
	}

	@Override
	public void currentAccount() {
		System.out.println("Abstract class cuurent account method");
	}

	@Override
	public void creditCard() {
		System.out.println("Abstract class credit card method");
	}

	@Override
	public void debitCard() {
		System.out.println("Abstract class debit card method");
	}

}
