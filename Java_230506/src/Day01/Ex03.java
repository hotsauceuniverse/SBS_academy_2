package Day01;

class Shape {
	private String type;

	// 필드값을 통해 생성자를 생성
	public Shape(String type) {
		super();
		this.type = type;
	}
	
	public void info() {
		System.out.println("도형의 종류 : " + type);
	}
	
}

class Circle extends Shape {
	private double radius;
	
	// 필드값을 통해 생성자를 생성
	public Circle(String type, double radius) {
		super(type);
		this.radius = radius;
	}
	
	// 넓이구하기
	public double getArea() {
		return 3.14 * Math.pow(radius, 2);
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("반지름 : " + radius);
		System.out.println("넓이 : " + getArea());
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		Circle circle = new Circle("Donut", 7.5);
		circle.info();
		
	}
	
}
