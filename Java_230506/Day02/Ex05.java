package Day02;

import java.util.Scanner;

//	추상클래스Converter가 준비되었을 때, 메인코드를 참고하여 자식클래스를 구현

//	팁 
// 	1. abstract로 설정된 부분은 public으로 완성된 코드와 실행 결과를 보고 판단
//	2. abstract 클래스에서 abstract가 아닌 값은 사용해도 되는 값으로 판단하고 풀이

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getString();
	abstract protected String getString2();
	protected double ratio;
		
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s => %s%n", getString(), getString2());
		System.out.printf("%s >> ", getString());
		double value = sc.nextDouble();
		double converter = convert(value);
		System.out.printf("번환 결과는 %.1f%s 입니다%n", converter, getString2());
		sc.close();
	}
}

class W2D extends Converter {

	// 필드값을 넣고 생성자를 만들어주는 직업
	public W2D(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getString() {
		// TODO Auto-generated method stub
		return "Won";
	}

	@Override
	protected String getString2() {
		// TODO Auto-generated method stub
		return "Dollar";
	}  
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		W2D w2d = new W2D(1300);	// 생성자에 대한 수정이 진행되었음을 알려줌
		w2d.run();
		// 실행결과 :
		// Won => Dollar
		// Won >> 26000
		// 변환 결과는 20.0 Dollar입니다
		
		
	}
	
}
