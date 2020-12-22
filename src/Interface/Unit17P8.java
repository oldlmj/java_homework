package Interface;
interface Vehicle{
	String getBrand();
	String run();
	default String alarmOn(){
		return "開啟警告燈";
	}
	default String alarmOff(){
		return "關閉警告燈";
	}
}
class Car implements Vehicle{
	private String brand;
	Car (String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public String run(){
		return "安全駕駛中....";
	}
}
public class Unit17P8 {

	public static void main(String[] args) {
		Car car =new Car("TOYOTA");
			System.out.print(car.getBrand());
			System.out.print(car.run());
			System.out.println(car.alarmOn());
			System.out.println(car.alarmOff());
	}

}
