package Test;

import java.util.Scanner;

public class HomeWorkUseForDoWhileArray {
	//	Date0709
	public static void main(String[] args) {
		// 顯示99乘法表用Do...while
		calTest99DoWile();
		// 顯示99乘法表用Do...while
		calTest99While();
		// 顯示1-100的奇數跟偶數
		calTestNumber();
		// 顯示1-100的奇數跟偶數
		calTest6_1_2();
		// 書本P6-18 3.
		calTest6_3();
		// 書本P6-18 4.
		calTest6_4();
		// 書本P6-18 5.
		calTest6_5();
		// 書本P6-18 7.
		calTest6_7();
		// 書本P6-18 8.
		calTest6_8();
		// 書本P6-18 9.1 依題目設計使用for迴圈
		calTest6_9$1();
		// 書本P6-18 9.2 依題目設計使用while迴圈
		calTest6_9$2();
		// 書本P6-18 10.
		calTest6_10_1();
		calTest6_10_2();
		calTest6_10_3();
		// 輸入身分證並驗證
		calTest000();
		// 目前是指定性別的數字是誰
		calTest001();
		// 找出陣列中最大最小值
		P710_7_2_9();
		// 使用二維陣列放不規則的資料，找出最大及最小值並計算列的總和
		P7_Test();
	}

	// 顯示99乘法表用Do...while
	public static void calTest99DoWile() {
		int i = 1, x;
		do {
			x = 1;
			do {
				System.out.print(i + "X" + x + "=" + x * i + "\t");
				x += 1;
			} while (x < 10);
			System.out.println();
			i += 1;
		} while (i < 10);
	}

	// 顯示99乘法表用while
	public static void calTest99While() {
		int i = 1, x;
		while (i < 10) {
			x = 1;
			while (x < 10) {
				System.out.print(i + "X" + x + "=" + x * i + "\t");
				x += 1;
			}
			System.out.println();
			i += 1;
		}
	}

	// 顯示1-100的奇數跟偶數
	public static void calTestNumber() {
		int x;
		for (x = 1; x <= 100; x++) {
			if (x % 2 == 0) {
				continue;
			}
			System.out.print("奇數=" + x + "\t");
		}
		System.out.println();
		for (x = 1; x <= 100; x++) {
			if (x % 2 != 0) {
				continue;
			}
			System.out.print("偶數=" + x + "\t");
		}

	}

