/* 두 정수가 입력된다. 두 정수의 크기를 비교하여 왼쪽 수가 크면 > 를 출력, 오른쪽 수가 크면 < 를 출력, 같으면 = 을 출력하시오.
 * 입력 : 2 6	 -> 출력 : <		*/
import java.util.Scanner;

public class C1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a < b) {
			System.out.println("<");
		} else if(a > b) {
			System.out.println(">");
		} else {
			System.out.println("=");
		}

	}

}
