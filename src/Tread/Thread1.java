package Tread;

public class Thread1 {

	public static void main(String[] args) {
		// 跑道 100M
		// 兔子每次走5M，但走2次會休息0.5秒
		// 烏龜每次走3M
		// 請模擬龜兔賽跑，並顯示贏家 o_O|||a
		Game g1 = new Game("兔子", 50, 2);
		Game g2 = new Game("烏龜", 3, 0);
		g1.start();
		g2.start();
	}

}

class Game extends Thread {
	int gwalk = 0, gi = 0, itotal = 0, time;
	String strgName;

	Game(String strName, int walk) {
		this.gwalk = walk;
		this.strgName = strName;

	}

	Game(String strName, int walk, int i) {
		this.strgName = strName;
		this.gwalk = walk;
		this.gi = i;
		time = this.gi * this.gwalk;
	}

	public void run() {
		for (int g = 0; g <= 1000; g = g + this.gi) {
			itotal += gwalk;
			System.out.println(this.strgName + "跑了" + this.itotal + "m");
			if (itotal < 100) {
				if (this.gi > 0 && itotal % this.gi == 0) {
					try {
						System.out.println(strgName + "要睡睡了~");
						sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			} else {
				System.out.println(strgName + "是贏家~~~~~~");
				break;
			}			
		}
	}
}