	// 書本P6-18 1.~2.
	public static void calTest6_1_2() {
		System.out.println("== 書本P6-18 1.~2. ==");
		int i, x = 0, y = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				x = x + i;
			} else
				y = y + i;
		}
		System.out.println("偶數 = " + x);
		System.out.println("奇數 = " + y);
	}

	// 書本P6-18 3.
	public static void calTest6_3() {
		System.out.println("== 書本P6-18 3. ==");
		Scanner scn = new Scanner(System.in);
		int intNur = 0, i = 1, iniFinl = 38;
		String strZ;
		char chrExit = ' ';

		do {
			System.out.print("請輸入數字~");
			while (chrExit != 'q') {
				intNur = scn.nextInt();
				if (intNur == iniFinl) {
					System.out.println("喔喔 猜中了!!!! XD");
					break;
				} else if (intNur < iniFinl) {
					System.out.print("有點小，再猜大一點，若不想繼續請按Q(不分大小寫): ");
					while (!scn.hasNextInt()) {
						strZ = scn.next();
						chrExit = strZ.charAt(0);
						System.out.print("您總共猜了" + i + "次");
					}
				} else {
					System.out.print("超過了，再猜小一點，若不想繼續請按Q(不分大小寫): ");
					while (!scn.hasNextInt()) {
						strZ = scn.next();
						chrExit = strZ.charAt(0);
						System.out.print("您總共猜了 " + i + " 次");
					}
				}
				i += 1;
			}
		} while (intNur != iniFinl);

	}

	// 書本P6-18 3.顯示1-100的質數
	public static void calTest6_4() {
		int i, j;
		for (i = 1; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j >= i)
				System.out.print(i + " ");
		}
	}

	// 書本P6-18 5.
	public static void calTest6_5() {
		System.out.println("== 書本P6-18 5. ==");
		float intW = 50f;
		for (int x = 1; x < 10; x++) {
			intW += 1.2;
			System.out.printf(x + "年後體重: %3.1f%n", intW);
		}
	}

	// 書本P6-18 7.
	public static void calTest6_7() {
		System.out.println("== 書本P6-18 7. ==");
		Scanner scn = new Scanner(System.in);
		int intH, intW; // 宣告寬度、長度的變數
		System.out.print("請輸入寬度: ");
		intW = scn.nextInt(); // 得到寬度的輸入值
		System.out.print("請輸入高度: ");
		intH = scn.nextInt();// 得到高度的輸入值
		for (int x = 0; x < intH; x++) { // 此為高度迴圈
			for (int y = 0; y < intW; y++) {// 此為寬度迴圈
				System.out.print("*");
			}
			System.out.println();
		}
		scn.close();
	}

	// 書本P6-18 8.
	public static void calTest6_8() {
		int x, y = 998;
		for (x = 0; x < 1000; x++) {
			if (x == y) {
				System.out.print("Bingo");
				break;
			}
			System.out.println(x + " 密碼錯");
		}
	}

	// 書本P6-18 9.1 依題目設計使用for迴圈
	public static void calTest6_9$1() {
		System.out.println("== 書本P6-18 9.1 將兩個數字累計加總，而第2個數字必須大於第1個 == ");
		System.out.println("== 使用for迴圈 == ");
		Scanner scn = new Scanner(System.in);
		int intN, intM, intT = 0, int2;
		System.out.print("請輸入數字1: ");
		intN = scn.nextInt();
		System.out.print("請輸入數字2: ");
		intM = scn.nextInt(); // 給予intM的值來自於請輸入數字2的輸入值
		do { // 若intM小於intN，則會進行迴圈，直到intM大於intN為止
			if (intN < intM) { // 當intM大於intN時，直接跳出此迴圈
				break;
			} else {
				System.out.print("請輸入比數字1大一點，否則無法進行下一步: ");
				intM = scn.nextInt();
			}
		} while (intN >= intM);
		// 兩個數值累計相加
		for (int x = intN; x <= intM; x++) {
			intT = intT + x;
		}
		System.out.println(intN + "+" + intM + "=" + intT);
		scn.close();
	}

	public static void calTest6_9$2() {
		System.out.println("== 書本P6-18 9.2 將兩個數字累計加總，而第2個數字必須大於第1個 == ");
		System.out.println("== while迴圈 == ");
		Scanner scn = new Scanner(System.in);
		int intN, intM, intT = 0, X;
		System.out.print("請輸入數字1: ");
		intN = scn.nextInt();
		System.out.print("請輸入數字2: ");
		intM = scn.nextInt(); // 給予intM的值來自於請輸入數字2的輸入值
		do { // 若intM小於intN，則會進行迴圈，直到intM大於intN為止
			if (intN < intM) { // 當intM大於intN時，直接跳出此迴圈
				break;
			} else {
				System.out.print("請輸入比數字1大一點，否則無法進行下一步:");
				intM = scn.nextInt();
			}
		} while (intN >= intM);
		X = intN;
		while (X <= intM) {
			intT = intT + X;
			X += 1;
		}
		System.out.println(intN + "+" + intM + "=" + intT);
		scn.close();
	}

	// 書本P6-18 10.
	public static void calTest6_10_2() {
		System.out.println("== 書本P6-18 10.2 依題目設計 == ");
		Scanner scn = new Scanner(System.in);
		int intN = scn.nextInt(); // 設f為n
		int n = 0;
		for (int x = 0; x < intN; x++) {
			if (intN % 2 == 0) {
				n = -(x - 1);
				System.out.print(n);
			} else {
				System.out.print("+" + n);
			}
			// 4n += 1;
		}
		scn.close();
	}

	public static void calTest6_10_1() {
		System.out.println("== 書本P6-18 10.1 依題目設計使用while迴圈 == ");
		Scanner scn = new Scanner(System.in);
		int intN, intM, intX, intI = 0;
		System.out.print("請輸入奇數: ");
		intN = scn.nextInt();
		for (int intT = 1; intT <= intN; intT++) {
			System.out.print(intT + "+");
			intT += 1;
		}
		System.out.println();
		scn.close();
	}

	public static void calTest6_10_3() {
		System.out.println("== 書本P6-18 10.3 依題目設計使用while迴圈 == ");
		Scanner scn = new Scanner(System.in);
		int intX;
		System.out.println("請輸入數字: ");
		intX = scn.nextInt();
		for (int intT = 1; intT <= intX; intT++) {
			System.out.print(intT + "/" + intX + "+");
			// intT = 1 / intT;
		}
		scn.close();
	}

	// 輸入身分證並驗證
	public static void calTest000() {
		Scanner scn = new Scanner(System.in);
		String srtA = "", strB = "";
		int intX, intY, intZ = 0, c = 8;
		int[] T = new int[10]; // 用int[]放身分證後9碼的數值
		char chrR;
		boolean flag; // 旗子
		System.out.print("請輸入身份證字號:");
		srtA = scn.next();
		// 判斷字數是否輸入正確
		if (srtA.length() == 10) {
			System.out.println("輸入字數不對!!!請重新輸入:");
			srtA = scn.next();
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
	// 目前是指定性別的數字是誰
	public static void calTest001() {
		// 目前是指定性別的數字不見，因此要反推回去此性別是誰，比較單純
		Scanner scn = new Scanner(System.in);
		String srtA = "", strB = "";
		int intX, intY, intZ = 0, c = 7;
		int[] T = new int[9]; // 用int[]放身分證後9碼的數值
		boolean flag = false;
		char chrR;
		System.out.print("請輸入身份證字號:");
		srtA = scn.next();
		chrR = srtA.toUpperCase().charAt(0); // 將身份證開頭英文強制轉大寫
		// 用for拆解文字並依序放入字串陣列，為了好記憶，才從1開始
		for (int x = 1; x < 9; x++) {
			intX = Integer.parseInt(srtA.substring(x, x + 1));
			T[x] = intX;
		}
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
		for (int i = 1; i < 8; i++) {
			intZ = intZ + T[i] * c;
			// System.out.println(T[i] + "-" + intZ);
			c = c - 1;
		}
		// 將一開始找好的地區數字做切割，並乘上相對應的值，再加剛上方迴圈跑完的值
		intZ = intZ + (Integer.parseInt(strB.substring(0, 1)) * 1) + (Integer.parseInt(strB.substring(1, 2)) * 9);
		int z = 1, n;
		// 因為是判斷性別，所以較單純一點，
		do {
			intZ = intZ + z * 8;
			n = 10 - (intZ % 10);
			if (n != 1) {
				System.out.println("此人性別號碼是 " + 2);
				z += 1;
				break;
			} else {
				System.out.println("此人性別號碼是 " + 1);
				break;
			}
		} while (z <= 3); // 因為性別沒有號碼3，因此設定條件<=3，就跳出迴圈
		scn.close();
	}

	// 找出陣列中最大最小值
	public static void P710_7_2_9() {
		int[] AryInt = { 45, 79, 61, 30, 90 };
		int intMax, intMin, intTmp = 0;
		intMax = intMin = AryInt[0];
		for (int x = 1; x < AryInt.length; x++) {
			if (AryInt[x] < intMax) {
				intMax = AryInt[x];
			}
			if (AryInt[x] > intMin) {
				intMin = AryInt[x];
			}
		}
		System.out.println("最大值:" + intMax + "   最小值:" + intMin);
	}

	// 使用二維陣列放不規則的資料，找出最大及最小值並計算列的總和
	public static void P7_Test() {
		int[][] intX = { { 3, 90, 61, 9, 15 }, { 25, 66, 2, 51, 38 }, { 60, 26, 101, 46, 51 } };
		int intMax, intMin, intTmp;
		intMax = intMin = intX[0][0];
		for (int x = 0; x < intX.length; x++) {
			intTmp = 0;
			for (int y = 0; y < intX[x].length; y++) {
				if (intX[x][y] > intMax) {
					intMax = intX[x][y];
				} else if (intMin > intX[x][y]) {					
					intMin = intX[x][y];
				}
				intTmp = intTmp + intX[x][y];
			}
			System.out.println("第" + x + "列  = " + intTmp);
		}
		System.out.println("最大值: " + intMax + "   最小值: " + intMin);
	}
}


