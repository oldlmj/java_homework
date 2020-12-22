package BubbleSort;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Date0722 {

	public static void main(String[] args) {
		// calArry(); // 將某陣列(自訂數字)，請用氣泡排序方式，從大到小排列
		// calArryThr(); // 三維陣列，計算平均值、總和、最大最小值
		//calArryShort(); // 未完成 將此 {{1,2,3},{4,5,6},{7,8,9}}=>變成
										// {{1,4,7},{2,5,8},{3,6,9}}
		// calArryTwoSearch1(); // 使用陣列搜尋資料-土法煉鋼
		calArrayE(); //使用陣列設計下方表格，並計算各業務員的業績
	}

	// 將某陣列(自訂數字)，請用氣泡排序方式，從大到小排列
	public static void calArry() {
		int[] x = { 60, 50, 80, 72, 21, 90, 15 };
		int intTmp = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int z = 0; z < x.length - 1; z++) {
				if (x[z] < x[z + 1]) { // 當x[z]比隔壁數字小時，
					intTmp = x[z]; // 將x[z]先暫放intTmp，
					x[z] = x[z + 1]; // x[z+1]值給予x[z]
					x[z + 1] = intTmp; // intTmp]給予x[z+1]作為交換過去
				}
				// 將陣列用foreach印出來
				for (int u : x) {
					System.out.print(u + " ");
				}
				System.out.println();
			}
		}
	}

	// 三維陣列，計算平均值、總和、最大最小值
	public static void calArryThr() {
		int[][][] arryA = { { { 3, 90, 61, 9, 15 }, { 90, 60, 70 } },
				{ { 25, 66, 2, 51, 38 }, { 100, 80, 60, 30, 45 } }, { { 60, 26, 101, 46, 51 }, { 20, 1 } } };
		int intMax, intMin, intT = 0, z;
		float floAvg = 0f;
		intMax = intMin = arryA[0][0][0];
		for (int x = 0; x < arryA.length; x++) {
			for (int y = 0; y < arryA[x].length; y++) {
				for (z = 0; z < arryA[x][y].length; z++) {
					if (intMax < arryA[x][y][z]) {
						intMax = arryA[x][y][z];
					} else if (intMin > arryA[x][y][z]) {
						intMin = arryA[x][y][z];
					}
					intT = intT + arryA[x][y][z];
					floAvg = (float) intT / (arryA[x][y].length);
				}
				System.out.println("第" + x + "-" + y + "總和= " + intT);
				System.out.println("第" + x + "-" + y + "平均= " + floAvg);
				intT = 0;
			}
		}
		System.out.print("最大值:" + intMax + ", 最小值:" + intMin);
		System.out.println();

	}

	// 使用陣列搜尋資料-土法煉鋼
	public static void calArryTwoSearch1() {
		// 說明 : 1.定義某字串陣列內容 2.從鍵盤輸入資料 3.尋找此資料是否存在
		String strSearch[] = { "x", "y", "王", "李", "3", "A" };
		String strInput = new String(), strtmp, str;
		int i, x = 0;
		// 按筆畫排序 (TRADITIONAL_CHINESE 按筆畫排序, SIMPLIFIED_CHINESE 按拼音排序)
		Comparator comparator = Collator.getInstance(Locale.TRADITIONAL_CHINESE);
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入資料: ");
		strInput = scn.next();
		// Arrays.sort(strSearch, comparator);
		// 陣列元素排序
		for (int u = 0; u < strSearch.length; u++) {
			for (int z = u; z < strSearch.length; z++) {
				if (comparator.compare(strSearch[u], strSearch[z]) > 0) {
					strtmp = strSearch[z];
					strSearch[z] = strSearch[u];
					strSearch[u] = strtmp;
				}
			}
		}
		i = Arrays.binarySearch(strSearch, strInput);
		do {
			x += 1;
			if (i >= 0) {
				System.out.print("有此資料 -> " + strInput);
				break;
			} else {
				System.out.print("無此資料 -> " + strInput + " ");
				break;
			}
		} while (x < strSearch.length);
		scn.close();
	}

	// 使用2元搜尋陣列。尋找新的第2個中間值
	public static void calArryTwoSearch2() {
		int strSearch[] = { 90, 60, 100, 45, 75, 86, 15 };
		int Input, intN, i, x = 0;
		// 按筆畫排序 (TRADITIONAL_CHINESE 按筆畫排序, SIMPLIFIED_CHINESE 按拼音排序)
		Comparator comparator = Collator.getInstance(Locale.TRADITIONAL_CHINESE);
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入資料: ");
		Input = scn.nextInt();
		// 先將資料排序
		for (i = 0; i < strSearch.length; i++) {
			for (int z = i; z < strSearch.length; z++) {
				if (strSearch[z] < strSearch[i]) {
					intN = strSearch[z];
					strSearch[z] = strSearch[i];
					strSearch[i] = intN;
				}
			}
		}
		x = strSearch.length / 2;
		if (strSearch[x] > Input) {
			x = x / 2;
			System.out.print("新的中間值為:" + strSearch[x]);
		} else {
			int y = x / 2;
			System.out.print("新的中間值為:" + strSearch[x + y]);
		}

	}

	// 將此 {{1,2,3},{4,5,6},{7,8,9}}
	// 變成 {{1,4,7},{2,5,8},{3,6,9}}
	//
	public static void calArryShort() {
		int[][] V = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int intTmp, intP, y;
		for (int x = 0; x < V.length; x++) {
			for (y = 0; y < V[x].length; y++) {
				intTmp = V[y][x];
				System.out.print("-"+V[x][y] + "\t");
				V[y][x] = V[x][y];
				V[x][y] = intTmp;
				System.out.print(V[x][y] + "\t");
				System.out.println("="+intTmp + "\t");
			}

			System.out.println();
		}
	}

	/*
	 * 使用陣列設計下方表格，並計算各業務員的業績 _________________________________ | 產品1 產品2 產品3 產品4
	 * 業績 | |老李 30 60 10 90 ? | |小王 10 15 30 0 ? | |大張 70 50 40 100 ? | |劉七 15
	 * 50 60 40 ? | |________________________________ |
	 */
	public static void calArrayE() {
		int[][] intSales = { { 30, 60, 10, 90 }, { 10, 15, 30, 0 }, { 70, 30, 40, 100 }, { 15, 50, 60, 40 },
				{ 0, 0, 0, 0 } };
		String[] strSeller = { "老李", "小王", "大張", "劉七" };
		String[] strProduct = { "產品1", "產品2", "產品3", "產品4", "業績" };
		int intSalesTotal = 0, y, v = 0, z = intSales.length - 1;
		for (int x = 0; x < intSales.length; x++) {
			for (y = 0; y < intSales[x].length; y++) {
				intSalesTotal = intSalesTotal + intSales[x][y];
			}
			if (v < intSales[x].length) {
				intSales[z][v] = intSalesTotal;
				v += 1;
				intSalesTotal = 0;
			}
		}
		for (String b : strSeller) {
			System.out.print(b + ",\t");
		}
		System.out.println();
		for (int b : intSales[4]) {
			System.out.print(b + " ,\t");
		}
	}
}