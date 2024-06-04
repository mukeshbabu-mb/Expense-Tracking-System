package com.mukeshbabu23.expense_tracking_system.business_logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {

	//Data Members for storing Money values
	private int cash=1000;
	private int account=1000;
	private int totalMoney;

	//Array for Storing  Account Type 
	public String[] accountTypeList= {"Cash","Account"};

	//ArrayList for Storing Expense Record
	public ArrayList<Integer> expenseAmount=new ArrayList<Integer>();
	public ArrayList<String> expenseCategory=new ArrayList<String>();
	public ArrayList<String> expenseAccountType=new ArrayList<String>();

	//ArrayList for Storing Income Record
	public ArrayList<Integer> incomeAmount=new ArrayList<Integer>();
	public ArrayList<String> incomeAccountType=new ArrayList<String>();

	//ArrayList for Storing Category List
	public ArrayList<String> categoryList=new ArrayList<String>();

	//Creation of Support class Objection
	Support SPT=new Support();

	//Creation of Scanner class Objection
	Scanner scan = new Scanner(System.in);

	//Getters and Setters
	public int getCash() {
		return cash;
	}	
	public int getAccount() {
		return account;
	}
	public int getTotalMoney() {
		updateTotalMoney();
		return totalMoney;
	}
	public void setCash(int cash) {
		this.cash = cash;
		updateTotalMoney();
	}
	public void setAccount(int account) {
		this.account = account;
		updateTotalMoney();
	}

	//Update the Total Money
	public void updateTotalMoney() {
		totalMoney = account + cash ;
	}

	//From Decrease money

	//for Cash
	public void decreaseCashMoney(int money) {
		cash=cash-money;
		updateTotalMoney();
	}
	//for Account
	public void decreaseAccountMoney(int money) {
		account=account-money;
		updateTotalMoney();
	}

	//Display Category List
	public void displayCategory() {
		for (int i = 0; i < categoryList.size(); i++) {
			System.out.print((i!=(categoryList.size()-1))?((i+1)+"."+categoryList.get(i)+", "):((i+1)+"."+categoryList.get(i)));
		}
	}

}
