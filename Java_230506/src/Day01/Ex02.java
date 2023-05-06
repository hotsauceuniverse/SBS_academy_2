package Day01;

class TV{
	private int size;
//	size를 넣고 생성하도록 생성자를 수정
	public TV(int size) {
		super();
		this.size = size;
	}
//	protected 타입의 get함수 설계
	protected int getSize() {
		return size;
	}

	public void tvInfo() {
	}

}

class IPTV extends TV {
//	IP에 대한 정보와, size와 해상도에 대한 정보를 넣어 생성하도록 생성자를 수정
//	해상도에 대한 get함수를 설계
//	메인 실행 결과처럼 tvInfo를 오버라이딩 하시오
	private int resolution;
	private String ip;
	
//	필드값 만들기
	public IPTV(String ip, int size, int resolution) {
		super(size);
		this.ip = ip;
		this.resolution = resolution;
	}

	public int getResolution() {
		return resolution;
	}

	@Override
	public void tvInfo() {
		System.out.printf("IPTV %s %d인치 %d 해상도", ip, getSize(), getResolution());
	}

}

public class Ex02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.1", 32, 2048);
		iptv.tvInfo();
		
		
//		IPTV 192.1.1.1 32인치 2048 해상도
	}
	
}
