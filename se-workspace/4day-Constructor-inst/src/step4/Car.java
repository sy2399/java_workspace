package step4; // package : ���丮�� �з� 

public class Car { // class : ��ü ���� 
	private String model; // instance variable ��ü �Ӽ� ���� ����  
	//constructor ��ü ������ �ʿ��� �ʱ� �۾� ���� 
	public Car(String model){//model   -> local variable 
		this.model=model; // ���޹��� ������ ��ü �Ӽ��� ���� 
	}
	public String getModel(){// method getter ���� ��ȯ 
		return model;
	}
	public void setModel(String model){//method setter ���� �Ҵ�
		this.model=model;
	}
}







