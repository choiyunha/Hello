
import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("C:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			
			// 파일 데이터가 모두 출력된 상태
//			new Scanner(System.in).nextLine();
//			
//			out.flush();
//			
//			fin.close();
//			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
