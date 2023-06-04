package Day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//	전화번호부

//	전화 클래스에서는 이름과 전화번호, 주소를 필드값으로 가지고 있음
class Phone {
	private String name;
	private String phone_number;
	private String address;
	
//	필드값을 이용한 생성자 만들기
	public Phone(String name, String phone_number, String address) {
		super();
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}
	
	@Override
	public String toString() {
//		개체에 대한 출력 시, 호출될 메소드
		return name + " ☎" + phone_number + " ※ : " + address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}


//	해당 프로그램에서 구현할 기능
//	1. 전화번호 등록, 수정, 삭제, 검색, 전체출력 기능
class PhoneBook {
	Scanner sc = new Scanner(System.in);
	
//	Map은 Key와 Value를 한 쌍으로 저장하는 자료구조
	private Map<String, Phone> phone_map = new HashMap<String, Phone> ();

//	헤더표현
	public void MenuHeader() {
		System.out.println("전화번호부 관리 매니저");
		System.out.println("===================");
	}
	
//	화면 안내
	public void MenuInfo() {
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 검색");
		System.out.println("5. 전화번호 전체출력");
		System.out.println("6. 프로그램 사용종료");
		System.out.println("===================");
		System.out.println("기능을 선택해 주세요.");
	}
	
//	기능 호출용 함수
	public void MenuUpdate() {
		while(true) {
		MenuHeader();
		MenuInfo();
		int menu_select = sc.nextInt();
		switch(menu_select) {
			case 1: 
				Phone_Insert();
				break;
			case 2: 
				Phone_Update();
				break;
			case 3: 
				Phone_Delete();
				break;
			case 4: 
				Phone_Search();
				break;
			case 5: 
				Phone_Info();
				break;
			case 6: 
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default : 
				System.out.println("잘못된 입력입니다");
			}
		}
	}

	public void Phone_Insert() {
		System.out.println("전화번호 등록");
		System.out.println("새로 등록할 전화번호에 대한 정보를 입력하세요");
		System.out.print("이름 : ");
		String input_name = sc.next();
		
//		이미 등록되어있는 사람인지를 확인
//		get은 map에서 키를 넣었을 때, 키에 해당하는 값을 return 하는 기능
		if(phone_map.get(input_name) != null) {
			System.out.println("이미 등록된 사람입니다");
			return;
		}
		System.out.print("전화번호 : ");
		String input_phone_number = sc.next();
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		String input_address = sc.nextLine();
		
//		phone_map에 데이터 추가
		phone_map.put(input_name, new Phone(input_name, input_phone_number, input_address));
		System.out.println(input_name + "님께서 정상적으로 등록되었습니다.");
	}
	
	public void Phone_Update() {
//		기존에 있는 값 중에서 새롭게 수정할 정보를 입력하는 기능
		System.out.println("새로 수정할 전화번호에 대한 정보를 입력해주세요");
		System.out.print("이름 : ");
		String input_name = sc.next();

		if(phone_map.get(input_name) == null) {
			System.out.println(input_name + "님은 현재 전화번호 관리 프로그램 안에 없는 사람입니다.");
			return;
		}
		System.out.print("전화번호 : ");
		String input_phone_number = sc.next();
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		String input_address = sc.nextLine();
		
		phone_map.put(input_name, new Phone(input_name, input_phone_number, input_address));
		System.out.println(input_name + "님께서 정상적으로 수정되었습니다.");
	}

	public void Phone_Delete() {
		System.out.println("삭제할 전화번호에 대한 정보를 입력해주세요.");
		System.out.print("이름 : ");
		String input_name = sc.next();

		if(phone_map.remove(input_name) == null) {
			System.out.println(input_name + "님은 현재 전화번호 관리 프로그램 안에 없는 사람입니다.");
		} else {
			System.out.println(input_name + "님은 정상적으로 삭제처리 되었습니다.");
		}
	}
	
	public void Phone_Search() {
		System.out.println("검색할 전화번호에 대한 정보를 입력해주세요.");
		System.out.print("이름 : ");
		String input_name = sc.next();
		
		Phone p = phone_map.get(input_name);
		
		if(p == null) {
			System.out.println(input_name + "님은 현재 전화번호 관리 프로그램 안에 없는 사람입니다.");
		} else {
			System.out.println(input_name + "님께서는 전화번호 관리 프로그램에 존재합니다.");
			System.out.println("검색 결과");
			System.out.printf("이름 : %s%n", p.getName());
			System.out.printf("전화번호 : %s%n", p.getPhone_number());
			System.out.printf("주소 : %s%n", p.getAddress());
		}
	}
	
	public void Phone_Info() {
		
//		map에있는 키를 표현 (map에서 값은 키에 접근하면 출력이 되지만, 키는 따로 뽑을 방법 없음)
		Set<String> keySet = phone_map.keySet();
		
		System.out.println("==============================");
		System.out.println("이름\t전화번호\t주소");
		System.out.println("==============================");
		
		if(keySet.size() == 0) {
			System.out.println("전화번호 프로그램에 등록되어있는 정보가 따로 없는 상태입니다. <Empty>");
		} else {
			Iterator<String> iter = keySet.iterator();
		
			int count = 0;
			while(iter.hasNext()) {
				count++;
				String name = iter.next();
				Phone p = phone_map.get(name);	// 전화번호 클래스 추출
				System.out.println(p.getName() + "\t" + p.getPhone_number() + "\t" + p.getAddress());
			}
		}
		System.out.println("==============================");
	}
}


public class Ex33 {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.MenuUpdate();
	}
	
}
