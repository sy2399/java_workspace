package test;

import school.Employee;
import school.Person;
import school.SchoolService;
import school.Student;
import school.Teacher;

public class TestSchool { 
 public static void main(String[] args) {

  Student p1 = new Student("011", "아이유", "판교", "13");
  Teacher p2 = new Teacher("016", "이경규", "종로", "국어");
  Employee p3 = new Employee("017", "강호동", "마포", "관리부");
  SchoolService service=new SchoolService();
 service.addPerson(p1);
  service.addPerson(p2);
  service.addPerson(p3);
  service.addPerson(new Student("019","천송이","강남","14"));
  System.out.println("**********step1.구성원 등록 후 printAll()**********");
  service.printAll();// 전체 정보 출력 
 
  
  System.out.println("**********step2.구성원 정보 검색**********");
  Person rp=service.findPersonByTel("017");
  System.out.println(rp);//tel=017 name=강호동, address=마포 dept=관리부
  rp=service.findPersonByTel("018");
  System.out.println(rp);//null
   
  
  System.out.println("**********step3.동일 tel 등록시 추가불가**********");
  service.addPerson(new Employee("019","만송이","강남","영업"));
  // 019 번호가 존재하여 추가 불가! 
  service.printAll(); // 여전히 기존 4명이 출력 
 
  
   System.out.println("**********step4.구성원 정보 수정**********");
  service.updatePerson(new Employee("019","만송이","강남","영업"));
  Person up=service.findPersonByTel("019");
  System.out.println(up);//tel=019 name=만송이, address=강남, dept=영업
  //존재하지 않는 010 객체를 전달하면 
  // 010 번호를 가진 구성원이 없으므로 수정불가! 
   service.updatePerson(new Teacher("010","백만송이","영등포","수학"));
  up=service.findPersonByTel("010");
  System.out.println(up);//null

 System.out.println("**********step5.구성원 삭제전**********");
  service.printAll(); //4명 출력 
  service.deletePersonByTel("017");  
  System.out.println("**********step5.구성원 삭제후**********");
  service.printAll();//3명 출력 017 요소 삭제 
  /* */   }
}
/* 아래는 실행결과임
 **********step1.구성원 등록 후 printAll()**********
tel=011, name=아이유, address=판교 stuId:13
tel=016, name=이경규, address=종로 subject:국어
tel=017, name=강호동, address=마포 dept:관리부
tel=019, name=천송이, address=강남 stuId:14
**********step2.구성원 정보 검색**********
tel=017, name=강호동, address=마포 dept:관리부
null
**********step3.동일 tel 등록시 추가불가**********
019번호가 존재하여 추가 불가!
tel=011, name=아이유, address=판교 stuId:13
tel=016, name=이경규, address=종로 subject:국어
tel=017, name=강호동, address=마포 dept:관리부
tel=019, name=천송이, address=강남 stuId:14
**********step4.구성원 정보 수정**********
tel=019, name=만송이, address=강남 dept:영업
010번호를 가진 구성원이 없으므로 수정불가! 
null
**********step5.구성원 삭제전**********
tel=011, name=아이유, address=판교 stuId:13
tel=016, name=이경규, address=종로 subject:국어
tel=017, name=강호동, address=마포 dept:관리부
tel=019, name=만송이, address=강남 dept:영업
**********step5.구성원 삭제후**********
tel=011, name=아이유, address=판교 stuId:13
tel=016, name=이경규, address=종로 subject:국어
tel=019, name=만송이, address=강남 dept:영업
  
 */
 