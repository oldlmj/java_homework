package Interface;

abstract class Shape {
	float pi = 3.14f;
	int r, h;

	public abstract void draw();
}

class Circle extends Shape {
	float r = 0.0f;

	public void draw() {
		System.out.println("圓周長=" + 2 * pi * r);
	}
}

class Rectangle extends Shape {
	int w;

	@Override
	public void draw() {
		System.out.println("矩形周長=" + w * h);
	}

	
}
class Cylinder extends Shape {

	@Override
	public void draw() {
		System.out.println("圓柱體積=" + r*pi*pi * h);
	}

}
public class Unit16_3 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.h = 50;
		rec.w = 10;
		rec.draw();
		Circle cir = new Circle();
		cir.r = 5;
		cir.draw();
		Cylinder cyl=new Cylinder();
		cyl.h=5;
		cyl.r=10;
		cyl.draw();
	}

}
