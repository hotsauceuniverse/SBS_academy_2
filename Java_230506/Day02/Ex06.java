package Day02;

//	내부 클래스
//	하나의 클래스 내부에 선언된 또 다른 클래스
//	외부 클래스에 대해 두 개의 클래스가 서로 밀접한 관계 

//	내부클래스는 클래스를 외부에 따로 작성하는 경우보다, 물리적/논리적으로 외부클래스에 더 가깝게 위치함
//	한 클래스를 다른 클래스의 내부클래스로 선언할 경우, 두 클래스 멤버 간에 서로 자유롭게 접근이 가능하고, 외부에 불필요한 클래스를 감춰서 코드의 복잡성을 줄일수 있음

//	>> 특정 A클래스 안에서만 사용하기 위한 B클래스

//	클래스의 유형
enum TYPE {
	ZOMBIE, DRAGON, FIEND
}

enum Attribute {
	EARTH, WIND, FIRE, WARTER
}

class Monster {	//	외부클래스 
	private String name;
	private int LV;
	private int ATK;
	private int DEF;
	private TYPE type;
	private Attribute atr;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLV() {
		return LV;
	}

	public void setLV(int lV) {
		LV = lV;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int aTK) {
		ATK = aTK;
	}

	public int getDEF() {
		return DEF;
	}

	public void setDEF(int dEF) {
		DEF = dEF;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public Attribute getAtr() {
		return atr;
	}

	public void setAtr(Attribute atr) {
		this.atr = atr;
	}

	class ZOMBIE {	//	내부클래스 
		public void Setting(String name, int LV, int ATK, int DEF, Attribute atr) {
//			this.name = name; 	// name은 Monster클래스의 것이므로, 설정불가, get/set으로 호출필요
			setATK(ATK);
			setAtr(atr);
			setDEF(DEF);
			setLV(LV);
			setName(name);
			setType(TYPE.ZOMBIE);
			
		}
	}
	
	class DRAGON {	//	내부클래스 
		
	}
	
	class FIEND {	//	내부클래스 
		
	}
	
	public void onCreate_ZOMBIE() {
		ZOMBIE zombie = new ZOMBIE();
		zombie.Setting("A", 1, 1, 1, Attribute.FIRE);
		Info();
	}
	
	public void Info() {
		System.out.println(name + LV + ATK + DEF + atr + type);
	}
}



public class Ex06 {

	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
		monster1.onCreate_ZOMBIE();
	}
	
}
