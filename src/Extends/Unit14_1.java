package Extends;

public class Unit14_1 {

	public static void main(String[] args) {

		test1();

	}

	public static void test1() {
		Dog dog = new Dog("Haly","101",2);
		dog.eat();
		dog.sleep();
		dog.breaking();
		
		Bird bird = new Bird("Coco","009",6);
		bird.eat();
		bird.sleep();
		bird.flying();
	}
}

class Animal {
	protected String name;
	String id;
	int age;

	public void eat() {
		System.out.println("編號 "+id+"年齡"+age+"名叫"+name + "正在吃食物");
	}

	public void sleep() {
		System.out.println("編號 "+id+"年齡"+age+"名叫"+name + "正在睡覺");
	}
}

class Dog extends Animal {
	Dog(String name, String id, int age) {
		this.name = name;
		this.age=age;
		this.id=id;
	}

	public void breaking() {
		System.out.println("編號 "+id+"年齡"+age+"名叫"+name + "正在叫");
	}
}

class Bird extends Animal {
	Bird(String name, String id, int age) {
		this.name = name;
		this.age=age;
		this.id=id;		
	}

	public void flying() {
		System.out.println("編號 "+id+"年齡"+age+"名叫"+name + "正在飛");
	}
}