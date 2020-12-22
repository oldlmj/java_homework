package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Unit22 {
/**
 * 	字元資料輸入及輸出_章節練習題
 * */
	public static void main(String[] args) {
		test1();

	}
	private static void test1() {
		try {			
			System.out.print("請輸入要複製檔案的位置(連同檔案完整名稱): ");
			Scanner scn=new Scanner(System.in);
			String strPath=scn.next();			
			FileInputStream src=new FileInputStream(strPath);
			System.out.println("- 來源路徑: "+strPath);
			
			System.out.print("請輸入更改來源檔的名稱: ");
			Scanner scn1=new Scanner(System.in);
			String strChrngName=scn1.next();
		
			File f=new File(strPath); //來源檔位置
			File newf=new File("C:\\testchar\\"+strChrngName); //更新名稱
			
			// 來源檔更名失敗，是因為指定路徑是要相同才不會false
			f.renameTo(newf);	
			
			Boolean T=f.renameTo(newf);
			System.out.println("- f :"+f.getName());
			System.out.println("改名是成功: "+T);
			
			
			System.out.print("請輸入目地位置: ");
			Scanner scn2=new Scanner(System.in);					
			String strPath2=scn2.next()+"\\";		
			
			System.out.print("請輸入檔名: ");
			Scanner scn3=new Scanner(System.in);
			String strName=scn3.next();
			FileOutputStream dst =new FileOutputStream(strPath2+strName);			
			
			byte[] pic =new byte[src.available()];
			src.read(pic);
			dst.write(pic);
			src.close();
			dst.close();
			scn.close();
			scn1.close();
			scn2.close();
			scn3.close();
			System.out.print("圖檔複製完成~");
		} catch (IOException e) {
			System.out.print(e);
		
		}
		
	}
	private static void test5() {
		try {
			//FileInputStream obj=new FileInputStream("");
			System.out.print("請輸入要複製檔案的完整位置:");
			Scanner scn=new Scanner(System.in);
			String strpPath=scn.next();
			FileReader fr =new FileReader(strpPath);
			String strpatter="/^*$\\{1}/";
			strpPath.replaceAll(strpatter, "");
			FileWriter rw=new FileWriter(strpPath+"10.text");
			
			//src.read();
		} catch (IOException e) {
			System.out.print(e);
		
		}
	}
}
