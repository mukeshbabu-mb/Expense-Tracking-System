package com.mukeshbabu23.expense_tracking_system.business_logic;

public class ServiceLogic extends Database {

	public void defaultList() {
		categoryList.add("Food");
		categoryList.add("Tansport");
		categoryList.add("HouseHold");
		categoryList.add("Education");
		categoryList.add("Others");
	}
	public void addExpenses() {
		System.out.println(SPT.linePrinter(26)+"\n"+SPT.spacePrinter(7)+"Add Expense\n"+SPT.linePrinter(26));
		//Getting values from users
		System.out.print("Enter the Amount : ₹");
		int amountValue=scan.nextInt();
		System.out.println(SPT.linePrinter(26)+"\nCategory List");
		displayCategory();//Function call
		System.out.println();
		System.out.print("Enter the Category : ");
		int categoryValue=scan.nextInt()-1;
		System.out.println(SPT.linePrinter(26)+"\nAmount Type");
		System.out.println("1.Cash 2.Account");
		System.out.print("Enter the Account Type : ");
		int accountTypeValue=scan.nextInt()-1;
		
		if(accountTypeValue==0) {
			decreaseCashMoney(amountValue);
			expenseAmount.add(amountValue);
			expenseCategory.add(categoryList.get(categoryValue));
			expenseAccountType.add(accountTypeList[accountTypeValue]);
		}else if(accountTypeValue==1){
			decreaseAccountMoney(amountValue);
			expenseAmount.add(amountValue);
			expenseCategory.add(categoryList.get(categoryValue));
			expenseAccountType.add(accountTypeList[accountTypeValue]);
		}
		
		System.out.println(SPT.spacePrinter(7)+"Expense Added Successfully");
		System.out.println(accountTypeValue==0?("Cash Balance: ₹"+getCash()):("Account Balance: ₹"+getAccount()));
		System.out.println("Total Balance: ₹"+getTotalMoney());
	}
	
	public void expenseReport() {
		System.out.println(SPT.linePrinter(50)+"\n"+SPT.spacePrinter(18)+"Expense Report\n"+SPT.linePrinter(50));
		System.out.println("S.NO | ACCOUNT TYPE |  CATEGORY  |  EXPENSE AMOUNT\n"+SPT.linePrinter(50));
		if(!expenseAmount.isEmpty()) {
			for (int i = 0; i < expenseAmount.size(); i++) {
				System.out.println("  "+SPT.format1(""+(i+1),3 )+"| "+SPT.format1(expenseAccountType.get(i), 13)+"|  "+SPT.format1(expenseCategory.get(i), 10)+"|  ₹"+SPT.format1(""+expenseAmount.get(i), 13));
			}
		}else {
			System.out.println(SPT.spacePrinter(19)+"--- Empty ---");
		}
		System.out.println(SPT.linePrinter(50));
	}
	
	public void displayBalace() {
		System.out.println(SPT.linePrinter(26)+"\n"+SPT.spacePrinter(9)+"Balance\n"+SPT.linePrinter(26));
		System.out.println("Cash Balance: ₹"+getCash()+"\nAccount Balance: ₹"+getAccount());
		System.out.println("Total Balance: ₹"+getTotalMoney());
	}
	
	
}
//S.NO | ACCOUNT TYPE |  CATEGORY  |  EXPENSE AMOUNT