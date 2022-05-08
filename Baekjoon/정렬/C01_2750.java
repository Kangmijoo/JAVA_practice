/* N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성. 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 입력 : 5 \ 5 \ 2 \ 3 \ 4 \ 1	-> 출력 : 1 \ 2 \ 3 \ 4 \ 5 	*/
import java.util.Arrays;
import java.util.Scanner;

public class C01_2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < a; i++) {
			System.out.println(arr[i]);
		}
	}

}
