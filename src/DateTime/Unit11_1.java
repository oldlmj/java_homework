package DateTime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Unit11_1 {

	public static void main(String[] args) {
		// test1();
		// test2();
		// testOther1();
		// testOther2();
		testOther3();
	}

	public static void test1() {
		long startDate, endDate;
		int pwd = (int) (Math.random() * 99) + 1;
		int num;
		System.out.println(pwd);
		Scanner scn = new Scanner(System.in);
		startDate = System.currentTimeMillis();
		for (;;) {
			System.out.print("請猜0-99的數字: ");
			num = scn.nextInt();
			if (num == pwd) {
				System.out.println("恭喜猜對了~~");
				endDate = System.currentTimeMillis();
				break;
			} else if (num > pwd) {
				System.out.println("再猜小一點~~");
			} else if (num < pwd) {
				System.out.println("再猜大一點~~");
			}
		}
		System.out.print("所花時間(毫秒):" + (endDate - startDate));
		scn.close();
	}

	public static void test2() {
		Instant from, to;
		int pwd = (int) (Math.random() * 99) + 1;
		int num;
		System.out.println(pwd);
		Scanner scn = new Scanner(System.in);
		from = Instant.now();
		for (;;) {
			System.out.print("請猜0-99的數字: ");
			num = scn.nextInt();
			if (num == pwd) {
				System.out.println("恭喜猜對了~~");
				to = Instant.now();
				break;
			} else if (num > pwd) {
				System.out.println("再猜小一點~~");
			} else if (num < pwd) {
				System.out.println("再猜大一點~~");
			}
		}
		Duration dur = Duration.between(from, to);
		System.out.printf("所花時間 %d 分 \n", dur.toMinutes());
		System.out.printf("所花時間 %d 秒 \n", dur.getSeconds());
		scn.close();
	}

	public static void test3() {
		Period period = Period.between(LocalDate.of(1990, 1, 1), LocalDate.of(2020, 8, 10));
		System.out.printf("過 %d 年 , ", period.getYears());
		System.out.printf("又 %d 月 , ", period.getMonths());
		System.out.printf("和 %d 日", period.getDays());
	}

	public static void testOther1() {
		/*
		 * 某人 2020-04-01 08:00 開始上班 17:00下班 至 2020-07-29 13:00 離職 0.周休2日
		 * 1.時薪:250 2.中途離職且未做滿90天，薪資打8折 3.中午休息時間不計工資 問此人可領多少錢?
		 */
		int intDays = 0, money = 0, intYear, intMonth, intDay, intH, intM, intEYear, intEMonth, intEDay, intEH, intEM;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入入職年份: ");
		intYear = scn.nextInt();
		System.out.print("請輸入入職月份: ");
		intMonth = scn.nextInt();
		System.out.print("請輸入入職日: ");
		intDay = scn.nextInt();
		System.out.print("請輸入入職時間(時): ");
		intH = scn.nextInt();
		System.out.print("請輸入入職時間(分): ");
		intM = scn.nextInt();
		LocalDate startDate = LocalDate.of(intYear, intMonth, intDay);
		LocalDate sDate = startDate;
		System.out.print(LocalDate.of(intYear, intMonth, intDay));
		LocalTime startTime = LocalTime.of(intH, intM, 00);
		System.out.print("請輸入離職年份: ");
		intEYear = scn.nextInt();
		System.out.print("請輸入離職月份: ");
		intEMonth = scn.nextInt();
		System.out.print("請輸入離職日: ");
		intEDay = scn.nextInt();
		System.out.print("請輸入離職時間(時): ");
		intEH = scn.nextInt();
		System.out.print("請輸入離職時間(分): ");
		intEM = scn.nextInt();
		LocalDate endtDate = LocalDate.of(intEYear, intEMonth, intEDay);
		System.out.print(endtDate);

		// 入職到離職的天數計算
		if (startDate.getYear() == startDate.getYear()) {
			// getMonthValue() ->取得月份轉成數值
			for (int i = startDate.getMonthValue(); i <= endtDate.getMonthValue(); ++i) {
				// getDayOfMonth() ->取得目前幾號 , lengthOfMonth()->取得該月份總天數
				for (int d = sDate.getDayOfMonth(); d <= sDate.lengthOfMonth(); d++) {
					// getDayOfWeek().getValue() =>取得該日期的星期幾
					System.out.println("取得該日期的星期" + sDate.getDayOfWeek().getValue());
					if (sDate.getDayOfWeek().getValue() < 6) {
						intDays += 1;
					}
					sDate = LocalDate.of(2020, sDate.getMonthValue(), d);
				}
				sDate = LocalDate.of(2020, sDate.getMonthValue() + 1, 1);
			}
		} else {
			// 放置年資滿一年以上的計算，暫不施工
			System.out.print("放置年資滿一年以上的計算，暫不施工 :(");
		}

		if (intDays < 90) {
			// 若中途離職做不到90天薪水則打八折
			money = (int) ((intDays * 8 * 250) * 0.8);
			System.out.print("總工作天數總計" + intDays + "天，由於未做滿90天，因此打八折，薪資:" + money);
		} else {
			money = intDays * 8 * 250;
			System.out.print("總工作天數" + intDays + "，薪資:" + money);
		}

	}

	public static void testOther2() {
		/*
		 * 某客運司機 1.每日工作不可超過11小時，每月月休8天 2.超過11小時，每小時加薪220元
		 * 3.司機從2020/07/01至31，共駕駛266小時 4.若底薪4萬元，司機可領多少
		 */
		LocalDate startDate = LocalDate.of(2020, 07, 1);
		LocalDate endtDate = LocalDate.of(2020, 07, 31);
		Period per = Period.between(startDate, endtDate);
		int i = per.getDays() * 8 - (8 * 8), intH = 266;
		int money = 40000;
		if (i <= intH) {
			System.out.println("時數:" + per.getDays() * 8);
			// money=per.getDays()*8*220;
			System.out.println("薪水:" + money);
		} else {
			i = i - startDate.lengthOfMonth() * 8;
			money = money + i * 220;
			System.out.println("薪水:" + money);
		}
	}

	public static void testOther3() {
		/*
		 * 將test1或test2拿來，並更改為3分鐘內要猜中，否則就失敗
		 * 
		 */
		LocalTime startTime = LocalTime.now();
		LocalTime endTime= LocalTime.of(startTime.getHour(),startTime.getMinute());
		long startDate, endDate;
		int pwd = (int) (Math.random() * 99) + 1;
		int num, intTime;
		System.out.println(pwd);
		Scanner scn = new Scanner(System.in);
		startDate = System.currentTimeMillis();
		for (;;) {
			if ((endTime.getSecond() - startTime.getSecond()) <=30) {
				System.out.print("請猜0-99的數字: ");
				num = scn.nextInt();
				if (num == pwd) {
					System.out.println("恭喜猜對了~~");
					break;
				} else if (num > pwd) {
					System.out.println("再猜小一點~~");
				} else if (num < pwd) {
					System.out.println("再猜大一點~~");
					endTime = LocalTime.now();
				} else {
					System.out.print("超果3分鐘失敗!!");
					break;
				}
				endTime = LocalTime.now();
			}
		}
	}
}
