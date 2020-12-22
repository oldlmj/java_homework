package Exception;

import java.util.Scanner;

public class Test1_Uit20_3 {
	/*
	 * 設計一個包含例外處理程序 1.程式中可宣告樂透開球數 2.開球數在6~49之間 3.開球數錯誤，則由自訂例外處理，並將球數設定為6
	 * 
	 */
	public static void main(String[] args) {
		int lottery[];
		Scanner scn = new Scanner(System.in);
		int q = scn.nextInt();
		try {
			if (q >= 6) {
				
				throw new ErrorException1();
			} else if (q < 50) {
				throw new ErrorException2();
			}
		} catch (ErrorException1 e) {
			q = e.getQ();
			System.out.print("新的開球數:" + q);
		} catch (ErrorException2 e) {
			q = e.getQ();
			System.out.print("新的開球數:" + q);
		}
		
	}
}

class ErrorException1 extends Exception {

	public ErrorException1() {
	};

	public int getQ() {
		return 6;
	};
}

class ErrorException2 extends Exception {
	public ErrorException2() {
	};

	public int getQ() {
		return 25;
	};
}