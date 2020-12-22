package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {

		// 使用二維陣列放不規則的資料，找出最大及最小值並計算列的總和及平均
		// 宣告一個二維陣列
		int[][] intX = { { 3, 90, 61, 9, 15 }, { 25, 66, 2, 51, 38 }, { 60, 26, 101, 46, 51 } };
		int intMax, intMin, intT, intA = 0; // intT用來做加總的值
		intMax = intMin = intX[0][0]; // 設定intMax跟intMin初始值是intX[0][0]
		
		for (int x = 0; x < intX.length; x++) {
			intT = 0; 	//是計算每個行的值，並非累計，因此要將intT設定0
			for (int y = 0; y < intX[x].length; y++) {
				//若intX[x][y]大於 intMax，intMax = intX[x][y]]
				if (intX[x][y] > intMax) {
					intMax = intX[x][y];
				} else if (intMin > intX[x][y]) {
					intMin = intX[x][y];
				}
				intT = intT + intX[x][y]; 					// 該行的加總
				intA = intT / (intX[x].length);		// 該行的平均
			}
			System.out.println("第" + x + "列的加總 = " + intT);
			System.out.println("第" + x + "列的平均 = " + intA);
		}
		System.out.println("最大值: " + intMax + "   最小值: " + intMin);
	}

}
