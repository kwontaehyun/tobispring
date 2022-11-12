package springprj;

import java.sql.SQLException;

public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");
		
		dao.add(user);
		
		System.out.println(user.getId() +  "등록 성공");
		
		User user2 =dao.get(user.getId());
//		System.out.println(user2.getName());
//		System.out.println(user2.getPassword());
//		System.out.println(user2.getId() +  "조회 성공");
		
		if(!user.getName().equals(user2.getName())) {
			System.out.println("테스트실패(name)");
		}else if(!user.getPassword().equals(user2.getPassword())) {
			System.out.println("테스트 실패(password)");
		}else {
			 System.out.println("조회 테스트 성공");
		}
	}
	
}
