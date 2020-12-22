package Tread;

import java.time.LocalDateTime;

public class Thread2 {

	public static void main(String[] args) {
		// 煮飯時間15分鐘(時間請設1~5之間)
		// 小明下課回家後，要求媽媽煮飯
		// 煮飯時間不可打擾媽媽
		LocalDateTime from;
		from = LocalDateTime.now();
		Thread t1 = new Thread() {
			public void run() {
				try {
					System.out.print("母大人正在住煮飯~~");
					sleep(500);					
					join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();

	}
}
