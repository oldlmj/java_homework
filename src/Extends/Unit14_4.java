package Extends;

public class Unit14_4 {

	public static void main(String[] args) {		
		test1();
	}

	public static void test1() {
		Dog4 dog = new Dog4("Haly", "101");
		dog.eat();
		dog.sleep();
		dog.breaking();

		Bird4 bird = new Bird4("Coco", "009");
		bird.eat();
		bird.sleep();
		bird.flying();
	}
}

class Animal4 {
	protected String name;
	protected String id;

	public void eat() {
		System.out.println("編號 " + id + "名叫" + name + "正在吃食物");
	}

	public void sleep() {
		System.out.println("編號 " + id + "名叫" + name + "正在睡覺");
	}
}

class Dog4 extends Animal4 {
	Dog4(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void breaking() {
		System.out.println("編號 " + id + "名叫" + name + "正在叫");
	}
}

class Bird4 extends Animal4 {
	Bird4(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void flying() {
		System.out.println("編號 " + id + "名叫" + name + "正在飛");
	}

}
