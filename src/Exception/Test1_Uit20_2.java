package Exception;

import java.util.Scanner;

public class Test1_Uit20_2 {
	/*
	 * 自行定義一個檢查薪資的例外，若薪資介於25000~50000之間， 則顯示姓名及薪資。
	 * 若不在25000~50000範圍，則自行拋出例外並顯示適當訊息
	 */
	public static void main(String[] args) {
		Payrool payrool = new Payrool();
		String strName;
		int intMoney;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入員工名稱:");
		strName = scn.next();
		System.out.print("請輸入薪水:");
		intMoney = scn.nextInt();
		try {
			payrool.calPayrool(strName, intMoney);
		} catch (PayroolException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		scn.close();
	}
}

class PayroolException extends Exception {
	String str;

	public PayroolException(String strErreor) {
		this.str = strErreor;
	}

	public String getMessage() {
		return str;
	}
}

class Payrool {
	private String name;
	private int payrool;
	String strError = "超出範圍，這薪水似乎比自己還高ㄟ... @@?";

	public void calPayrool(String name, int money) throws PayroolException {
		// 若薪資介於25000~50000之間， 則顯示姓名及薪資。
		this.name = name;
		this.payrool = money;

		if (payrool > 25000 && payrool < 50000) {
			System.out.print("姓名:" + name + ", 薪資:" + payrool);
		} else {
			throw new PayroolException(strError);
		}

	}
}