/* 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제. 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * 입력 : 5	-> 출력 :     *
					   **
					  ***
					 ****
					*****		*/
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i; j--) {	//공백 개수
				System.out.print(" ");
			}
			
			int k = 1;
			while(k <= i) {					//별 개수
				System.out.print("*");
				k++;
			}
			System.out.println("");
		}
		
	}

}
