/* ���� a, x�� �Է¹޾� a�� ���� x��ŭ SHIFT(<<) ������ �� ����� ����Ͻÿ�.
 * �Է� : 3 3	 -> ��� : 24		*/
import java.util.Scanner;

public class C1147 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a<<b);
	}

}