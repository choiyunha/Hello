import java.util.Scanner;
public class Simple369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter integer value 1~99 : ");
		int value = scanner.nextInt();  // 정수값 읽기
		
		int a, b;
		a = value/10;  // 십의 자리 구하기
		b = value%10;  // 일의 자리 구하기 
		
		if((value<1)||(value>99))  // 범위에서 벗어난 수를 입력한 경우
			System.out.println("Try again");
		
		else if((a%3==0)&&(b%3==0)&&(a*b!=0))  //3,6,9가 2개 있는 경우
			System.out.println("박수짝짝");
		
		else if (a*b%3==0)  //3, 6, 9가 1개 있는 경우
			System.out.println("박수짝");
		
		else  // 3,6,9가 없는 경우
			System.out.println("No 3, 6, or 9");

		scanner.close();
	}
}
