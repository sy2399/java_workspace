package step8;

public class TestHasA3 {
	public static void main(String[] args) {
		Hotel h=new Hotel("��2�Ե�ȣ��",
				new SweetRoom("101ȣ",2000));
		System.out.println(h.getName());//��2�Ե�ȣ��
		System.out.println(h.getSweetRoom().getNumber());//101ȣ
		System.out.println(h.getSweetRoom().getPrice());//2000
	}
}





