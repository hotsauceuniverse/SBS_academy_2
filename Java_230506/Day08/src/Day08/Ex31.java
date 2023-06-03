package Day08;

//	클래스에는 인스턴스 변수가 존재하고, 클래스 변수가 존재한다.
//	인스턴스 변수 / 메소드란 클래스를 통해 생성한 인스턴스의 변수 / 메소드를 의미하며 생성된 개체가 각각 가지고 있는 값
//	클래스 변수 / 메소드란 인스턴스가 아닌 클래스가 가지고 있는 변수 / 메소드를 그대로 사용하는 것을 의미
//	키워드 static이 붙어있는 변수 / 메소드를 의미

//	아래의 유닛이 가지고있는 변수 / 메소드 중에서 static으로 설계했을 때 더 자연스러운 것은?

class Vulture {
	int x, y = 0;			// 유닛의 위치
	int hp = 75;			// 유닛의 체력
	int food = 2;			// 유닛의 인구수
	float c_time = 30.f;	// 유닛의 생성시간
	
	static int atk = 20;
	static int def = 0;
	static int mine = 0;
	static float speed = 3.126f;
	
	static boolean UseSpiderMine = false;	//	해당 기능이 활성화 되어있으면 마인을 생성할 수 있음
	static boolean IonThruster = false; 	// 해당 기능이 활성화 되어있으면 이동속도 증가
	
	void Upgrade_Mine() {
		UseSpiderMine = true;
		mine += 3;
	}
	
	void Upgrade_IonThruster() {
		IonThruster = true;
		speed = 4.688f;
	}
	
	void Upgrade_atk() {
		atk += 2;
	}
	
	void Upgrade_def() {
		def += 1;
	}
	
	void Move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class Ex31 {

	public static void main(String[] args) {
		
	}
	
}
