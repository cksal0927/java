package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	
	private Connection conn;  // ������ ���̽� ���� ������ü�� ������ ����
	private Statement st;  // sql���� �����Ͽ� ������ ���̽��� ��ȣ�ۿ��� ���� ����
	private ResultSet rs;  // ������ ���̽� select(��ȸ) ����� �ޱ� ���� ����
	private PreparedStatement pt;

	Dao(){
		DriverInit();
		Connect();
	}
	
	// mySQL�� java���α׷��� ������ driver �ε�
	private void DriverInit() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
	}
	
	// mySQL�� ���� ����
	private void Connect() {
		String user = "chanmi";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/chanmi";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println("������ ���̽� ���� ����");
		}
	}
	
	public void insert(Member m) {
		String sql = "insert into test_member(name, kor, eng, mat, total, std_avg) values(?, ?, ?, ?, ?, ?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, m.getName());
			pt.setInt(2, m.getKor());
			pt.setInt(3, m.getEng());
			pt.setInt(4, m.getMat());
			pt.setInt(5, m.getTotal());
			pt.setInt(6, m.getStd_avg());
			pt.executeUpdate();
		}catch(Exception e) {
			System.out.println("������ ���� ����");
		}
		
//		String sql = "insert into test_member(name,kor,eng,mat,total,"+ "std_avg) value('"+m.getName()+"',"+m.getKor()+","+
//				m.getEng()+","+m.getMat()+","+m.getTotal()+","+m.getStd_avg()+")";
//		
//		try {
//			st = conn.createStatement();  // sql���� ������ ���� Statement��ü ����
//			st.executeUpdate(sql);  // sql���� ������ ���̽��� ����
//		}catch(Exception e) {
//			System.out.println("������ ���� ����");
//		}
	}
	
	public Member[] select() {
		Member[] list = null;
		
		String sql = "select count(*) as cnt from test_member";
		
		try {
			int size=0;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				size = rs.getInt("cnt");  // ������ ���̽��� ������(���ڵ�)�� �� �� ��?
			}
			if(size != 0) {
				list = new Member[size];  // ��ü�� ����� �� �ƴ�, ���������� ���� ����
				int i=0;
				sql = "select * from test_member";  // ��ü ������ ��ȸ ������ (sql ���ǹ�)
				rs = st.executeQuery(sql);  // ��ȸ��� �ޱ�
				
				while(rs.next()) {  // ��ȸ��� �ϳ��� ��ȸ
					list[i] = new Member(rs.getInt("member_id"), rs.getString("name"), rs.getInt("kor"),
							rs.getInt("eng"), rs.getInt("mat"), rs.getInt("total"), rs.getInt("std_avg"));
					i++;  // �迭�� ���� �ε��� ǥ���� ���� 1 ����
				}
			}
		}catch(Exception e) {
			System.out.println("������ ��ȸ ����");
		}
		
		return list;
	}
	
}
