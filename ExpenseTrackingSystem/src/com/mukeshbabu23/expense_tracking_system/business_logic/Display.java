package com.mukeshbabu23.expense_tracking_system.business_logic;

import java.util.Scanner;

public class Display {

	private Scanner scan = new Scanner(System.in);
	Support SPT=new Support();
	ServiceLogic serviceLogic=new ServiceLogic();

	public void main() {
		System.out.println("Money Tracker");
		serviceLogic.defaultList();
		
		while(true) {
			System.out.println(SPT.linePrinter(26)+"\n"+SPT.spacePrinter(8)+"Dashboard\n"+SPT.linePrinter(26));
			System.out.println("1. Expense\n2. Income\n3. Transfer\n4. Balance\n5. Exist");
			System.out.print(">>> ");
			int option=scan.nextInt();
			switch(option) {
			case 1: expense();			
			break;
			case 2: income();
			break;
			case 3: System.out.println(" Transfer ");
			break;
			case 4: serviceLogic.displayBalace();
			break;
			case 5: System.out.println(" Existing...\nHave a Nice Day ");
			System.exit(0);
			break;
			default : System.out.println(" Invalid Option ");
			}
		}
	}

	public void expense() {
		boolean existSwitch = true;
		while(existSwitch) {
			System.out.println(SPT.linePrinter(26)+"\n"+SPT.spacePrinter(9)+"Expenses\n"+SPT.linePrinter(26));
			System.out.println("1. Add Expense\n2. Expense Report\n3. Back to Dashboard");
			System.out.print(">>> ");
			int option=scan.nextInt();
			switch(option) {
			case 1: serviceLogic.addExpenses();
			break;
			case 2: serviceLogic.expenseReport();
			break;
			case 3: existSwitch=false;
			break;
			default : System.out.println(" Invalid Option ");
			}
		}
	}
	
	public void income() {
		boolean existSwitch = true;
		while(existSwitch) {
			System.out.println(SPT.linePrinter(26)+"\n"+SPT.spacePrinter(10)+"Income\n"+SPT.linePrinter(26));
			System.out.println("1. Add Income\n2. Income Report\n3. Back to Dashboard");
			System.out.print(">>> ");
			int option=scan.nextInt();
			switch(option) {
			case 1: 
			break;
			case 2: System.out.println(" Income Report ");
			break;
			case 3: existSwitch=false;
			break;
			default : System.out.println(" Invalid Option ");
			}
		}
	}
}
