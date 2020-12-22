package ClassAndConstructor;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		// 使用者輸入一個5個長度的字串
		// 1.長度是否為5
		// 2.第2個字元是否為英文字
		// 3.請將上述檢驗透過建構元完成
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入英文字: ");
		String str = scn.next();
		U2 u2 = new U2(str);
	}
}

class U2 {
	String str;
	boolean b = true;
	int i = 0;

	U2(String str) {
		this(str.charAt(1));
		if (str.length() >= 5) {
			System.out.println("字數有達到~ :P");
		} else {
			strError(1);
			}
	}

	U2(char chr) {
		if ((int) chr >= 65 && (int) chr <= 122 ) {
			System.out.println("第2個字是英文字無誤~ :)");
		} else {
			strError(2);
		}
	}

	// 錯誤提示訊息
	void strError(int i) {
		if (i == 1) {
			System.out.println("請至少輸入5個字元!! :(");
		} else if (i == 2) {
			System.out.println("第2個字請輸入英文!! :(");
		}
	}

}
