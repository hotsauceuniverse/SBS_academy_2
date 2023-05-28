package Day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//	10마리 정도의 말이 경주를 진행하는 프로그램
//	말에 대한 객체를 구현하기 위해, 클래스 Horse 생성
// 	이 클래스는 말의 이름과 등수를 필드값으로 가지게 된다. 
//	이 클래스는 getter/setter를 가지고 있으며, 이름을 넣고 생성할 수 있게 생성자가 수정되어있음

//	이 클래스에서는 등수를 오름차순으로 처리할 수 있는 기능을 가지고 있음
//	경기 중 각 말들의 위피를 출력문으로 표현

//	말의 움직임 표현을 위해 Thread연결
//	말의 오름차순 기능 구현을 위해 Comparable<T> 인터페이스 구현
class Horse extends Thread implements Comparable<Horse> {

	private String Horse_name;
	int rank;

	public Horse(String horse_name) {
		super();
		Horse_name = horse_name;
	}

	public String getHorse_name() {
		return Horse_name;
	}

	public void setHorse_name(String horse_name) {
		Horse_name = horse_name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override

	public int compareTo(Horse o) {
		//만약에 게임에서의 랭크가 말이 가지고 있는 랭크보다 크다면 1을 return, 아니면 -1 리턴

		if(rank > o.rank) {
			return 1;
		} else {
		return -1;
		}
	}

	@Override
	public void run() {

		for(int i =0 ; i < 50; i++)	{

			System.out.println("\n" + Horse_name + " : ");

			//말의 이동 선을 표현

			for(int j = 0 ; j < i; j++) {
				System.out.print("-");
			}

			System.out.print(">");

			for(int j = 49; j > i; j--) {
				System.out.print("-");
			}
			
			System.out.println();//띄어쓰기
			System.out.println();//띄어쓰기

			try{
				Thread.sleep((int)(Math.random() * 500));
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		//for문의 처리 후 

		System.out.println("\n" + Horse_name + "통과!");

		setRank(Ex25.Rank); //게임의 랭크로 말의 랭크를 설정합니다.

		Ex25.Rank++;//랭크가 1씩 증가합니다. (1등 ,2등 ,3등 ....)

	}
}


public class Ex25 {

	static int Rank = 1;
	
	public static void main(String[] args) {
		
		List<Horse> list = new ArrayList();
		
//		말에 대한 정보를 추가
		list.add(new Horse("A"));
		list.add(new Horse("B"));
		list.add(new Horse("C"));
		list.add(new Horse("D"));
		list.add(new Horse("E"));
		list.add(new Horse("F"));
		list.add(new Horse("G"));
		list.add(new Horse("H"));
		list.add(new Horse("I"));
		list.add(new Horse("J"));
		
//		리스트 전체에서 출발 시도
		for(Horse h : list) {
			h.start();
		}
		
		for(Horse h : list) {
			try {
				h.join();	//	thread가 종료되기까지 기다렸다가 다음으로 넘어가는 전개
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		Collections.sort(list);		// 리스트 자체에 대한 오름차순
		
//		경기에 대한 결과 처리
		System.out.println("경기 종료");
		System.out.println("경기 결과 표");
		System.out.println("============================================");
		for(Horse h : list) {
			System.out.println(h.getHorse_name() + " : " + h.getRank() + "등");
		}
		System.out.println("============================================");
	
	}
	
}
