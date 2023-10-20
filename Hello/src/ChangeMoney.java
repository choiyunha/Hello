import java.util.Scanner;
public class ChangeMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input price(won): ");
		int value = scanner.nextInt();  // 가격 읽기
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};   // cash unit
		
		int i, k;
		for(i=0 ; i<unit.length ; i++)
		{
			k = value/unit[i];
			if(k>0)  // k=0일 경우 프린트 하지 않는다.
				System.out.println(unit[i]+": "+k);
			value = value - k*unit[i];
		}
	}
}
