package DataBase;

public class Test2 {

	public static void main(String[] args) {
		double sum =0;
		double average =0;
		double [][][] Score ={{{ 84,92,40}},
							  {{82,83,80}},
							  {{85,81,66}},
							  {{74.5,86,17}},
							  {{79,84.5,30}}};
		String [] str = {"座號","姓名","國文","英文","數學","總分","平均","名次"};
		// 印出上方標題 str
		for(int i =0; i < str.length; i++) {
			System.out.print(str[i]+ "\t");
		}
		String [] name = {"小明","小王","小陳","小張","小林"}; 
		// 新增名為arrSum[]，而大小是為Score[]
		double [] arrSum = new double[Score.length]; // <===== add arrSum
		double [] arrAverage = new double[Score.length]; //<===== add arrAverage
		int [] rank = new int[Score.length]; //<===== add Rank
		Object [][] kv = new Object[Score.length][2]; // add key-value,set average and get ref of Score
		//成績計算
		for(int i =0; i < 5; i++) {
			for( int j =0; j < 1; j++) {
				for(int k =0; k < 3; k++) {
					sum+=Score[i][j][k];
					average =sum /3.0;
					
					arrSum[i] = sum;
					arrAverage[i] = average;
					kv[i][0] = average;
					kv[i][1] = i;
				}
			}
			sum =0;
			average =0;	
		}
		//排名: use for() 迴圈 / 泡沫排序
		for(int i =0; i <Score.length - 1; i++) {
			for(int j = i+1; j <Score.length; j++) {
				if((double)kv[i][0] <(double)kv[j][0]) {
					Object [] tmp = kv[i];
					kv[i] = kv[j];
					kv[j] = tmp;
					
			}
		}
	}
		//set 名次	
		for(int i =0; i < Score.length; i++) {
			rank[(int)kv[i][1]]=i+1;
		}
		//列印
        for(int i=0; i < 5; i++) {
            System.out.printf("\nS00%d\t",i+1);
            System.out.printf("%s",name[i]+"\t");
           
            for(int j=0; j < 1; j++) {
                for(int k=0; k < 3; k++) {
                    System.out.print(Score[i][j][k]+ "\t");
                }
                System.out.print(arrSum[i]+ "   ");
                System.out.printf("%2.1f     ",arrAverage[i]);
                System.out.printf("%d",rank[i]);
                
               
            }
        }	
  }		
}
