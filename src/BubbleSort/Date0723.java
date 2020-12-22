package BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class classSort {
	int[] y;
	Integer[] i;
	Comparator<Integer> comp = Collections.reverseOrder();

	void sort(int[] x, int... p) {
		y = x;
		Arrays.sort(y);
		for (int u : y) {
			System.out.print(u + " ");
		}
	}

	void reverse(Integer[] x, int... p) {
		// 使用內建函式，要改成用Integer
		i = x;
		Arrays.sort(i, comp);
		for (Integer u : i) {
			System.out.print(u + " ");
		}
	}

	void reverseN(int[] x, int... p) {
		y = x;
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y.length - 1; j++) {
				if (y[i] > y[j]) {
					int temp = y[i];
					y[i] = y[j];
					y[j] = temp;
				}
			}
		}
		for (int u : y) {
			System.out.print(u + " ");
		}
	}
}

public class Date0723 {
	public static void main(String[] args) {
		
		//P8-33 第7題
		int[] c = { 5, 3, 0, 6, 100 };
		Integer[] z = { 6, 76, 28, 100, 9, 50 };
		classSort sort = new classSort();
		sort.sort(c);
		System.out.println();
		sort.reverse(z);
		System.out.println();
		sort.reverseN(c);
	}

}
