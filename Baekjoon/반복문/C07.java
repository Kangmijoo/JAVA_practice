/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 첫째 줄에 테스트 케이스의 개수 T가 주어진다. (0 < A, B < 10)
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 * 입력 : 5 \ 1 1 \ 2 3 \ 3 4 \ 9 8 \ 5 2
 * 출력 : Case #1: 2 \ Case #2: 5 \ Case #3: 7 \ Case #4: 17 \ Case #5: 7*/
import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d\n", i+1, A[i]+B[i]);
		}
	}

}
