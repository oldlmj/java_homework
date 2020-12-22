package Test;

//遞迴的應用-費氏級數
// 1 1 2 3 5 8 13 21 ....

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.print("請輸入數字:");
		Scanner scn = new Scanner(System.in);
		int intNum = scn.nextInt();
		for (int n = 1; n <= intNum; n++) {
			if (n == intNum)
				System.out.print(calcFibonacci(n));
			else
				System.out.print(calcFibonacci(n) + ", ");
		}
		scn.close();
	}

	public static int calcFibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return calcFibonacci(n - 2) + calcFibonacci(n - 1);
		}
	}

}