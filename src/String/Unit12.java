package String;

import java.util.Scanner;

public class Unit12 {

	public static void main(String[] args) {
		//test6();
		// other1();
		 other2(); // 將先前寫的身分證程式碼，少少部分改用正則表達式
	}

	public static void test1() {
		String[] strUschool = { "Abcdsjosf", "Oosjfo", "School" };
		System.out.println("字串總長度: " + strUschool.length);
		System.out.print("字串轉大寫英文=");
		for (int i = 0; i < strUschool.length; ++i) {
			System.out.print(strUschool[i].toUpperCase() + " ");
		}
	}

	public static void test2() {
		String str = "abcdefghijklmnopqrsyuvwxyz", srtInput;
		Scanner scn = new Scanner(System.in);
		srtInput = scn.next();
		if (str.indexOf(srtInput) < 0) {
			System.out.print("您輸入非小寫英文字");
		} else {
			System.out.print("索引值位在 " + str.indexOf(srtInput));
		}

		scn.close();
	}

	public static void test3() {
		String str = "abcdefghijklmnopqrsyuvwxyz", srtInput, strChg;
		StringBuffer bstr = new StringBuffer(str);
		System.out.print("請輸入想更換的小寫英文: ");
		Scanner scn = new Scanner(System.in);
		srtInput = scn.next();
		System.out.print("請問要更換的小寫英文是: ");
		strChg = scn.next();
		if (str.indexOf(srtInput) < 0) {
			System.out.print("您輸入非小寫英文字!!!");
		} else {
			System.out.println(srtInput + "的索引值位在 " + str.indexOf(srtInput));
			bstr.replace(str.indexOf(srtInput), str.indexOf(srtInput) + 1, strChg);
			System.out.println(srtInput + "已更換成" + strChg);
			System.out.println(bstr);
		}

		scn.close();
	}

	public static void test4() {
		String str = "神鵰俠侶是楊過跟小龍女的故事，我喜歡小龍女，也討厭小龍女，巴拉巴拉小龍女，飄飄小龍女";
		StringBuffer bstr = new StringBuffer(str);
		String strN = "小龍女";
		int time = 1;
		for (int i = bstr.indexOf(strN); i <= bstr.lastIndexOf(strN); ++i) {
			if (bstr.indexOf(strN) != bstr.indexOf(strN, i)) {
				bstr.delete(i, i + 1);
				time += 1;
			}
		}
		System.out.print("出現次數:" + time);
	}

	public static void test5() {
		String str = "Java 11 ";
		StringBuffer bstr = new StringBuffer(str);
		bstr.append("I love Java 11");
		System.out.print(bstr);
	}

	public static void test6() {
		String str1 = "java";
		String str2 = "Java";
		if (str1.compareTo(str2) == 0)
			System.out.println("用compareTo來比較str1跟str2: true");
		else
			System.out.println("用compareTo來比較str1跟str2: false");
		if (str1.compareToIgnoreCase(str2) == 0)
			System.out.println("用compareToIgnoreCase來比較str1跟str2: true");
		else
			System.out.println("用compareToIgnoreCase來比較str1跟str2: false");
		System.out.println("用equals來比較str1跟str2: " + str1.equals(str2));
		System.out.println("用equalsIgnoreCase來比較str1跟str2: " + str1.equalsIgnoreCase(str2));
	}

	public static void other1() {
		/*
		 * 使用者輸入整數 1.請將此整數換成國字大寫 2.不能當機
		 */
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數:");
		int intNum = scn.nextInt();
		String strI = String.valueOf(intNum);
		String strO;
		String strnum = "1234567890";
		String strNum = "壹貳參肆伍陸柒捌玖零";
		String strM = "億仟佰拾萬仟佰拾元";
		// System.out.print(strM.substring(1, 1));
		for (int i = 0; i < strI.length(); i++) {
			int v = Integer.parseInt(strI.substring(i, i + 1));
			try {
				if (v + 1 >= 10) {
					strO = strNum.substring(strnum.indexOf(strI.substring(i, i + 1)), 9);
					System.out.print(strO);
				} else {
					strO = strNum.substring(strnum.indexOf(strI.substring(i, i + 1)), v);
					System.out.print(strO);
				}
			} catch (StringIndexOutOfBoundsException e) {
				strO = strNum.substring(strnum.indexOf(strI.substring(i, i - 1)), 9);
				System.out.print(strO);
			}
			// 下方try整個要做修改
			try {
				if (i >= 9) {
					strO = strM.substring(i + 7, 8);
					System.out.print(strO);
				} else {
					strO = strM.substring(i + 7, i + 8);
					System.out.print(strO);
				}
			} catch (StringIndexOutOfBoundsException e) {
				strO = strM.substring(i, 9);
				System.out.print(strO);
			}
		}
		scn.close();

	}

