package step4; // package : 디렉토리별 분류 

public class Car { // class : 객체 생성 
	private String model; // instance variable 객체 속성 정보 저장  
	//constructor 객체 생성시 필요한 초기 작업 수행 
	public Car(String model){//model   -> local variable 
		this.model=model; // 전달받은 정보를 객체 속성에 저장 
	}
	public String getModel(){// method getter 정보 반환 
		return model;
	}
	public void setModel(String model){//method setter 정보 할당
		this.model=model;
	}
}







