package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// testFileOutputStream();
		testFileInputStream();
	}

	public static void testFileOutputStream() {
		try {
			FileOutputStream obj = new FileOutputStream("c:\\testchar\\omj.text");
			obj.write(90); // 單行純字元值
			// == start 可一行字串之 輸入
			String str = "五我窩我喔我 我 我 我屋我 我 我 ";
			byte[] bArry = str.getBytes();
			obj.write(bArry);
			// == end
			obj.close();
			System.out.print("輸出成功");
		} catch (IOException e) {
			System.out.print(e);
		}
	}

	public static void testFileInputStream() {
		try {
			FileInputStream obj = new FileInputStream("c:\\testchar\\omj.text");
			// 只讀取一個字元
			int t = obj.read();
			System.out.println((char) t);
			// 可讀取多個字元
			while ((t = obj.read()) != -1) {
				System.out.print((char) t);
			}
			obj.close();
		} catch (IOException e) {
			System.out.print(e);
		}
	}

	public static void testImg_FileInputStream(){
		FileInputStream obj;
		try {
			obj = new FileInputStream("C:\\testchar\\circle_down_white.png");
			obj.close();
		} catch (FileNotFoundException e) {
			System.out.print(e);
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
	}
}
