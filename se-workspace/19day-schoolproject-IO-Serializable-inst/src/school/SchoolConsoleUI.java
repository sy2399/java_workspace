package school;

import java.io.IOException;
import java.util.Scanner;

public class SchoolConsoleUI {
	private SchoolService service = new SchoolService();

	public void execute() throws ClassNotFoundException, IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("*******학사관리프로그램을 시작합니다******");
		service.loadData();
		exit: 
		while (true) {
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String str = s.nextLine();
			switch (str) {
			case "1":
				String tel, name, address, stuId, subject, dept = null;
				String type = null;
				while (true) {
					System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
					type = s.nextLine();// 학생, 선생님, 직원 구분자
					if (type.equals("1") || type.equals("2") || type.equals("3"))
						break;
					else
						System.out.println("학생,선생님,직원 중에서 선택하세요!");					
				}
				Person p = null;
				while (true) {
					System.out.println("1. 전화번호를 입력하세요!");
					tel = s.nextLine();
					int index = service.findIndexByTel(tel);
					if (index > -1)
						System.out.println("전화번호가 중복됩니다.다시 입력하세요!");
					else
						break;					
				}
				System.out.println("2. 이름을 입력하세요");
				name = s.nextLine();
				System.out.println("3. 주소를 입력하세요!");
				address = s.nextLine();
				switch (type) {
				case "1":
					System.out.println("4. 학번을 입력하세요");
					stuId = s.nextLine();
					p = new Student(tel, name, address, stuId);
					break;
				case "2":
					System.out.println("4. 과목을 입력하세요");
					subject = s.nextLine();
					p = new Teacher(tel, name, address, subject);
					break;
				case "3":
					System.out.println("4. 부서를 입력하세요");
					dept = s.nextLine();
					p = new Employee(tel, name, address, dept);
					break;
				}
				try {
					service.addPerson(p);
					System.out.println("리스트에 추가:" + p);
				} catch (DuplicateTelException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "2":
				System.out.println("삭제할 구성원의 전화번호를 입력하세요");
				try {
					String delTel = s.nextLine();
					service.deletePersonByTel(delTel);
					System.out.println(delTel + "에 해당하는 구성원을 삭제하였습니다.");
				} catch (PersonNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "3":
				System.out.println("조회할 구성원의 전화번호를 입력하세요");
				try {
					String findTel = s.nextLine();
					Person per = service.findPersonByTel(findTel);
					System.out.println("조회결과:" + per);
				} catch (PersonNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "4":
				System.out.println("**전체구성원보기**");
				service.printAll();
				break;
			case "5":
				System.out.println("*******학사관리프로그램을 종료합니다******");
				service.saveData();
				s.close();
				break exit;
			default:
				System.out.println("잘못된 입력값입니다!!");
			}// switch
		} // while
	}
}





