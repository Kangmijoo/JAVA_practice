import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = 13;
		int right = 17;
		
		int answer = 0;
        int cnt = 0;
        for(int i = left; i <= right; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
                
            }
            if(cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            cnt = 0;
        }
	}

}