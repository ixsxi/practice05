package com.javaex.ex08;

public class Account {
	//필드
    private String accountNo;
    private int balance;  //잔고액
	
    
    //생성자 작성
    
	public Account(String accountNo, int balance) {
	
		this.accountNo = accountNo;
		this.balance = balance;
	}


	public Account(String accountNo) {
	
		this.accountNo = accountNo;
		
	}
    
    //필요한 메소드 작성
	public void deposit(int soo) {
		this.balance =+ soo;
	}
	
	public void withdraw(int soo1) {  //왜 this.balance =- money 하면 오류날까.
		this.balance =this.balance - soo1;
	}
	
	public void showBalance() {
		System.out.println(this.balance);
	}
	
	
	
}
