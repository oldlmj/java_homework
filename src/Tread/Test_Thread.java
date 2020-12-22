package Tread;

public class Test_Thread {

	public static void main(String[] args) {
		// 1.設計一個共用帳號可以依存提款(期初金額1000)，有3位使用者，對此帳號存取不同金額(+是存款，-是提款)，試用同步方式，處理此帳戶餘額
		Bank bnk1 = new Bank("u1", "-", 523);
		Bank bnk2 = new Bank("u2", "+", 915);
		Bank bnk3 = new Bank("u3", "-", 1500);
		bnk1.start();
		bnk2.start();
		bnk3.start();
		// 將上方 synchronization (同步)改為 join 方式
		Bank1 bnk4 = new Bank1("u4", "-", 123);
		Bank1 bnk5 = new Bank1("u5", "-", 600);
		Bank1 bnk6 = new Bank1("u6", "+", 10);
		bnk4.start();
		try{
			bnk4.join();
		}catch(InterruptedException e){
			System.out.print(e);
		}
		bnk5.start();
		try{
			bnk5.join();
		}catch(InterruptedException e){
			System.out.print(e);
		}
		bnk6.start();
		try{
			bnk6.join();
		}catch(InterruptedException e){
			System.out.print(e);
		}
	}
}

class Bank extends Thread {
	String strName, strN;
	int intMoney = 1000, intN;

	Bank(String name, String n, int money) {
		this.strName = name;
		this.strN = n;
		this.intN = money;
	}

	public void run() {
		if (getAccountStatus() == true) {
			System.out.println("帳戶" + strName + " ，餘額" + intMoney + "元");
		}
		else{
			System.out.println("帳戶" + strName + " ，餘額不夠" + intMoney + "元喔");
		}
	}
	//帳戶提存款
	public synchronized boolean getAccountStatus() {
		if (strN.equals("-") && intN <= intMoney) {
			intMoney = intMoney - intN;
			return true;
		} else if (strN.equals("+")) {
			intMoney = intMoney + intN;
			return true;
		} else {
			intMoney = intMoney - intN;
			return false;
		}
	}
}

class Bank1 extends Thread {
	String strName, strN;
	int intMoney = 1000, intN;

	Bank1(String name, String n, int money) {
		this.strName = name;
		this.strN = n;
		this.intN = money;
	}

	public void run() {
		if (getAccountStatus() == true) {
			System.out.println("帳戶" + strName + " ，餘額" + intMoney + "元");
		}
		else{
			System.out.println("帳戶" + strName + " ，餘額不夠" + intMoney + "元喔");
		}
	}
	//帳戶提存款
	public  boolean getAccountStatus() {
		if (strN.equals("-") && intN <= intMoney) {
			intMoney = intMoney - intN;
			return true;
		} else if (strN.equals("+")) {
			intMoney = intMoney + intN;
			return true;
		} else {
			intMoney = intMoney - intN;
			return false;
		}
	}
}
