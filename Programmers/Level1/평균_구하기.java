/*정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.*/
public class 평균_구하기 {
 
	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        
	        for(int i = 0; i < arr.length; i++) {
	            answer += arr[i];
	        }
	        
	        answer = answer/arr.length;
	        return answer;
	    }
	}
}
