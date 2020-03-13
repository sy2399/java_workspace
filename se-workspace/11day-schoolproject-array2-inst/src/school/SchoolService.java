package school;

import school.Person;

public class SchoolService {
	//학교 구성원 정보를 저장하는 배열 
	private Person[] personList;
	// 현재 인원수 
	private int index; 
	public SchoolService(int length) {
		personList=new Person[length];
	}
	/*	personList 배열 요소에 구성원 객체(학생,교사,직원)
	 * 를 추가하는 메서드 
	 * 부모 타입의 매개변수를 선언하여 다양한 객체를 처리.
	 * 1. 매개변수로 전달되는 객체를 배열 요소로 추가
	 * 2. 현 구성원 수 ( index ) 를 하나 증가 시킨다 
	 * 
	 * 추가 구현 사항 :  동일한 tel 체크 ( 중복확인 ) 
	 * 						  정원 초과 체크 
	 */
	public void addPerson(Person p){
	if(index==personList.length){
		System.out.println("정원초과!");
	}else{			
			if(findPersonByTel(p.getTel())==null) // tel 이 중복되지 않으면 추가 
				personList[index++]=p;		
			else
				System.out.println(p.getTel()+"번호가 존재하여 추가 불가! ");
	}
	}
	public void printAll(){
		for(int i=0;i<index;i++)		
			System.out.println(personList[i]);
	}
	/*	매개변수 tel에 전달되는 정보와 일치하는
	 *  배열 요소를 검색해 그 요소 정보를 반환하는 메서드
	 *  1. 현재 존재하는 구성원 수 만큼 반복문을 수행한다
	 *  2. 반복문을 수행하면서 tel 을 비교한다 
	 *  3.  일치하는 요소가 있으면 그 요소 객체를 반환하고
	 *      없으면 null을 반환한다 
	 */
	public Person findPersonByTel(String tel){
		Person p=null;
		for(int i=0;i<index;i++){
			if(tel.equals(personList[i].getTel())){
				p=personList[i];
				break;
			}
		}
		return p;
	}
	/*  매개변수로 전달되는 객체의 tel이 
	 *  배열 요소의 tel과 일치하면 
	 *  배열 요소로 저장된 객체를 매개변수로 전달된 객체로 
	 *  할당( 즉 수정)하는 메서드 
	 *  1. 배열 요소의 개수만큼 반복문을 수행하면서 
	 *  2. 배열 요소의 tel과 매개변수로 전달된 tel을 비교하여 
	 *     일치하면 
	 *  3. 매개변수의 객체 참조값으로 배열 요소의 참조값을 
	 *      할당한다 
	 *  4. 만약 배열요소 tel 과 매개변수 객체 tel 이 일치하는 
	 *      것이 없다면 메세지를 남긴다 
	 */
	public void updatePerson(Person p){
		boolean flag=false;
		for(int i=0;i<index;i++){
			if(p.getTel().equals(personList[i].getTel())){
				flag=true;
				personList[i]=p;
				break;
			}
		}
		if(flag==false)
			System.out.println(p.getTel()+"번호를 가진 구성원이 없으므로 수정불가! ");
	}
	/*
	 * 매개변수 tel과 배열요소의 tel 이 일치하면 
	 * 해당 배열요소를 삭제하는 메서드 
	 * 1. 배열 요소수(index) 만큼 반복하면서 
	 *     매개변수 tel 과 배열요소의 tel이 일치하는 지를 확인한다
	 * 2. 일치하는 요소가 있으면 
	 *     그 요소의 위치에서부터 반복하면서 
	 *     요소 = 요소+1 
	 *     형식으로 순차적으로 뒤의 요소를 앞으로 할당한다 
	 *     만약 배열의 length 와 요소+1 한 값이 동일하다면 
	 *     배열 사이즈만큼 모든 요소가 할당되어 있다는 의미이므로
	 *     null을 할당한다 
	 */
	public void deletePersonByTel(String tel) {
		for(int i=0;i<index;i++){
			if(tel.equals(personList[i].getTel())){
				for(int j=i;j<index;j++){					
					if(j+1==personList.length){
						personList[j]=null;
					}else{
						personList[j]=personList[j+1];
					}
				}//for
				index--; //삭제했으므로 구성원수를 감소시킨다 
			}//if			
		}//for		
	}//method
}





























