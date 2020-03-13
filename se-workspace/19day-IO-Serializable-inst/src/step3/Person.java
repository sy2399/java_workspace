package step3;

import java.io.Serializable;
/*
 * Person Ŭ������ ������ ��ü�� ����ȭ�Ǿ� �ܺο� ����(���)�Ǳ�
 * ���ؼ��� �ݵ�� Serializable �������̽��� implments �ؾ� �Ѵ� 
 */

public class Person implements Serializable{	
	/**
	 * ���� Ŭ������ ������� �Ǵ� �޼��� ������ ����Ǵ���
	 * ������ȭ �����ϵ��� ��������� serialVersionUID ���� 
	 * �Ҵ��Ѵ� 
	 */
	private static final long serialVersionUID = 1176114819554034463L;
	private String name;
	private String address;
	//transient ����ȭ ��󿡼� ���ܽ�Ų��
	private transient String password;
	public Person(String name, String address,String password) {
		super();
		this.name = name;
		this.address = address;
		this.password=password;
	}	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	public void test(){}
}






