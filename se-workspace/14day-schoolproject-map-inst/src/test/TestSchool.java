package test;

import school.Employee;
import school.Person;
import school.SchoolService;
import school.Student;
import school.Teacher;

public class TestSchool { 
 public static void main(String[] args) {

  Student p1 = new Student("011", "������", "�Ǳ�", "13");
  Teacher p2 = new Teacher("016", "�̰��", "����", "����");
  Employee p3 = new Employee("017", "��ȣ��", "����", "������");
  SchoolService service=new SchoolService();
 service.addPerson(p1);
  service.addPerson(p2);
  service.addPerson(p3);
  service.addPerson(new Student("019","õ����","����","14"));
  System.out.println("**********step1.������ ��� �� printAll()**********");
  service.printAll();// ��ü ���� ��� 
 
  
  System.out.println("**********step2.������ ���� �˻�**********");
  Person rp=service.findPersonByTel("017");
  System.out.println(rp);//tel=017 name=��ȣ��, address=���� dept=������
  rp=service.findPersonByTel("018");
  System.out.println(rp);//null
   
  
  System.out.println("**********step3.���� tel ��Ͻ� �߰��Ұ�**********");
  service.addPerson(new Employee("019","������","����","����"));
  // 019 ��ȣ�� �����Ͽ� �߰� �Ұ�! 
  service.printAll(); // ������ ���� 4���� ��� 
 
  
   System.out.println("**********step4.������ ���� ����**********");
  service.updatePerson(new Employee("019","������","����","����"));
  Person up=service.findPersonByTel("019");
  System.out.println(up);//tel=019 name=������, address=����, dept=����
  //�������� �ʴ� 010 ��ü�� �����ϸ� 
  // 010 ��ȣ�� ���� �������� �����Ƿ� �����Ұ�! 
   service.updatePerson(new Teacher("010","�鸸����","������","����"));
  up=service.findPersonByTel("010");
  System.out.println(up);//null

 System.out.println("**********step5.������ ������**********");
  service.printAll(); //4�� ��� 
  service.deletePersonByTel("017");  
  System.out.println("**********step5.������ ������**********");
  service.printAll();//3�� ��� 017 ��� ���� 
  /* */   }
}
/* �Ʒ��� ��������
 **********step1.������ ��� �� printAll()**********
tel=011, name=������, address=�Ǳ� stuId:13
tel=016, name=�̰��, address=���� subject:����
tel=017, name=��ȣ��, address=���� dept:������
tel=019, name=õ����, address=���� stuId:14
**********step2.������ ���� �˻�**********
tel=017, name=��ȣ��, address=���� dept:������
null
**********step3.���� tel ��Ͻ� �߰��Ұ�**********
019��ȣ�� �����Ͽ� �߰� �Ұ�!
tel=011, name=������, address=�Ǳ� stuId:13
tel=016, name=�̰��, address=���� subject:����
tel=017, name=��ȣ��, address=���� dept:������
tel=019, name=õ����, address=���� stuId:14
**********step4.������ ���� ����**********
tel=019, name=������, address=���� dept:����
010��ȣ�� ���� �������� �����Ƿ� �����Ұ�! 
null
**********step5.������ ������**********
tel=011, name=������, address=�Ǳ� stuId:13
tel=016, name=�̰��, address=���� subject:����
tel=017, name=��ȣ��, address=���� dept:������
tel=019, name=������, address=���� dept:����
**********step5.������ ������**********
tel=011, name=������, address=�Ǳ� stuId:13
tel=016, name=�̰��, address=���� subject:����
tel=019, name=������, address=���� dept:����
  
 */
 