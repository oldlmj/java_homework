package Test;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InterviewQuestions {

	public static void main(String[] args) {
		// wordTest1(); // 一、求2數的最大公約以及最小公倍數
		// wordTest2(); // 二、 2020/4/8是星期三，請簡易設計一段程式，輸入2020任何一天，能算出當日是星期幾
		// wordTest3(); // 三、 讓兩個數對換，不得使用第三個數。
		 wordTest4();// 四、撰寫一程式，使得使用者輸入6進位數字能改成10進位，例如使用者輸入11，則回傳7。
		// wordTest5(); 五、某數值型態的變數之後，不使用既有的四捨五入函式、指令，達到四捨五入的效果
		// wordTest6();  // 六、挑出 1~100 之中的質數 方法1
		// wordTest6_1(); // 六、挑出 1~100 之中的質數 方法2
		// wordTest7(); // 請寫一個程式，可以印出費式數列的指定項目(使用遞迴)。
		// wordTest8(); //1.求最接近平均的數 2.求陣列中第2大的數 3. 求陣列中第2小的數。
		// wordTest9(); //取10個不重複的亂數由60 ≦ｘ＜91，並且以升冪顯示
		//wordTest10();//以★形排列出空心菱形，邊長得以由使用者輸入		
		// wordTest11(); 
	}

	// 一、求2數的最大公約以及最小公倍數
	// 最小公倍數的公式法[a,b]/hcg(a,b)
	// 因數分解就是使用小於輸入數的數值當作除數，去除以輸入數值，如果可以整除就視為因數
	private static void wordTest1() {
		System.out.println("1.求2數的最大公約以及最小公倍數");
		Scanner scn = new Scanner(System.in);
		int intgsd[] = new int[10];
		int intOne, intTwo, intTime = 0;
		System.out.print("請輸入數字: ");
		intOne = scn.nextInt();
		System.out.print("請輸入數字: ");
		intTwo = scn.nextInt();
		for (int i = 1; i < intTwo; ++i) {
			if (intOne % i == 0 & intTwo % i == 0) {
				intgsd[intTime] = i;
				intTime++;
			}
		}
		System.out.println("最大公因數為: " + intgsd[intTime - 1]);
		System.out.print("最小公倍數為: " + (intOne * intTwo) / intgsd[intTime - 1]);
		scn.close();
	}

	// 二、 2020/4/8是星期三，請簡易設計一段程式，輸入2020任何一天，能算出當日是星期幾
	private static void wordTest2() {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入日期(2020-01-01) : ");
		String strdateStart = scn.next();
		String dateStop = "2020-09-16";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(strdateStart);
			d2 = format.parse(dateStop);
			// 毫秒ms
			// long diff = d2.getTime() - d1.getTime();

			// long diffSeconds = diff / 1000 % 60;
			// long diffMinutes = diff / (60 * 1000) % 60;
			// long diffHours = diff / (60 * 60 * 1000) % 24;
			// long diffDays = diff / (24 * 60 * 60 * 1000);

			// System.out.print(diffDays + " 天, ");
			// System.out.print(diffHours + " 小時, ");
			// System.out.print(diffMinutes + " 分, ");
			// System.out.print(diffSeconds + " 秒.");
			SimpleDateFormat date2DayFormat = new SimpleDateFormat("u");
			System.out.print("星期 " + date2DayFormat.format(d1));

		} catch (Exception e) {
			e.printStackTrace();
		}
		scn.close();
	}

	// 三、 讓兩個數對換，不得使用第三個數。
	private static void wordTest3() {
		// 因為XOR使用位元運算，100110方式自算，不一樣的為1
		// https://www.jishuwen.com/d/pvPj/zh-tw
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個數字來做交換");
		System.out.print("第一個數字:");
		int intOne = scn.nextInt();
		System.out.print("第二個數字:");
		int intTwo = scn.nextInt();
		System.out.println("交換前:" + intOne + "跟" + intTwo);
		intOne = intOne ^ intTwo;
		intTwo = intOne ^ intTwo;
		intOne = intOne ^ intTwo;
		System.out.print("交換後:" + intOne + "跟" + intTwo);
		scn.close();
	}

	// 四、撰寫一程式，使得使用者輸入6進位數字能改成10進位，例如使用者輸入11，則回傳7。
	private static void wordTest4() {
		System.out.println("==== X進位成10進位 可自訂六、八進位 ====");
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數:");
		int intNumber = scn.nextInt();
		System.out.print("請輸入要轉換的進位，(例:6或8之類) :");
		int intCarrySystem = scn.nextInt();
		String stringValue = Integer.toString(intNumber);
		int intTime = stringValue.length() - 1, intCount = 1, intTotal = 0;
		int intR[] = new int[stringValue.length()];
		for (int x = 0; x < stringValue.length(); ++x) {
			if (intTime > 0) {
				for (int a = intTime; a > 0; --a) {
					intCount = intCount * intCarrySystem;
				}
			} else {
				intCount = 1;
			}
			intTime--;
			intR[x] = Integer.parseInt(String.valueOf(stringValue.charAt(x))) * intCount;
		}
		for (int x : intR) {
			intTotal = intTotal + x;
		}
		System.out.print("轉換成10進位為 " + intTotal);
		scn.close();
	}

	// 五、某數值型態的變數之後，不使用既有的四捨五入函式、指令，達到四捨五入的效果
	private static void wordTest5() {
		System.out.println("==== 自製小工具-四捨五入後並無條件捨去 (僅限整數)====");
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數:");
		int intNumber = scn.nextInt();
		System.out.print("請輸入取第幾位:");
		int intRound = scn.nextInt() - 1;
		String stringValue = Integer.toString(intNumber);
		int intCoun = Integer.parseInt(String.valueOf(stringValue.charAt(intRound)));
		if (intCoun < 5) {
			intNumber = Integer.parseInt(stringValue.substring(0, intRound + 1)) + 1;
			System.out.print("進位結果: " + intNumber);
		} else
			System.out.print("無須進位: " + intNumber);

		scn.close();
	}

	// 六、挑出 1~100 之中的質數 方法1
	private static void wordTest6() {
		int i, j;
		for (i = 1; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j >= i)
				System.out.print(i + " ");
		}
		System.out.println();
	}

	// 六、挑出 1~100 之中的質數 方法2
	private static void wordTest6_1() {
		int k = 50;
		int[] prime = new int[(k + 1) / 2];
		prime[0] = 2; // the first prime is 2
		int pCount = 0, count = 0;
		boolean isPrime = true;
		// System.out.println("prime[??]=" + (k + 1) / 2 + "\t");
		for (int i = 2; i <= k; i++) {
			isPrime = true; // 旗標
			for (int j = 0; prime[j] <= Math.sqrt(i); j++) {
				if (i % prime[j] == 0) {
					isPrime = false;
					break;
				}
				System.out.println("prime[j]=" + prime[j] + "\t");
			}
			// 下方是質數時，放入陣列
			if (isPrime) {
				prime[pCount] = i;
				pCount++;
				System.out.print(i + "\t");
				count++;
				if (count % 10 == 0) {// create new line per 10 numbers
					System.out.println("");
				}
			}
		}
	}
	// 七、請寫一個程式，可以印出費式數列的指定項目(使用遞迴)。
    private static void wordTest7() {
		Scanner scn = new Scanner(System.in);		
		System.out.print("請輸入費氏數列項數m：");
		int m = scn.nextInt();
		for(int n=1;n<=m;n++) {        
			if(n==m) //當n=m時，代表最後一個數值，就不印出，了
				System.out.print(fib(n));
			else
				System.out.print(fib(n)+",");
			}		
		scn.close();
	}

	public static long fib(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
	// 八、1.求最接近平均的數 2.求陣列中第2大的數 3. 求陣列中第2小的數。
	private static void wordTest8() {
		int intNumber[] = { 15, 7, 22, 9, 27, 12, 6, 30, 18, 24 };
		int intTotal = 0;
		for (int x = 0; x < intNumber.length; ++x) {
			for (int y = 0; y < x; y++) {
				// 若比隔壁大則跟隔壁交換，不然不換
				if (intNumber[x] < intNumber[y]) {
					int intTmp = intNumber[x];
					intNumber[x] = intNumber[y];
					intNumber[y] = intTmp;
				}
			}
		}
		System.out.println("以升冪排序: ");
		for (int x = 0; x < 10; x++) { // 用foreach依序打印出陣列內容
			System.out.print(intNumber[x] + "\t");
			intTotal = intTotal + intNumber[x];
		}
		int z = 0, intCal = intTotal / intNumber.length; // z 當計步器? intCal
															// 是陣列數值加總/個數 得來平均數
		while (z < intNumber.length) {
			if (intCal < intNumber[z]) { // 當有 intNumber 陣列中的值大於 intCal 時，則進入下方
				System.out.println("\n平均數為 " + intCal + "，而最接近平均的數是: " + intNumber[z - 1]);
				// 為何 intNumber[z - 1] ，當 if 找到 intNumber[z] 時，此數值內容是
				// 18，我是找小於的因此再讓索引值扣1
				break;
			}
			z++;
		}
		System.out.println("第2最大的數: " + intNumber[intNumber.length - 2]);
		System.out.println("第2最小的數: " + intNumber[1]);
	}

	// 九、 取10個不重複的亂數由60 ≦ｘ＜91，並且以升冪顯示
	private static void wordTest9() {
		int[] arr = new int[10];
		int intNumber = 0;
		for (int i = 0; i < 10; i++) {
			intNumber = (int) (Math.random() * 90) + 1;
			while (intNumber < 60) {
				intNumber = (int) (Math.random() * 90) + 1;
			}
			arr[i] = intNumber;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		for (int x = 0; x < arr.length; ++x) {
			for (int y = 0; y < x; y++) {
				if (arr[x] < arr[y]) {
					int intTmp = arr[x];
					arr[x] = arr[y];
					arr[y] = intTmp;
				}
			}
		}
		System.out.println("在60 ≦ｘ＜91取10個不重複的亂數:");
		for (int i = 0; i < 10; i++)
			System.out.print(arr[i] + " ");

	}

	// 十、 以★形排列出空心菱形，邊長得以由使用者輸入=>還未好
	 private static void wordTest10() {
         Scanner scn = new Scanner(System.in);
	System.out.print("請輸入數字: ");
	int intCount = scn.nextInt();
	String strX = "★", strSpace = "   ";
	int intTime = 0, y, intResult;
	// ======= 正金字塔區 =======
	for (int x = 1; x <= intCount; x++) {
		// ===== 左方的空白=======
		for (int a = intCount - x; a > 0; a--)
			System.out.print(strSpace);
		// ===== 左方的 ★ 跟中空的空白=======
		for (y = 1; y < (x + x - 1); ++y) {
			if (y <= 2)
				System.out.print(strX);
			else if (y > 3)
				System.out.print(strSpace);
		}
		// ===== 右方的 ★ =======
		if (y <= 3)
			System.out.print(strX);
		else {
			for (int z = x; z >= x - 1; --z)
				System.out.print(strX);
		}
		System.out.println();
	}
	intResult = intCount + intCount - 1; //輸入值的總計
	// ==================== 華麗分隔線 ==========================
	for (int x = 1; x < intCount; x++) {
		// ===== 左方空白=======
		for (int a = 0; a < x; ++a)
			System.out.print(strSpace);
		// ====== 左邊星星 ======
		for (int a = x; a >= x - 1; --a) {
			if (x == (intCount - 1) && a == (intCount - 2))
				break; // 這是判斷若是最後一顆時，跳出迴圈
			else
				System.out.print(strX);
		}
		// ====== 判斷基偶數 ======
		// 此作用是為了在之後下方的右邊的 ★，能正常印出2個 ★
		if (intCount % 2 != 0)
			intTime = intCount - x + 1;
		else
			intTime = intCount - x;
		// ====== 中空的空格跟右邊的 ★ ======
		for (y = x; y < (intResult - x - 2); ++y) {
			if (y > intTime)
				System.out.print(strX);
			else
				System.out.print(strSpace);
		}
		// === 先前 ===
		// System.out.print("X=" + x + ", Y=" + y + ", ");
		// ====== 右邊空格 ======
//					if ((intResult - x - 1) > 6) {
//						for (int g = (intResult - x - x); g > 4; g--) {
//							System.out.print(strSpace);
//						}
//					}
//					// ====== 右邊星星 ====== 
//					for (y = 1; y < 3; ++y) {
//						if (x > (intCount - x + y) )
//							break; // 這是判斷若是最後一顆時，就不再印出 ★
//						else
//							System.out.print(strX);
//					}
		System.out.println();
	}
	scn.close();
}
	 //十一、繪出下方圖形 (額外)
	 private static void wordTest11(){
		// 使用程式設計出此圖型
		 //	      1 
		 //	     1 1 
		 //	    1 2 1 
		 //	   1 3 3 1
		 //	   \/\/ +
		 //	  1 4 6 4 1 
		 //  發現最外層都是1，除了1以外都是跟隔壁相加是下方值
		 //  因此要使用二維陣列紀錄值，好相對應提取值
  	Scanner scn = new Scanner(System.in);
  	System.out.print("請輸入數字: ");
  	int n = scn.nextInt();
  	int b = 0, a = 0, c;
  	int[][] x = new int[n][n];
  	// 代表數字金字塔的欄(長、直)
  	for (a = 0; a < n; a++) {
  		// 此為神秘空白，為了讓數字能像金字塔排列
  		for (b = n - a; 0 < b; b--) {
  			System.out.print(" ");
  		}
  		// 代表數字金字塔的列(寬、橫)
  		for (c = 0; c <= a; c++) { //

  			if (c == 0 || c == a) {
  				// 此為橫的二維列每列第一個是0，或是每列最後一個又跟每欄的個數一樣時，代表他們是最外圈那個
  				x[a][c] = 1;
  				System.out.print(x[a][c] + " ");
  			} else {
  				// x[a - 1][c - 1] => 是找上一列的同位置的前一個值
  				// x[a - 1][c]	   => 是找上一列的同位置的值
  				x[a][c] = x[a - 1][c - 1] + x[a - 1][c];
  				System.out.print(x[a][c] + " ");
  			}
  		}
  		System.out.println();
  	}
  	scn.close();
	 }
	
}