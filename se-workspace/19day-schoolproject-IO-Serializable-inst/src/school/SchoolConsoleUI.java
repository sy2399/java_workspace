package school;

import java.io.IOException;
import java.util.Scanner;

public class SchoolConsoleUI {
	private SchoolService service = new SchoolService();

	public void execute() throws ClassNotFoundException, IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("*******�л�������α׷��� �����մϴ�******");
		service.loadData();
		exit: 
		while (true) {
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			String str = s.nextLine();
			switch (str) {
			case "1":
				String tel, name, address, stuId, subject, dept = null;
				String type = null;
				while (true) {
					System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
					type = s.nextLine();// �л�, ������, ���� ������
					if (type.equals("1") || type.equals("2") || type.equals("3"))
						break;
					else
						System.out.println("�л�,������,���� �߿��� �����ϼ���!");					
				}
				Person p = null;
				while (true) {
					System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���!");
					tel = s.nextLine();
					int index = service.findIndexByTel(tel);
					if (index > -1)
						System.out.println("��ȭ��ȣ�� �ߺ��˴ϴ�.�ٽ� �Է��ϼ���!");
					else
						break;					
				}
				System.out.println("2. �̸��� �Է��ϼ���");
				name = s.nextLine();
				System.out.println("3. �ּҸ� �Է��ϼ���!");
				address = s.nextLine();
				switch (type) {
				case "1":
					System.out.println("4. �й��� �Է��ϼ���");
					stuId = s.nextLine();
					p = new Student(tel, name, address, stuId);
					break;
				case "2":
					System.out.println("4. ������ �Է��ϼ���");
					subject = s.nextLine();
					p = new Teacher(tel, name, address, subject);
					break;
				case "3":
					System.out.println("4. �μ��� �Է��ϼ���");
					dept = s.nextLine();
					p = new Employee(tel, name, address, dept);
					break;
				}
				try {
					service.addPerson(p);
					System.out.println("����Ʈ�� �߰�:" + p);
				} catch (DuplicateTelException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "2":
				System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
				try {
					String delTel = s.nextLine();
					service.deletePersonByTel(delTel);
					System.out.println(delTel + "�� �ش��ϴ� �������� �����Ͽ����ϴ�.");
				} catch (PersonNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "3":
				System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���");
				try {
					String findTel = s.nextLine();
					Person per = service.findPersonByTel(findTel);
					System.out.println("��ȸ���:" + per);
				} catch (PersonNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "4":
				System.out.println("**��ü����������**");
				service.printAll();
				break;
			case "5":
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				service.saveData();
				s.close();
				break exit;
			default:
				System.out.println("�߸��� �Է°��Դϴ�!!");
			}// switch
		} // while
	}
}





