package Interface;

interface  IBasicComluter{
	double x=10,y=5;
	void add();
	void sub();
	void mul();
	void div();
}
public class teacher0806_1 {
	// 定義一個CCaluntator類別，包含double變數result(存放結果)
	// 讓上述類別實作一個IBasicComluter介面。
	// IBasicComluter介面定義兩個參數下方4個方法
	// add-加
	// sub-減
	// mul-*
	// div-/
	// 請利用CCaluntator產生的物件執行上述方法及結果
	public static void main(String[] args) {
		IBasicComluter cal=new CCaluntator();
		cal.add();		
		cal.sub();
		cal.mul();
		cal.div();
	}

}
 class CCaluntator  implements IBasicComluter{
	  double result;

	@Override
	public void add() {
		result=x+y;
		System.out.println("結果是 "+result);		
	}

	@Override
	public void sub() {
		result=x-y;
		System.out.println("結果是 "+result);		
	}

	@Override
	public void mul() {
		result=x*y;
		System.out.println("結果是 "+result);		
	}

	@Override
	public void div() {
		result=x/y;
		System.out.println("結果是 "
				+ ""+result);		
	}
 }