	// 輸入身分證並驗證
	public static void other2() {
		Scanner scn = new Scanner(System.in);
		String srtA = "", strB = "",patternTotal="\\w\\d{9}";
		int intX, intY, intZ = 0, c = 8;
		int[] T = new int[10]; // 用int[]放身分證後9碼的數值
		char chrR;
		boolean flag; // 旗子
		System.out.print("請輸入身分證字號:");
		srtA = scn.next();
		// 判斷字數是否輸入正確
		if (!srtA.matches(patternTotal)) {
			System.out.print("身分證輸入長度不夠或沒有開頭英文字!!! \n請重新輸入:");
			srtA = scn.next();
		}
		chrR = srtA.toUpperCase().charAt(0); // 將身份證開頭英文強制轉大寫
		do {
			flag = false; 
			for (int x = 1; x < 10; x++) {
				intX = Integer.parseInt(srtA.substring(x, x + 1));
				T[x] = intX;
				// 判斷性別是否輸入正確
				if (T[1] < 3) { // 第一個數字小於3，代表是對的則繼續放進int[]
					T[x] = intX;
				} else {
					// 到這代表第一個數字輸入錯誤，因此flag變成true
					flag = true;
					System.out.println("第一個數字輸入錯誤!!!請重新輸入:");
					// 提示錯誤，並要求使用者再次重新輸入
					srtA = scn.next();
					break; // 直接跳出此迴圈
				}
			}
		} while (flag == true);
		// 判斷是哪個地區並給予相對應的值
		switch (chrR) {
		case 'A':
			intY = 10;
			strB = String.valueOf(intY);
			break;
		case 'B':
			intY = 11;
			strB = String.valueOf(intY);
			break;
		case 'C':
			intY = 12;
			strB = String.valueOf(intY);
			break;
		case 'D':
			intY = 13;
			strB = String.valueOf(intY);
			break;
		case 'E':
			intY = 14;
			strB = String.valueOf(intY);
			break;
		case 'F':
			intY = 15;
			strB = String.valueOf(intY);
			break;
		case 'G':
			intY = 16;
			strB = String.valueOf(intY);
		case 'H':
			intY = 17;
			strB = String.valueOf(intY);
			break;
		case 'I':
			intY = 34;
			strB = String.valueOf(intY);
			break;
		case 'J':
			intY = 18;
			strB = String.valueOf(intY);
			break;
		case 'K':
			intY = 19;
			strB = String.valueOf(intY);
			break;
		case 'L':
			intY = 20;
			strB = String.valueOf(intY);
			break;
		case 'M':
			intY = 21;
			strB = String.valueOf(intY);
			break;
		case 'N':
			intY = 22;
			strB = String.valueOf(intY);
			break;
		case 'O':
			intY = 35;
			strB = String.valueOf(intY);
			break;
		case 'P':
			intY = 23;
			strB = String.valueOf(intY);
		case 'Q':
			intY = 24;
			strB = String.valueOf(intY);
			break;
		case 'R':
			intY = 25;
			strB = String.valueOf(intY);
			break;
		case 'S':
			intY = 26;
			strB = String.valueOf(intY);
			break;
		case 'T':
			intY = 27;
			strB = String.valueOf(intY);
			break;
		case 'U':
			intY = 28;
			strB = String.valueOf(intY);
			break;
		case 'V':
			intY = 29;
			strB = String.valueOf(intY);
			break;
		case 'W':
			intY = 32;
			strB = String.valueOf(intY);
			break;
		case 'X':
			intY = 30;
			strB = String.valueOf(intY);
			break;
		case 'Y':
			intY = 31;
			strB = String.valueOf(intY);
			break;
		case 'Z':
			intY = 32;
			strB = String.valueOf(intY);
			break;
		}
		// 把後面數字各別從T[]陣列提取進行加乘
		for (int i = 1; i < 9; i++) {
			intZ = intZ + T[i] * c;
			// System.out.println(T[i]+"-"+intZ);
			c = c - 1;
		}
		// 將一開始找好的地區數字做切割，並乘上相對應的值，再加剛上方迴圈跑完的值
		intZ = intZ + (Integer.parseInt(strB.substring(0, 1)) * 1) + (Integer.parseInt(strB.substring(1, 2)) * 9);
		// 用if來判斷條件 總和除以10的餘數，再10-於術後是否等於檢查碼，確認檢查碼是否正確
		if ((10 - (intZ % 10)) == T[9]) {
			System.out.print("檢查碼是相同的");
		} else {
			System.out.print("身分證有問題!!");
		}
		scn.close();
	}
}
