package Day03;
//	한 파일 내에서 여려 개의 예외상황을 잡아내는 경우

public class Ex11 {

	public static void main(String[] args) {
		String str = "Java";
		str = null;
		int[] numbers = new int[10];
		
		try {
			int length = str.length();
			System.out.println(length);
			
			numbers[10] = 10;
			System.out.println(numbers[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
//		ArrayIndexOutOfBoundsException
//		NullPointerException
//		from x skill to android studio
		
	}
	
}
