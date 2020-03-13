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
		   service.addPerson(new Student("011", "고아라", "판교", "14"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.addPerson(new Teacher("016", "박찬호", "강남", "국어"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.addPerson(new Employee("017", "이경규", "판교", "총무"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.addPerson(new Teacher("016", "추신수", "판교", "수학"));
		  } catch (DuplicateTelException e) {
		   System.out.println(e.getMessage());
		  }
		  service.printAll(); 
		  System.out.println("****************step1:add 완료****************");
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
		  System.out.println("****************step2:find 완료****************");  
		  try {
		   service.updatePerson(new Student("016", "이대호", "판교", "13"));
		   System.out.println(service.findPersonByTel("016"));
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.updatePerson(new Student("010", "구혜선", "판교", "13"));
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  System.out.println("****************step3:update 완료****************");
		  try {
		   service.deletePersonByTel("016");
		   System.out.println("삭제 ok");
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  try {
		   service.deletePersonByTel("010");
		   System.out.println("삭제 ok");
		  } catch (PersonNotFoundException e) {
		   System.out.println(e.getMessage());
		  }
		  service.printAll();  
		  System.out.println("****************step4:delete 완료****************"); 
		  }
}


