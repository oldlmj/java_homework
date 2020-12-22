package ClassAndConstructor;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// 第8章
		// 1. 設計Ctest類別，內容test方法，可以判斷傳入值為偶數or奇數
		// __________
		// | Ctest |
		// |--------------|
		// | +num:int |
		// |--------------|
		// |+show():int |
		// |--------------|
		// task1();
		// 2.設計calculator類別，內容含四個方法，plus、substract、devide、multiply，均傳遞2個引數，並避免有負值出現。
		task2();
		task3();
	}

	public static void task1() {
		Ctest ct = new Ctest();
		Scanner scn = new Scanner(System.in);
		System.out.println("= =設計Ctest類別，內容test方法，可以判斷傳入值為偶數or奇數 ==");
		System.out.print("請輸入數字: ");
		int intNum1 = scn.nextInt();
		System.out.print("再輸入數字: ");
		int intNum2 = scn.nextInt();
		ct.show(intNum1, intNum2);
		scn.close();
	}

	public static void task2() {
		Calculator ca = new Calculator();
		Scanner scn = new Scanner(System.in);
		System.out.println("== 設計calculator類別，內容含四個方法，plus、substract、devide、multiply，均傳遞2個引數，並避免有負值出現。==");
		System.out.print("請輸入數字: ");
		int intNum1 = scn.nextInt();
		System.out.print("再輸入數字: ");
		int intNum2 = scn.nextInt();
		ca.plus(intNum1, intNum2);
		ca.substract(intNum1, intNum2);
		ca.devide(intNum1, intNum2);
		ca.multiply(intNum1, intNum2);
		scn.close();
	}

	public static void task3() {
		System.out.println("== 按圖施工.. .@@!!! ==");
		Car bus = new Car(6, 2000);
		Car truck = new Car(8, 6000);
		System.out.println("bus=" + bus.showWheel() + "輪， " + bus.showEngine() + " CC");
		System.out.print("truck=" + truck.showWheel() + "輪， " + truck.showEngine() + " CC");
	}

}

class Ctest {
	int num;

	void test(int x, int y) {
		num = x % y;
		if (num == 0) {
			System.out.print("是偶數");
		} else {
			System.out.print("是奇數");
		}
	}

	void show(int x, int y) {
		test(x, y);
	}
}

class Calculator {
	int num;
	String strcal;

	void plus(int x, int y) {
		if (x + y > 0) {
			num = x + y;
		} else {
			num = 0;
		}
		strcal = "+";
		show(x, y, strcal, num);
	}

	void substract(int x, int y) {
		if (x - y > 0) {
			num = x - y;
		} else {
			num = 0;
		}
		strcal = "-";
		show(x, y, strcal, num);
	}

	void devide(int x, int y) {
		if (x - y > 0) {
			num = x * y;
		} else {
			num = 0;
		}
		strcal = "*";
		show(x, y, strcal, num);
	}

	void multiply(int x, int y) {
		if (x - y > 0) {
			num = x / y;
		} else {
			num = 0;
		}
		strcal = "/";
		show(x, y, strcal, num);
	}

	void show(int x, int y, String strcal, int n) {
		System.out.println(x + strcal + y + "=" + num);
	}
}

class Car {
	private int wheel;
	private int engine;

	Car(int s, int y) {
		this.wheel = s;
		this.engine = y;
	}

	int showWheel() {
		wheel = this.wheel;
		return wheel;
	}
	int showEngine() {
		engine = this.engine;
		return engine;
	}

}