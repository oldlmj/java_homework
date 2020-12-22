package Test;
/** 0702
 * */
import java.util.Scanner;

public class SetPrimitiveMaxAndMin {

	public static void main(String[] args) {
		// 早上基礎說明();
		// calBMI(); //召喚計算BMI
		// calArea(); //召喚計算面積
		// calASCII(); //計算ASCII碼
		// calEME(); //神秘的挑拖字元，\r可將
		calTube1(); // 考古題
		 // calTube2(); // 考古題
		// cal99(); // 寫出99乘法表
		// calStrFor();//
		// 有一String為"a,b,c,d,e,f,g…"，請分別列印出"a1"、"b1"、"c1"、"d1"、"e1"、"f1"、"g1"…。
		//calTestP();

	}

	/*--------------------------------華麗麗分割線--------------------------------------------*/
	public static void 早上基礎說明() {
		// 資料型態的最大值&最小值
		short shValMax = java.lang.Short.MAX_VALUE, shValMix = java.lang.Short.MIN_VALUE;
		int intValMax = java.lang.Integer.MAX_VALUE, intValMix = java.lang.Integer.MIN_VALUE;
		long longValMax = java.lang.Long.MAX_VALUE, vlongValMix = java.lang.Long.MIN_VALUE;
		float floValMax = java.lang.Float.MAX_VALUE, floValMix = java.lang.Float.MIN_NORMAL;
		double douValMax = java.lang.Double.MAX_VALUE, douValMix = java.lang.Double.MIN_NORMAL;
		System.out.println(shValMax + " +~ " + shValMix);
		// final是將變數固定後再也無法做更動
		final int intNum = 5;
		// 溢出(overflow)，是指該變數的值超出原本宣告資料型態的表示範圍
		// Integer的表示範圍為 2147483647 ~ -2147483648
		System.out.println((intValMax + 5) + " ~ " + intValMix); // 此為最大值溢出
		// 顯示字元型態
		// \ddd -> 此為8進位
		// \ u h h h h -> 此為16進位
		char ch1 = '\107', ch2 = '\u0047', ch3 = 71;
		// ASCII碼的 8進位 16進位 10進位
		System.out.println(ch1 + " " + ch2 + " " + ch3);
	}

	// == 用Scanner跟double做出BMI的程式，而最後BMI顯示不能有小數點(BMI公式=體重/(公分)平方(M))
	public static void calBMI() {
		Scanner scn = new Scanner(System.in); // 宣告一個偵測鍵盤輸入鍵
		double intH, intW, intBMI;
		System.out.print("請輸入身高(cm):");
		try {
			intH = scn.nextInt() / 100.0;
			System.out.print("請輸入體重(kg):");
			intW = scn.nextInt();
			intBMI = intW / (Math.pow(intH, 2));
			System.out.printf("BMI值= %2.0f", intBMI);
		} catch (Exception e) {
			System.out.println("請輸入數字!!");
		}
		scn.close(); // 而沒用到時將偵測鍵盤的功能關閉，來釋放記憶體
	}

	// == 計算面積及體積
	public static void calArea() {
		Scanner scn2 = new Scanner(System.in); // 宣告一個偵測鍵盤輸入鍵
		double intL, intS;
		System.out.print("請輸入半徑:");
		try {
			intL = scn2.nextInt();
			intS = Math.PI * Math.pow(intL, 2);
			System.out.printf("圓面積= %6.2f%n", intS);
			System.out.printf("球體積= %6.2f%n", ((double) 4 / 3) * Math.PI * (Math.pow(intL, 3)));
		} catch (Exception e) {
			System.out.println("請輸入!!");
		}
		scn2.close(); // 而沒用到時將偵測鍵盤的功能關閉，來釋放記憶體
	}

	// == 將輸入的英文字母強制轉換成大寫，同時找出ASCII碼並計算跟A的ASCII碼之間差距
	public static void calASCII() {
		Scanner scn = new Scanner(System.in); // 宣告一個偵測鍵盤輸入鍵
		String strC;
		char chR;
		int I;
		System.out.print("請輸入文字:");
		try {
			strC = scn.next();
			chR = strC.toUpperCase().charAt(0); // toUpperCase是強制轉換大寫，charAt是找指定的位置的英文字母
			I = (int) chR - 65; // 計算跟A的差距
			System.out.print("跟A的差距是 " + I);

		} catch (Exception e) {
			System.out.println("請輸入!!");
		}
		scn.close(); // 而沒用到時將偵測鍵盤的功能關閉，來釋放記憶體
	}

	// ==
	public static void calEME() {
		String X = "AAA";
		String Y = "YVTS YYYY";
		System.out.print("\r" + X);
		System.out.print(Y);
	}

	// 最常見的題目用*來組成三角形=>此為up變化題 //200706 done
	public static void calTube1() {
		String strO = " ", strX = "* ", strY;
		int v = 3;
		// *的處理
		for (int y = 1; y < 6; y++) {
			// 這是空白增加
			for (int x = 6 - y; x > 1; x--) {
				System.out.print(strO);
			}
			System.out.println(strX);
			strX = strX + "* ";
		}
		strY = strX;
		for (int x = 5; x > 1; x--) {
			for (int y = x - 1; y < 4; y++) {
				// 這是空白增加
				System.out.print(strO);
			}
			System.out.println(strY.substring(v));
			v = v + 2;
		}

	}

	// 上面一樣的題目，但不同的解答
	public static void calTube2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
		for (int l = 1; l <= 5 - 1; l++) {
			for (int m = 1; m <= l; m++) {
				System.out.print(" ");
			}
			for (int n = 5 - l; n >= 1; n--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

	// 寫出99乘法表 //200706 done
	public static void cal99() {
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				// 橫向印出
				System.out.print(y + "X" + x + " = " + x * y +" , " );
			}
			System.out.println("");
		}
	}

	// 有一String為"a,b,c,d,e,f,g…"，請分別列印出"a1"、"b1"、"c1"、"d1"、"e1"、"f1"、"g1"…。 =>
	// 0707 done
	public static void calStrFor() {
		String[] str = { "a", "b", "c", "d", "e", "f", "g" };
		for (int x = 0; x < 7; x++) {
			System.out.print("\"" + str[x] + 1 + "\"、");
		}
	}

	// 用*畫出圖型=>使用變數
	public static void calTestP() {
		String strx = "";
		for (int x = 0; x < 5; x++) {
			for (int y = 5 - x; y > 0; y--) {
				System.out.print(" ");
			}
			strx = strx + "*";
			System.out.println(strx);
		}
	}

}
