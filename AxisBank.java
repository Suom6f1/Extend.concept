package org.sytem;



public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Account no : XXXXXX789 Credited for Rs 5000 in Current Deposit Account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank call = new AxisBank();
		call.deposit();

	}

}
