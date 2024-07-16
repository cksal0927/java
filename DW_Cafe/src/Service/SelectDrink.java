package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeeDAO;
import DAO.TeaDAO;
import DTO.Coffee;
import DTO.Tea;

public class SelectDrink implements Kiosk{
	
	private HashMap<Integer, Coffee> coffee;
	private HashMap<Integer, Tea> tea;
	
	public SelectDrink() {
		
	}

	@Override
	public void action() {
	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Ŀ�� 2.Ƽ : ");
			int category = scan.nextInt();
		
			switch(category) {
				case 0 : System.out.println("������ ������"); return;
				case 1 : selectCoffee(); break;
				case 2 : selectTea(); break;
				default : System.out.println("�ٽ� �Է��ϼ���");
			}
		}  // while(true) ��ȣ end
	}
	
	// Ŀ�� ����
	private void selectCoffee() {
		CoffeeDAO dao = new CoffeeDAO();
		coffee = dao.findAll();
		
		Set<Integer> ids = coffee.keySet();
		for(Integer id : ids) {
			System.out.println(id + ". " + coffee.get(id));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴� ���� : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(coffee.get(menu));
		order.action();
	}

	// Ƽ ����
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
		Set<Integer> its = tea.keySet();
		for(Integer it: its) {
			System.out.println(it + ". " + tea.get(it));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴� ���� : ");
		int menu = sc.nextInt();
		
		// if(tea.get(menu) == null) return;
		if(!tea.containsKey(menu)) return;
		
		Kiosk order = new Order(tea.get(menu));
		order.action();
	}	

}