package Test;
/**
 * 此為文字註解，使用迴圈
 * 20200701
  */

public class RunTime {
	public static void main(String[] args) {
		float f1 = 1.5267946143f; // 單精浮點要在數值後加"f"(不分大小寫)
		double d1 = 2.0534343443; // 預設就是雙精浮點，無須強制要在數值後加"d"(不分大小寫)
		String strFor = "";
		int intPnf = 1;
		//迴圈開始
		for (int x = 0; x <= 5; x++) {
			strFor = strFor + "w";
			intPnf = intPnf + x;
			/**
			 * 在console要將顯示的值
			 * 可用System.out.print();
			 * print  ->直接顯示
			 * println->顯示後並換行
			 * printf ->進行格式化處理
			 */
			System.out.print("x = " + x + " , ");
			System.out.print(strFor + "\n");
			System.out.println((double)intPnf+f1);
		}
		/*
		 * 跳脫字元
		 * 				\",		\'	,	\\	,	\n
		 * 可讓字串顯示	雙引號"  單引號'  反斜線\    (不顯示，只有換行作用)      
		 * 
		 * 佔位符號
		 * 		該方法使用指定的語言環境、字符串格式和參數生成一個格式化的新字符串。新字符串始終使用指定的語言環境。
		 * 		用於System.out.printf("%s%7.4f%s%n", "pi=",3.1415, " 是圓周率");
		 * 				%s,		%d ,	%f ,	%n
		 * 代表			字串		整數		浮點類型	(不顯示，只有換行作用)   
		 */
		System.out.printf("%s%7.4f%s%n", "pi=",3.1415, " 是圓周率");
		System.out.printf("%s%n", "Java ver 1.8_06 版");
		System.out.printf("%s %d %s%n", "YVST", 100, "分");
		System.out.printf("%s\"%s\"%n", "I like ", "Java");
		System.out.printf("\\%s\\", intPnf);		
	}
}
