package Array;

public class Unit7 {

	public static void main(String[] args) {
		float floT = 0f, floA = 0f, floTmp = 1f, floRank = 0f;
		int intTmp;
		
		float[][] z = { { 84, 92.5f, 76.5f,0,0,0 }, { 82.5f, 83, 80,0,0,0 }, { 85, 81, 66,0,0,0 }, { 74.5f, 86, 67,0,0,0 }, { 79, 84.5f, 72,0,0,0 } };		
		String[] strName = { "蘇", "吳", "陳", "劉", "張" };

		for (int x = 0; x < z.length; x++) {
			floT = 0f;
			floA = 0f;			
			for (int y = 0; y < z[x].length-2; y++) {
				floT = z[x][y] + floT; // 每個人課程加總
			}
			floA = floT / 3; // 每個人的平均
			z[x][3] = floT; // 放入總分
			z[x][4] = floA; // 放入平均			
				
			for (int a = 0; a < z[x].length; a++) {
				float[][] floarry = new float[z.length][z[x].length];
				floarry[x][a]= floT; 				
		

	if(z[x][3]>z[x+1][3]){floarry[0][a]=z[x][3];System.out.println("總分="+floarry[0][a]);}}}

	}

	public static void arry(int[] v) {

	}

}
