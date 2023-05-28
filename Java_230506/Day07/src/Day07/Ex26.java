package Day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//Map 자료구조를 이용하여, 로그인 프로그램 구현
//사람에 대한 정보는 클래스로 제공
//Map은 아이디와 비밀번호 순으로 표현
//아이디와 비밀번호에 대한 생성 기능, 로그인 기능을 구현
//프로그램이 실행되면 아이디 생성 / 로그인 / 종료 중 선택이 가능하며, 각각의 기능을 구현
//로그인 했을 경우, 비밀번호 변경 / 로그아웃 기능에 대한 안내가 추가

//scanner에서 자연스럽게 넘어가는 부분이 있는거 하면, 사전작업이 미리 처리되서 진행되는 경우 발생
//해결방법 : 다음줄에 nextLine() 입력

class Person {
	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class Ex26 {

	public static void main(String[] args) {
		
		Map<String, Person> login = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 생성 / 로그인 / 종료");
			String choice = sc.nextLine();
			
			if(choice.equals("종료")) {
				break;
			}
			
			if(choice.equals("아이디 생성")) {
				System.out.println("사용할 아이디입력 : ");
				String id = sc.nextLine();
				
				if(login.containsKey(id)) {
					System.out.println("이미 등록된 아이디 입니다.");
				} else{
					System.out.println("비밀번호를 입력하세요");
					
				}
			}
			
			
		}
		
		
		
		
		
	}
}


//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//class Person {
//    private String id;
//    private String password;
//
//    public Person(String id, String password) {
//        this.id = id;
//        this.password = password;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
//
//public class Ex26 {
//
//    public static void main(String[] args) {
//
//        Map<String, Person> loginInfo = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("아이디, 생성 / 로그인 / 종료 중 선택하세요: ");
//            String choice = scanner.nextLine();
//
//            if (choice.equals("종료")) {
//                break;
//            }
//
//            if (choice.equals("아이디 생성")) {
//                System.out.print("아이디를 입력하세요: ");
//                String id = scanner.nextLine();
//
//                if (loginInfo.containsKey(id)) {
//                    System.out.println("이미 존재하는 아이디입니다.");
//                } else {
//                    System.out.print("비밀번호를 입력하세요: ");
//                    String password = scanner.nextLine();
//                    Person person = new Person(id, password);
//                    loginInfo.put(id, person);
//                    System.out.println("아이디 생성 완료");
//                }
//            }
//
//            if (choice.equals("로그인")) {
//                System.out.print("아이디를 입력하세요: ");
//                String id = scanner.nextLine();
//
//                if (loginInfo.containsKey(id)) {
//                    System.out.print("비밀번호를 입력하세요: ");
//                    String password = scanner.nextLine();
//                    Person person = loginInfo.get(id);
//
//                    if (person.getPassword().equals(password)) {
//                        System.out.println("로그인 성공!");
//
//                        while (true) {
//                            System.out.println("비밀번호 변경 / 로그아웃 중 선택하세요: ");
//                            String option = scanner.nextLine();
//
//                            if (option.equals("로그아웃")) {
//                                break;
//                            }
//
//                            if (option.equals("비밀번호 변경")) {
//                                System.out.print("새로운 비밀번호를 입력하세요: ");
//                                String newPassword = scanner.nextLine();
//                                person.setPassword(newPassword);
//                                System.out.println("비밀번호 변경 완료");
//                            }
//                        }
//                    } else {
//                        System.out.println("비밀번호가 일치하지 않습니다.");
//                    }
//                } else {
//                    System.out.println("존재하지 않는 아이디입니다.");
//                }
//            }
//        }
//
//        scanner.close();


