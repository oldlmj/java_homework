package Extends;

public class Extends_2 {

	public static void main(String[] args) {
		/*
		 * 若caaa為父類別 cbbb為繼承caaa子類別 若使用父類別變數定子類別物件 問:此類別變數可以使用子類別覆寫方法嗎? A: ''
		 * 新增方法嗎?
		 */
		String s = "hello";
		Cbbb cb = new Cbbb();
		cb.show("C");
		int i, sum = 0;
		int x = 0, y = 0;
		for (i = 1; i < 6; i++) {
			if ((x++ > 2)|| (y++) > 2) {
				x++;
				
			}
			System.out.println("x-"+x);
			System.out.println("y-"+y);
		}
	}

}

class Caaa {
	String strA = "A";

	Caaa() {
	}

	void show(String str) {
		strA = str;
		System.out.print("This is Caaa show " + strA);
	}
}
//
class Cbbb extends Caaa {
	String str = this.strA;

	Cbbb() {
	}

	void show(String strz) {
		System.out.println("This is Cbbb show " + strz);
		System.out.println("strz=" + strz);
		System.out.println("this.strA=" + str);
	}
}
