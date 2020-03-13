package school;

import school.Person;

public class SchoolService {
	//�б� ������ ������ �����ϴ� �迭 
	private Person[] personList;
	// ���� �ο��� 
	private int index; 
	public SchoolService(int length) {
		personList=new Person[length];
	}
	/*	personList �迭 ��ҿ� ������ ��ü(�л�,����,����)
	 * �� �߰��ϴ� �޼��� 
	 * �θ� Ÿ���� �Ű������� �����Ͽ� �پ��� ��ü�� ó��.
	 * 1. �Ű������� ���޵Ǵ� ��ü�� �迭 ��ҷ� �߰�
	 * 2. �� ������ �� ( index ) �� �ϳ� ���� ��Ų�� 
	 * 
	 * �߰� ���� ���� :  ������ tel üũ ( �ߺ�Ȯ�� ) 
	 * 						  ���� �ʰ� üũ 
	 */
	public void addPerson(Person p){
	if(index==personList.length){
		System.out.println("�����ʰ�!");
	}else{			
			if(findPersonByTel(p.getTel())==null) // tel �� �ߺ����� ������ �߰� 
				personList[index++]=p;		
			else
				System.out.println(p.getTel()+"��ȣ�� �����Ͽ� �߰� �Ұ�! ");
	}
	}
	public void printAll(){
		for(int i=0;i<index;i++)		
			System.out.println(personList[i]);
	}
	/*	�Ű����� tel�� ���޵Ǵ� ������ ��ġ�ϴ�
	 *  �迭 ��Ҹ� �˻��� �� ��� ������ ��ȯ�ϴ� �޼���
	 *  1. ���� �����ϴ� ������ �� ��ŭ �ݺ����� �����Ѵ�
	 *  2. �ݺ����� �����ϸ鼭 tel �� ���Ѵ� 
	 *  3.  ��ġ�ϴ� ��Ұ� ������ �� ��� ��ü�� ��ȯ�ϰ�
	 *      ������ null�� ��ȯ�Ѵ� 
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
	/*  �Ű������� ���޵Ǵ� ��ü�� tel�� 
	 *  �迭 ����� tel�� ��ġ�ϸ� 
	 *  �迭 ��ҷ� ����� ��ü�� �Ű������� ���޵� ��ü�� 
	 *  �Ҵ�( �� ����)�ϴ� �޼��� 
	 *  1. �迭 ����� ������ŭ �ݺ����� �����ϸ鼭 
	 *  2. �迭 ����� tel�� �Ű������� ���޵� tel�� ���Ͽ� 
	 *     ��ġ�ϸ� 
	 *  3. �Ű������� ��ü ���������� �迭 ����� �������� 
	 *      �Ҵ��Ѵ� 
	 *  4. ���� �迭��� tel �� �Ű����� ��ü tel �� ��ġ�ϴ� 
	 *      ���� ���ٸ� �޼����� ����� 
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
			System.out.println(p.getTel()+"��ȣ�� ���� �������� �����Ƿ� �����Ұ�! ");
	}
	/*
	 * �Ű����� tel�� �迭����� tel �� ��ġ�ϸ� 
	 * �ش� �迭��Ҹ� �����ϴ� �޼��� 
	 * 1. �迭 ��Ҽ�(index) ��ŭ �ݺ��ϸ鼭 
	 *     �Ű����� tel �� �迭����� tel�� ��ġ�ϴ� ���� Ȯ���Ѵ�
	 * 2. ��ġ�ϴ� ��Ұ� ������ 
	 *     �� ����� ��ġ�������� �ݺ��ϸ鼭 
	 *     ��� = ���+1 
	 *     �������� ���������� ���� ��Ҹ� ������ �Ҵ��Ѵ� 
	 *     ���� �迭�� length �� ���+1 �� ���� �����ϴٸ� 
	 *     �迭 �����ŭ ��� ��Ұ� �Ҵ�Ǿ� �ִٴ� �ǹ��̹Ƿ�
	 *     null�� �Ҵ��Ѵ� 
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
				index--; //���������Ƿ� ���������� ���ҽ�Ų�� 
			}//if			
		}//for		
	}//method
}





























