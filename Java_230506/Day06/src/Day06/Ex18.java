package Day06;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

import Day06.ConsumerT.Student;

//	Consumer FI : 매가 값이 있고, 리텀값이 없는 형태
//				  accept()라는 메소드를 보유

//	해당 인터페이스의 형태
//	XXXConsumer<T> : XXX 형태의 인자 값을 받는다
//	BiConsumer<T, U> : T, U 형태의 인자 값을 받는다
//	ObjXXXConsumer<T> : T, XXX 형태의 인자 값을 받는다

class ConsumerT {
	Consumer<String> csm01 = a -> System.out.println("입력 값은 " + a + " 입니다");
	IntConsumer csm02 = a -> System.out.println("입력 값은 " + a + " 입니다");
	BiConsumer<String, Integer> csm03 = (a,b) -> System.out.println("입력 값은 " + a + " 와 " + b + " 입니다");
	ObjIntConsumer<Student> csm04 = (a,b) -> System.out.println("학생의 이름 : " + a.name + " 값 : " + b);
	
	class Student {
		public String name;
		Student(String name) {
			this.name = name;
		}
	}
}

public class Ex18 {

	public static void main(String[] args) {
		
		ConsumerT ct = new ConsumerT();
		
		ct.csm01.accept("우영우");
		Student s = ct.new Student("이성경");
		ct.csm04.accept(s, 123);
	}
	
}
