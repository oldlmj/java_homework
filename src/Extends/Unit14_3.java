package Extends;

public class Unit14_3 {

	public static void main(String[] args) {
		
		ME3 me=new ME3("老孟","平鎮高中","資處科");
		
		me.demo();
		me.demoME();
	}

}

class School3 {
	protected String title;
	protected String name;
	protected  void demo() {
		System.out.print("學校名稱:" + title + ", 學生名稱:" + name);
		}
}

class ME3 extends School3 {
	// 機械
	protected String department;

	ME3(String MEname, String MEtitle, String MEdepartment) {
		this.name = MEname;
		this.title = MEtitle;
		department = MEdepartment;
	}
	public  void demo() {
		System.out.println("學校名稱:" + title );
		System.out.println("學生名稱:" + name);
	}
	public void demoME() {
		System.out.print("科系:" + department); 
	}
}

class EE3 extends School3 {
	// 電機
	protected String department;
	public  void demo() {
		System.out.println("學校名稱:" + title );
		System.out.println("學生名稱:" + name);
	}
	EE3(String EEname, String EEtitle, String EEdepartment) {
		this.name = EEname;
		this.title = EEtitle;
		department = EEdepartment;

	}

	public void demoEE() {
		System.out.print("科系:" + department);
	}

}