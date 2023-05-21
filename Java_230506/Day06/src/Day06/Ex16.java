package Day06;

public class Ex16 {

	public static void Solve1() {

		int total = 0;

        for (int i=1; i<1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        System.out.println(total);			
	}
	
	public static int GetTP(int M, int N) {
		if(M%N == 0) {
			return M/N;
		}
		return M/N + 1;
	}
	
	public static void Solve2() {
		System.out.println(GetTP(5,10));
	}

	public static int GetDC(int num) {
		
//		1번 방법
//		String s = ""+num;	// 숫자를 문자로 전환
//		return s.length();
		
//		2번 방법
		int count = 0;	// 개수 체크용
		while(true) {
			if(num == 0) {
				break;
			}
			num /= 10;
			count++;	
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Solve1();
		Solve2();
		
		System.out.println(GetDC(5)); 

	}
}
