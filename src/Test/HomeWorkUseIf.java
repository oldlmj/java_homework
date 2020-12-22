package Test;

import java.util.Scanner;

public class HomeWorkUseIf {
	// Date0708
	public static void main(String[] args) {
		// 0708-1 判斷輸入成績是否及格，再加上預防判斷成績輸入錯誤
		calTest1();
		// 0708-2 判斷輸入值為基偶數
		calTest2();
		// 0708-3 判斷大小寫字母
		calTest3();
		// 0708-4 設計一個輸入帳號密碼並比較是否正確(請先設一組帳號密碼)
		calTest4();
		// 0708-6 輸入西元年份來判斷是否為年
		calTest6();
		// 書本P2-11_3
		calTestp2113();
		// 朝被召喚計算閏年之老孟變化題=>列出所有年份並判斷是否為閏年
		calTestYear();
		// 0708-5 輸入3個數字，並判斷最大最小值
		calTestVal();
		// 設計用鍵盤輸入值進行判斷及計算(年齡及電影票數量總和計算)
		calMovieTickets();

	}

	// 0708-1 判斷輸入成績是否及格，再加上預防判斷成績輸入錯誤
	public static void calTest1() {
		Scanner scn = new Scanner(System.in);
		System.out.println("==判斷輸入成績是否及格，再加上預防判斷成績輸入錯誤==");
		System.out.print("請輸入成績: ");
		int intN = scn.nextInt();
		if (intN > 100 || intN < 0) {
			System.out.println("輸入錯誤!!");
		} else if (intN > 60 && intN < 100) {
			System.out.println("及格~~~");
		} else if (intN < 60) {
			System.out.println("不及格!!!");
		}
		scn.close();
	}

	// 0708-2 判斷輸入值為基偶數
	public static void calTest2() {
		System.out.println("==判斷輸入值為基偶數==");
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入數值: ");
		int intN = scn.nextInt();

		if (intN % 2 == 0) {
			System.out.println("偶數");
		} else {
			System.out.println("基數");
		}
		scn.close();
	}

	// 0708-3 判斷大小寫字母
	public static void calTest3() {
		System.out.println("==判斷大小寫字母==");
		Scanner scn3 = new Scanner(System.in);
		System.out.print("請輸入字母: ");
		char chr = scn3.next().charAt(0);
		// 65 大 97 小
		int X = (int) chr;
		if (X <= 96 && X >= 65) {
			System.out.println("此字母為大寫");
		} else if (X <= 122 && X >= 97) {
			System.out.println("此字母為小寫");
		} else {
			System.out.println("請勿輸入其他字元!! O3O");
		}
		scn3.close();
	}

	// 0708-4 設計一個輸入帳號密碼並比較是否正確(請先設一組帳號密碼)
	public static void calTest4() {
		System.out.println("==設計一個輸入帳號密碼並比較是否正確(帳號:root 密碼:mj1212)==");
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入帳號: ");
		String strAdm = scn.next();
		System.out.print("請輸入密碼: ");
		String strPwd = scn.next();
		String adm = "root", pwd = "mj1212";
		if (strAdm.equals(adm) && strPwd.equals(pwd)) {
			System.out.print("恭喜輸入正確~XD");
		} else {
			System.out.print("帳密不對!!!!!!");
		}
		scn.close();
	}

	// 0708-6 輸入西元年份來判斷是否為年
	public static void calTest6() {
		System.out.println("==輸入西元年份來判斷是否為閏年==");
		int intYear;
		Scanner scn6 = new Scanner(System.in);
		System.out.print("請輸入西元年份->");
		intYear = scn6.nextInt();
		if (intYear % 400 == 0) {
			System.out.print(intYear + " 是閏年");
		} else if ((intYear % 4 == 0) && (intYear % 100 != 0)) {
			System.out.print(intYear + " 是閏年");
		} else {
			System.out.print(intYear + " 不是閏年");
		}
		scn6.close();
	}

	// 書本P2-11_3
	public static void calTestp2113() {
		String strX = "";
		for (int x = 0; x < 2; x++) {
			for (int y = 5; y > 0; y--) {
				System.out.println(strX);
				strX = strX + "xx";
			}
		}
	}

	// 朝被召喚計算閏年之老孟變化題=>列出所有年份並判斷是否為閏年
	public static void calTestYear() {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入開始年份：");
		int intStartYear = scn.nextInt();
		System.out.print("請輸入結束年份：");
		int intEndYear = scn.nextInt();
		for (int intYear = intStartYear; intYear <= intEndYear; intYear++) {
			if (intYear % 400 == 0) {
				System.out.println(intYear + " - 是閏年");
			} else if ((intYear % 4 == 0) && (intYear % 100 != 0)) {
				System.out.println(intYear + " - 是閏年");
			} else {
				System.out.println(intYear + " - 不是閏年");
			}

		}
		scn.close();
	}

	// 0708-5 輸入3個數字，並判斷最大最小值
	public static void calTestVal() {
		System.out.println("== 輸入3個數字，並判斷最大值or最小值 ==");
		int int1, int2, int3;
		Scanner scnVal = new Scanner(System.in);
		System.out.print("請輸入數值 1->");
		int1 = scnVal.nextInt();
		System.out.print("請輸入數值 2->");
		int2 = scnVal.nextInt();
		System.out.print("請輸入數值 3->");
		int3 = scnVal.nextInt();

		if (int1 < int2 && int1 < int3 && int2 < int3) {
			System.out.print("最大值為-> " + int3 + ", 最小值為-> " + int1);
		} else if (int1 < int2 && int1 < int3 && int2 > int3) {
			System.out.print("最大值為-> " + int2 + ", 最小值為-> " + int1);
		} else if (int2 < int1 && int2 < int3 && int1 < int3) {
			System.out.print("最大值為-> " + int3 + ", 最小值為-> " + int2);
		} else if (int2 < int1 && int2 < int3 && int1 > int3) {
			System.out.print("最大值為-> " + int1 + ", 最小值為-> " + int2);
		} else if (int3 < int2 && int3 < int1 && int2 < int1) {
			System.out.print("最大值為-> " + int1 + ", 最小值為-> " + int3);
		} else {
			System.out.print("最大值為-> " + int2 + ", 最小值為-> " + int3);
		}
		scnVal.close();
	}

	// 設計用鍵盤輸入值進行判斷及計算(年齡及電影票數量總和計算)
	public static void calMovieTickets() {
		int intTick = 100, intage, intN;
		Scanner scnVal = new Scanner(System.in);
		System.out.print("請輸入年齡:");
		intage = scnVal.nextInt();
		System.out.print("請輸入購賣數量:");
		intN = scnVal.nextInt();
		if (intage >= 75) {
			intTick = intN * (int) (intTick * 0.3);
			System.out.print("購買票卷=" + intN + ", 總票價=" + intTick);
		} else if (intage >= 60 && intage <= 74) {
			intTick = intN * (int) (intTick * 0.6);
			System.out.print("購買票卷=" + intN + ", 總票價=" + intTick);
		} else if (intage <= 10) {
			intTick = intN * (int) (intTick * 0.5);
			System.out.print("購買票卷=" + intN + ", 總票價=" + intTick);
		} else if (intN == 0) {
			System.out.print("請輸入正確數量");
		} else
			System.out.print("購買票卷=" + intN + ", 總票價=" + intN * intTick);

	}
}
