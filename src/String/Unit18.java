package String;

public class Unit18 {

	public static void main(String[] args) {
		test1Andtest6();
	}

	public static void test1Andtest6() {
		Integer x2, y2, z2;
		x2 = Integer.valueOf("1010", 2);
		y2 = Integer.valueOf("11111111", 2);
		z2 = Integer.valueOf("100100", 2);
		System.out.println("1. x的二進位為 " + x2);
		System.out.println("1. y的二進位為  " + y2);
		System.out.println("1. z的二進位為  " + z2);
		// =========== test2 ===============
		Integer intgX8, intgY8, intgZ8;
		intgX8 = Integer.valueOf(x2.toString(), 8);
		intgY8 = Integer.valueOf(y2.toString(), 8);
		intgZ8 = Integer.valueOf(z2.toString(), 8);
		System.out.println("2. x的八進位為 " + intgX8);
		System.out.println("2. y的八進位為  " + intgY8);
		System.out.println("2. z的八進位為  " + intgZ8);
		// =========== test3 ===============
		Integer intgX16, intgY16, intgZ16;
		intgX16 = Integer.valueOf(intgX8.toString(), 16);
		intgY16 = Integer.valueOf(intgY8.toString(), 16);
		intgZ16 = Integer.valueOf(intgZ8.toString(), 16);
		System.out.println("3. x的十六進位為 " + intgX16);
		System.out.println("3. y的十六進位為  " + intgY16);
		System.out.println("3. z的十六進位為  " + intgZ16);
		// =========== test4 ===============
		Integer x42, y42, z42;
		x42 = Integer.valueOf("1010", 8);
		y42 = Integer.valueOf("11111111", 8);
		z42 = Integer.valueOf("100100", 8);
		System.out.println("4. x的八進位為 " + x42);
		System.out.println("4. y的八進位為  " + y42);
		System.out.println("4. z的八進位為  " + z42);
		// =========== test5 ===============
		Integer intgX516, intgY516, intgZ516;
		intgX516 = Integer.valueOf(x42.toString(), 16);
		intgY516 = Integer.valueOf(y42.toString(), 16);
		intgZ516 = Integer.valueOf(z42.toString(), 16);
		System.out.println("5. x的十六進位為 " + intgX516);
		System.out.println("5. y的十六進位為  " + intgY516);
		System.out.println("5. z的十六進位為  " + intgZ516);
		// =========== test6 ===============
		Integer x62, y62, z62;
		x62 = Integer.valueOf("101f", 16);
		y62 = Integer.valueOf("1111aaff", 16);
		z62 = Integer.valueOf("10010f", 16);
		System.out.println("6. x的十六進位為 " + x62);
		System.out.println("6. y的十六進位為  " + y62);
		System.out.println("6. z的十六進位為  " + z62);
	}

	public static void test9(){
		
	}
}
