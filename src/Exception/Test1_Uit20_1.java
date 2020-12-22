package Exception;

import java.util.Scanner;

class BankException extends Exception {
	private int money;

	public BankException(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
}

class Bank {
	String account; // 帳號
	int blance; // 存款餘額
	int total;

	// 檢查存款金額是否大於0
	void saveMoney(String strAcn, int intSave) throws BankException {
		if (intSave > 0) // 若大於0則為餘額+存款金額，否則拋出例外說存款不得為0
			blance += intSave;
		else {
			throw new BankException(intSave);
		}
	}

	// 檢查提款金額是否大於存款金額
	void takeMoney(String strAcn, int take) throws BankException {
		if (take <= blance) {
			blance -= take;
		} else { // 大於則將欠款金額丟到例外
			int intshort = take - blance;
//			System.out.print("take: "+take);
			throw new BankException(intshort);
		}
	}
}

public class Test1_Uit20_1 {
	/*
	 * 
	 * 1.自行定義一個BankException例外 2.模擬一個銀行帳戶，可存款與提款=>建立類別
	 * 3.當提款金額大於存款餘額時即觸發BankException例外處理
	 * 
	 */
	public static void main(String[] args) {
		int intMoeny, intActMoney;
		String strAccount = "1412009";
		Scanner scn = new Scanner(System.in);
		System.out.print("請問是要提款或存款呢 ?\n存款選擇 1、提款選擇 2: ");
		int i = scn.nextInt();
		Bank bank = new Bank();
		bank.blance = 100;
		if (i == 1) {
			// 存款動作
			System.out.println("==== 存款 ====");
			System.out.println("請輸入存款人名字: ");
			strAccount = scn.next();
			System.out.println("請輸入存款金額: ");
			intMoeny = scn.nextInt();
			try {
				bank.saveMoney(strAccount, intMoeny);
				System.out.println("餘額: " + bank.blance);
			} catch (BankException e) {
				System.out.println("存款金額不得為: " + e.getMoney());
				e.printStackTrace();
			}
		} else if (i == 2) {
			// 提款動作
			System.out.println("==== 提款 ====");
			System.out.println("請輸入提款人名字: ");
			strAccount = scn.next();
			System.out.println("請輸入提款金額");
			intMoeny = scn.nextInt();
			try {
				bank.takeMoney(strAccount, intMoeny);
				System.out.println("餘額: " + bank.blance);
			} catch (BankException e) {
				System.out.println("欠款金額為: " + e.getMoney());
				e.printStackTrace();
			}

		}
		else {
			System.out.print("請輸入正確選項!!");
		}
	}
}
