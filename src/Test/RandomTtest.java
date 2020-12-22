package Test;

import java.util.Random;
import java.util.Scanner;

public class RandomTtest {

	public static void main(String[] args) {
		// test1(); // 未完成
		 test7(); // 產生10000個1~49之間的亂數，並顯示1-49數字的分配率
		// test8(); // 自行設計一個求絕對值的方法介面
		//test2();
	}

	public static void test1() {
		String strYN;
		Boolean b = false;
		do {
			Scanner scn = new Scanner(System.in);

			System.out.print("請輸入猜拳:");
			String strSlet = scn.next();
			String strGame[] = { "剪刀", "石頭", "布" };
			Random ran = new Random();
			if (strSlet.equals(strGame[ran.nextInt(3)])) {
				System.out.println("恭喜您猜贏了");
			} else {
				System.out.println("您:" + strSlet);
				System.out.println("電腦:" + strGame[ran.nextInt(3)]);
				System.out.println("_" + ran.nextInt(3));
				System.out.println("喔喔 猜錯了.....");
			}
			System.out.println("請問還要繼續嗎? 請輸入英文是(y)或否(n)");
			strYN = scn.next();
			if (strYN == " y") {
				b = true;
			} else if (strYN == " n") {
				b = false;
				System.out.println("遊戲已結束!!");
			}
			scn.close();
		} while (b == true);

	}

	public static void test2() {

		int[] z = new int[50];
		int m[][] = new int[3][7];
		for (int x = 1; x <= 2; x++) {
			for (int n = 1; n <= 49; ++n) {
				z[n] = n;
			}
			int counter = 1; // 大樂透編號
			// 判斷大樂透一組是否足6個號碼
			while (counter <= 6) {
				int ran = (int) (Math.random() * 49) + 1;
				if (z[ran] == 0) {
					continue;
				} else {
					System.out.print("\t" + ran);
					z[ran] = 0;
					m[x][counter] = ran;
					counter++;
				}
			}
			System.out.println();

		}
		// 判斷電腦選出的樂透跟自己是否一樣
		for (int x = 0; x <= 6; ++x) {
		for (int n = 0; n <= 6; ++n) {
		
				if (m[x][n] == m[x + 1][n]) {
				}
			}
		}
	}

	// 產生10000個1~49之間的亂數，並顯示1-49數字的分配率
	public static void test7() {
		int[][] m = new int[50][50];
		// 先將1~49數字放入[-][]陣列;
		for (int x = 0; x < m.length; x++) {
			m[x][0] = x;
		}
		// 開始產生10000個1~49之間的亂數
		for (int y = 1; y < 10000; ++y) {
			// 此為亂數
			int v = (int) (Math.random() * 49) + 1;
			// 使用迴圈紀錄數字出現多少次
			for (int x = 0; x < m.length; x++) {
				if (m[x][0] == v) {
					m[x][1] = m[x][1] + 1;
				}
			}
		}
		// 將迴圈內容依序輸出到畫面
		for (int z = 1; z < 50; ++z) {
			for (int b = 1; z < 50; ++z) {
				System.out.println(z + "=" + (m[z][b] / 100) + "%");
			}
		}
	}

	
}
