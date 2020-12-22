package Tread;

public class Test_Bank_Thread {

	public static void main(String[] args) {
		// 1.設計一個共用帳號可以依存提款(期初金額1000)，有3位使用者，對此帳號存取不同金額(+是存款，-是提款)，試用同步方式，處理此帳戶餘額
		// 想把帳戶跟ATM操作用calss各別獨立分開

		Account account1 = new Account();
		account1.setName("老孟");
		account1.setMoney(6000);
		ATM u1 = new ATM(account1, "+", 500);
		Account account2 = new Account();
		account2.setName("老李");
		account2.setMoney(5000);
		ATM u2 = new ATM(account2, "-", 5000);
		u1.start();
		u2.start();
	}

}

class ATM extends Thread {
	String strName, strN;
	int intTotal, intMoney;
	Account acc;

	ATM(Account ac, String n, int money) {
		this.acc = ac;
		this.strN = n;
		this.intMoney = money;
	}

	public void run() {
		strName = acc.getName();
		intTotal = acc.getMoney();
		if (getAccountStatus() == true) {
			System.out.println("帳戶:  " + strName + " ，餘額" + intTotal + "元");
		} else {
			System.out.println("帳戶:  " + strName + " ，餘額還不夠" + intTotal + "元...，僅能領款" + (intMoney - intTotal) + "元喔");
		}
	}

	// 帳戶提存款
	public synchronized boolean getAccountStatus() {
		if (strN.equals("-") && intMoney <= acc.getMoney()) {
			intTotal = intTotal - intMoney;
			return true;
		} else if (strN.equals("+")) {
			intTotal = intMoney + intTotal;
			return true;
		} else {
			intTotal = intMoney - intTotal;
			return false;
		}
	}
}

class Account {
	private String strAcuName;
	private int intTotal;

	public void setName(String name) {
		if (name != "")
			this.strAcuName = name;
	}

	public String getName() {
		return strAcuName;
	}

	public void setMoney(int money) {
		this.intTotal = money;
	}

	public int getMoney() {
		return intTotal;
	}
}