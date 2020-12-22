package Interface;

interface Cal{
	void BMI();
}

public class teacher0806_2 {
	// 設計一個介面可計算BMI
	public static void main(String[] args) {
		CCal cal =new CCal();
		cal.h=1.9f;
		cal.w=90;
		cal.BMI();
	}

}

class CCal implements Cal{
	//體重(公斤) / 身高2(公尺2)
	int w;
	float h;
	@Override
	public void BMI() {
		System.out.print("BIM="+w/(h*h));
	}
	
}
