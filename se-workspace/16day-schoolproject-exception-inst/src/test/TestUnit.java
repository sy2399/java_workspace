package test;

import school.DuplicateTelException;
import school.Employee;
import school.Person;
import school.PersonNotFoundException;
import school.SchoolService;
import school.Student;
import school.Teacher;

public class TestUnit {
	 public static void main(String[] args) {
		  SchoolService service = new SchoolService();
		  try {
		   service.addPerson(new Student("011", "��ƶ�", "�Ǳ�", "14"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.addPerson(new Teacher("016", "����ȣ", "����", "����"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.addPerson(new Employee("017", "�̰��", "�Ǳ�", "�ѹ�"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.addPerson(new Teacher("016", "�߽ż�", "�Ǳ�", "����"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  service.printAll(); 
		  System.out.println("****************step1:add �Ϸ�****************");
		  try {
		   Person rp = service.findPersonByTel("017");
		   System.out.println(rp);
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   Person rp = service.findPersonByTel("010");
		   System.out.println(rp);
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  System.out.println("****************step2:find �Ϸ�****************");  
		  try {
		   service.updatePerson(new Student("016", "�̴�ȣ", "�Ǳ�", "13"));
		   System.out.println(service.findPersonByTel("016"));
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.updatePerson(new Student("010", "������", "�Ǳ�", "13"));
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  System.out.println("****************step3:update �Ϸ�****************");
		  try {
		   service.deletePersonByTel("016");
		   System.out.println("���� ok");
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.deletePersonByTel("010");
		   System.out.println("���� ok");
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  service.printAll();  
		  System.out.println("****************step4:delete �Ϸ�****************"); 
		  }
}


