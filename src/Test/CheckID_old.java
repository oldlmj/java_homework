package Test;

import java.util.Scanner;

public class CheckID_old {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身份證字號:");
		String setInput=scn.next();		
		calTestId(setInput);
		scn.close();
	}
	// 輸入身分證並驗證
	public static void calTestId( String  str) {
		
		String srtA = "", strB = "";
		int intX, intY, intZ = 0, c = 8;
		int[] T = new int[10]; // 用int[]放身分證後9碼的數值
		char chrR;
		boolean flag; // 旗子		
		srtA = str;
		// 判斷字數是否輸入正確
		if (srtA.length() != 10) {
			System.out.println("輸入字數不對!!!請重新輸入:");
			srtA = str;
		}
		chrR = srtA.toUpperCase().charAt(0); // 將身份證開頭英文強制轉大寫
		do {
			flag = false;
			// 
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
					srtA = str;
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
		
	}
}
