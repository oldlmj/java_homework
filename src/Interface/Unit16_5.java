package Interface;
abstract class MyMath{
	abstract int add(int n1,int n2);
	abstract int sub(int n1,int n2);
	abstract int mul(int n1,int n2);
	abstract int dev(int n1,int n2);
	void output(){
		System.out.print("我的計算機");
	}
}
public class Unit16_5 {
	public static void main(String[] args) {
		MyMath my=new MyTest();
		int x=5;
		int y=6;
		System.out.println(my.add(x,y));
		System.out.println(my.sub(x,y));
		System.out.println(my.mul(x,y));
		System.out.println(my.dev(x,y));
	}

}

class MyTest extends MyMath{

	@Override
	public int add(int n1, int n2) {		
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) {		
		return n1-n2;
	}
	
	@Override
	public int mul(int n1, int n2) {	
		return n1*n2;
	}
	
	@Override
	public int dev(int n1, int n2) {	
		return n1/n2;
	}
	
}