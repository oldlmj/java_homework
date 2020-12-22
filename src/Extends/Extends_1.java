package Extends;

public class Extends_1 {

	public static void main(String[] args) {
		//繼承
		// 阿公=>爸爸=>兒子
			Son son1= new Son();
			son1.go("s");

	}

}
class Father extends Grandfather{
	protected String str="Y";
	Father(){
		System.out.println("This is father() !!");
	}
	void go(String str){
		System.out.println("This is go(str) !!");
	}
}
class Son extends Father{
	Son(){
		System.out.println("This is son() !!");
	}
	Son(String str){
		System.out.println("This is son(String) !!");
	}
}
class Grandfather{
	Grandfather(){
		System.out.println("This is grandfather() !!");
	}
	
}
