
import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];    // 비어있는 byte 배열
		
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			
			int n = 0, c;
			
			while ((c = fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("Output data from c:\\Temp\\test.out");
			
			for (int i = 0; i< b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			fin.close();
			
		} catch (IOException e) {
			System.out.println("Cannot read from c:\\Temp\\test.out " + e.getMessage());
		}
	}
}
