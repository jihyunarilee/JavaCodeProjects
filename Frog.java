
public class Frog {

	public static int solution(int X, int[] A) {
		
		int a = 0;
		boolean found = false; 
		 
		for(int i=0; i < A.length; i++) {
			if(A[i] == X) {
				found = true;
				a = i;
				break;
			}
		}
		
		if (found == true) {
			return a;
		}
		else {
			return -1;
		}
			
		
    }
	
	
	public static void main(String[] args) {
		
		int[] list = {2,2,2,2,2,2,2};
		System.out.println(solution(2,list));
		
	}
}

