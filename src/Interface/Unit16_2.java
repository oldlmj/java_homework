package Interface;

abstract class Bank {
	double RateInterest() {
		return 0.0;
	}
}

class FirstBank extends Bank {
	public double RateInterest() {
		return 1.05;
	}
}

class TaishinBank extends Bank {
	public double RateInterest() {
		return 1.1;
	}
}

public class Unit16_2 {

	public static void main(String[] args) {
		
		FirstBank first =new FirstBank();
		System.out.println(first.RateInterest());
	
		TaishinBank taishin =new TaishinBank();
		System.out.print(taishin.RateInterest());
	}

}
