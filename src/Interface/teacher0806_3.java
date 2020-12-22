package Interface;

import java.util.Scanner;

interface ShapeArea {
	float PI = 3.14f;

	void rectangleArea();

	void circleArea();

	void triangleArea();
}

public class teacher0806_3 {
	// 設計介面可以依幾何圖形來計算面積
	// 輸入 1 矩形 rectangle 以此類推
	// 2 圓形 circle
	// 3 三角形 triangle
	public static void main(String[] args) {
		CalArea cal = new CalArea();
		Scanner scn = new Scanner(System.in);
		System.out.println("請選擇計算哪種圖形，並輸入代號 : 1.矩形、2.三角形、3.圓形");
		System.out.print("選擇是:");
		int intslet = scn.nextInt();
		switch (intslet) {
		case 1:
			// 三角形
			System.out.print("請輸入高:");
			cal.h = scn.nextInt();
			System.out.print("請輸入寬:");
			cal.w = scn.nextInt();
			cal.rectangleArea();
			break;
		case 2:
			// 矩形
			System.out.print("請輸入高:");
			cal.h = scn.nextInt();
			System.out.print("請輸入寬:");
			cal.w = scn.nextInt();
			cal.triangleArea();
			break;
		case 3:
			// 圓形
			System.out.print("請輸入半徑:");
			cal.r = scn.nextInt();
			cal.circleArea();
			break;
		default:
			System.out.print("請輸入正確代號!! :P");
			break;
		}
		scn.close();
	}
}

class CalArea implements ShapeArea {
	int h, w, r;

	@Override
	public void rectangleArea() {
		System.out.print("三角形面積是 " + (h * w) / 2);
	}

	@Override
	public void triangleArea() {
		System.out.print("矩形面積是 " + h * w);
	}

	@Override
	public void circleArea() {
		System.out.print("圓形面積是 " + PI * (r * r));
	}

}
