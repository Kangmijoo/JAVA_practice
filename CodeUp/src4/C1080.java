/* [종합] 1, 2, 3 ... 을 계속 더해 나갈 때, 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
 * 즉, 1부터 n까지 정수를 계속 더한다고 할 때, 어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제
 * 입력 : 55	-> 출력 : 10		*/
import java.util.Scanner;

public class C1080 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int i;	 
		
		for(i = 0; i < a; i++) {
			sum = sum + i;
			if(a <= sum) {
				break;
			}	
		}
		System.out.println(i);
	}

}
