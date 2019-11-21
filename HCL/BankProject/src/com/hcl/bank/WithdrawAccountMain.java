package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No");
		accountNo=sc.nextInt();
		System.out.println("Enter Withdraw Amount ");
		withdrawAmount=sc.nextInt();
		System.out.println(AccountBAL.
				withdrawAccountBal(accountNo, withdrawAmount));
	}
}
