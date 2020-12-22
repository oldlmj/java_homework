package OIverlading;

import java.util.Scanner;

class claCount {
	int int1, int2, intT;
	int[] y;
	String str;

	claCount() {
		int1 = int2 = intT = 0;
	}

	// + 加法
	int clacountplus(int a, int b, String s) {
		int1 = a;
		int2 = b;
		str = s;
		if (s == "+")
			intT = int1 + int2;
		return intT;
	}

	// - 減法
	int clacountlower(int a, int b, String s) {
		int1 = a;
		int2 = b;
		str = s;
		if (s == "-")
			intT = int1 - int2;
		return intT;
	}

	// x 乘法
	int clacountfour(int a, int b, String s) {
		int1 = a;
		int2 = b;
		str = s;
		if (s == "*")
			intT = int1 * int2;
		return intT;
	}

	int clacountdivsion(int a, int b, String s) {
		int1 = a;
		int2 = b;
		str = s;
		if (s == "/")
			intT = int1 / int2;
		return intT;
	}
}

public class Date0723 {
	// 使用方法之多載呈現+-*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C = 0;
		String strcount;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入數字:");
		A = scn.nextInt();
		System.out.print("請輸入數字:");
		B = scn.nextInt();
		System.out.print("請問要加(+)減(-)乘(*)除(/)哪個，輸入符號即可:");
		strcount = scn.next();
		claCount calc = new claCount();
		// 用switch...case則一選擇要呼叫類別方法
		switch (strcount) {
		case "+":
			C = calc.clacountplus(A, B, strcount);
			break;
		case "-":
			C = calc.clacountplus(A, B, strcount);
			break;
		case "/":
			C = calc.clacountplus(A, B, strcount);
			break;
		case "*":
			C = calc.clacountplus(A, B, strcount);
			break;
		}
		System.out.print(A + strcount + B + " = " + C);
	}

}
