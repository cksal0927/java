package java_thread3;

public class BankTh implements Runnable {
	
	Money my = new Money();
	
	@Override
	public void run() {
		while(my.getMyMoney() > 0) {
			// ��� �ݾ�
			int money = (int)(Math.random()*3)+1*1000;
			if(my.withdraw(money)) {
				System.out.println(Thread.currentThread().getName() +
						" -> ��� : " + money + ", �ܾ� : " + my.getMyMoney());
			}else {  // ��� ���� - �ܾ� ����
				System.out.println("��� �ź� - �ܾ� ����");
			}
		}
	}

}