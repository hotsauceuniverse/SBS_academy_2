package Day05;

import java.util.HashSet;
import java.util.Iterator;

//	Set : 데이터를 묶어서 표현하는 자료구조 
//	1. Set에는 중복값을 삽입할 수 없음
//	2. Set에는 별도의 순서 개념이 없음(=index를 사용 할 수 없음)

//	Set인터페이스
//	해당 기능을 구현한 클래스 -> HashSet<E>, TreeSet<E>

//	자바에서 Hash~라고 이름붙은 클래스는 해시 알고리즘을 사용하고 있음
//	자바에서 Tree~라고 이름붙은 클래스는 이진 검색 트리(binary search tree)의 형태로 데이터를 정렬된 상태로 저장하고 있음

//	1. 해시(hash) : 임의의 길이를 가지는 임의의 데이터를 고정된 길이도 표현한 값
//	2. 해시 알고리즘 : 데이터를 해시 테이븡레 저장하고, 그 값을 다시 검색하는 알고리즘

//	해당 알고리즘의 특징 : 검색속도가 빠름

public class Ex14 {

	public static void main(String[] args) {
		
		HashSet<String> hash01 = new HashSet();
		HashSet<String> hash02 = new HashSet();
		
		hash01.add("Data 01");
		hash01.add("Data 02");
		hash01.add("Data 02");

//		index가 없기때문에 일반적인 for문으로 작업하지 않음
//		for(int i=0; i<hash01.size(); i++) {}
		
		System.out.println(hash01);	// 해당 클래스 출력 시, 저장되어있는 데이터가 표현됨
		
//		Enhanced for문을 통해 작업이 가능
//		헤당 문법은 자료구조의 형태에서 각각의 값을 처리하는 방식
		for(String s : hash01) {
			System.out.println(s);
		}
		System.out.println();
		
		hash02.add("A");
		hash02.add("B");
		hash02.add("C");
		hash02.add("D");
		
		hash02.remove("C");	// 데이터 삭제
		
		HashSet<String> hash03 = hash02;
		
		System.out.println(hash02);
		System.out.println(hash03);
		
		hash03.add("E");
		hash03.add("F");
		hash03.add("G");
		hash03.add("H");

		System.out.println(hash02);
		System.out.println(hash03);
		
		
		System.out.println(hash02.size());	// 데이터의 크기
		System.out.println(hash01.hashCode());	// 해시코드
		System.out.println(hash02.hashCode());	// 해시코드
		System.out.println(hash03.hashCode());	// 해시코드
//		해시코드가 같다 == 같은 데이터
		System.out.println(hash02.contains("R"));	// 해당 값을 포함하고 있는지 판단(검색)
		
		if(hash02.contains("D")) {
			hash03.retainAll(hash01);
//			hash03의 데이터를 hash01의 데이터와 겹치는 값만 남기고 전부 제거하는 코드
		}
		
		System.out.println(hash01); 
		System.out.println(hash02);
		System.out.println(hash03);
	
//		전체 객체를 대상으로 한번씩 반복해서 작업하는 반복자(Iterator)를 통해 출력
//		Iterator를 사용했을 경우, 공통적인 문법으로 처리가 가능하다는 장점이 있음
		Iterator iter = hash02.iterator();
		while(iter.hasNext()) {		// 반복자에 다음 값이 존재하는 동안
			System.out.print(iter.next() + " ");	// 값 출력
		}
		
		
	}
	
}
