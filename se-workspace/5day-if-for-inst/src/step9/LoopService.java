package step9;

public class LoopService {
	public void printInfo(String item, int count) {		
		for(int i=1;i<=count;i++){
			System.out.println(item+" "+i+"ÀÜ");
		}
	}
	public void printInfoLimit(String item,int count, int limit) {	
		for(int i=1;i<=count;i++){			
			System.out.println(item+" "+i+"ÀÜ");
			if(limit==i){
				break;
			}//if
		}//for
	}//method
}//class





