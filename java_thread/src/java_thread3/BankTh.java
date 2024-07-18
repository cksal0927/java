package java_thread3;

public class BankTh implements Runnable {
	
	Money my = new Money();
	
	@Override
	public void run() {
		while(my.getMyMoney() > 0) {
			// 출금 금액
			int money = (int)(Math.random()*3)+1*1000;
			if(my.withdraw(money)) {
				System.out.println(Thread.currentThread().getName() +
						" -> 출금 : " + money + ", 잔액 : " + my.getMyMoney());
			}else {  // 출금 실패 - 잔액 부족
				System.out.println("출금 거부 - 잔액 부족");
			}
		}
	}

}
