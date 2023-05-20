package Day05;

import java.util.HashSet;
import java.util.Set;

//	hashSet
//	입력되는 단어가 순서대로 배치될 때, 끝말잇기가 이어지는지 확인

public class Ex15 {

	public static boolean FollowUp(String[] words) {
		Set<String> set01 = new HashSet();
		set01.add(words[0]);
		char last_word = words[0].charAt(words[0].length()-1);
		
		for(int i=1; i<words.length; i++) {
			String s = words[i];
			char first_word = s.charAt(0);
			
			if(first_word != last_word) {	// 첫번째 단어가 마지막 단어가 아닌 경우 작업 종료
				System.out.println("단어가 틀렸습니다.");
				return false;
			} else if(!set01.add(words[i])) {	// 해당 단어를 추가하지 않았다면 false(중복)
				System.out.println(words[i] + "가 중복되었습니다.");
				return false;
			}
			
			last_word = s.charAt(s.length()-1);
		}
		System.out.println("끝말잇기 성공");
		return true;
	}
	
	public static void main(String[] args) {
	
		String[] words = {"hello", "orange", "emergency", "yello", "orange"};
		System.out.print("입력 : [ ");
		for(String s : words) {
			System.out.print(s + ",");
		}
		System.out.println("]");
		
		System.out.println(FollowUp(words));
	}
	
}
