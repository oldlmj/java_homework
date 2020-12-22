package Test;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		F1(21);
		for(int i=1;i<21;++i)
		System.out.print(F1(i)+", ");
	}

	// 1,1,2,3,5,8,13.... 
	public static int F1(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		if (n > 2) {
			return F1(n - 1) + F1(n - 2); // 遞迴呼叫
		}
		return -1;
	}

	// n!=1x2x3x4x5x6...
	public static int F2(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * F2(n - 1));
		}
	}

	// 若要1+2+3+4+5...+1000的總和
	public static int F3(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + F3(n - 1);
		}
	}

	// 輸入兩個數字，求兩數最大公因數。例如:輸入10,5最大公因數為5
	public static int F4(int m, int n) {
		if (n == 0) {
			return 1;
		} else {
			return F4(n, m % n);
		}
	}
	
}
