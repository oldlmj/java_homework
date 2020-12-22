package Array;

public class Array {
	public static String[] strW = { "A", "B", "C", "D", "E", "F" };

	public static void main(String[] args) {
		test2_1();
		test2_2();
		test2_3();
		test2_4();
	}

	// 99乘法表
	
	public static void test1() {
		for (int x = 1; x < 10; ++x) {
			for (int y = 1; y < 10; ++y) {
				String i = Integer.toString(x * y);
				if (i.length() > 1)
					System.out.print(y + "x" + x + "=" + x * y + "\t");
				else
					System.out.print(y + "x" + x + "=  " + x * y + "\t");
			}
			System.out.print("\n");
		}
	}

	public static void test2_1() {
		for (int s = 1; s <= 5; s++) {
			for (int x = 5; x >= s; x--) {
				System.out.print(" ");
			}
			for (int v = 1; v <= s; v++) {
				System.out.print(" " + s);
			}
			System.out.println();
		}
	}

	public static void test2_2() {
		for (int s = 1; s <= 5; s++) {
			for (int x = 5; x >= s; x--) {
				System.out.print("  ");
			}
			for (int v = 1; v <= s; v++) {
				System.out.print(" " + v);
			}
				System.out.println();
		}
	}

	public static void test2_3() {
		int intL = strW.length;
		for (int s = 0; s <=intL-1; s++) {
			for (int x = intL ; x >= s; x--) {
				System.out.print("  ");
			}
			for (int v = 0; v <= s; v++) {
				System.out.print(" " + strW[s]);
			}
			System.out.println();
		}
	}
	
	public static void test2_4() {
		int intL = strW.length;
		for (int s = 0; s <=intL-1; s++) {
			for (int x = intL ; x >= s; x--) {
				System.out.print("  ");
			}
			for (int v = 0; v <= s; v++) {
				System.out.print(" " + strW[v]);
			}
			System.out.println();
		}
	}
}

