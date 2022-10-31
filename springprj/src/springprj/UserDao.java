package springprj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	
	//초난감 DAO
	
//	public void add(User user) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection c =DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
//		
//		PreparedStatement ps = c.prepareStatement("insert into user(id,name,password) values (?,?,?)");
//		ps.setString(1, user.getId());
//		ps.setString(2, user.getName());
//		ps.setString(3, user.getPassword());
//		
//		ps.executeUpdate();
//		
//		ps.close();
//		c.close();
//	}
//	
//	public User get(String id) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection c =DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
//		
//		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
//		
//		ps.setString(1, id);
//		
//		ResultSet rs = ps.executeQuery();
//		rs.next();
//		
//		User user = new User();
//		user.setId(rs.getString("id"));
//		user.setName(rs.getString("name"));
//		user.setPassword(rs.getString("password"));
//		
//		rs.close();
//		ps.close();
//		c.close();
//		
//		return user;
//	}
	
	// 템플릿 메소드 패턴
//	public void add(User user) throws ClassNotFoundException, SQLException {
//		Connection c = getConnection();
//		
//		PreparedStatement ps = c.prepareStatement("insert into user(id,name,password) values (?,?,?)");
//		ps.setString(1, user.getId());
//		ps.setString(2, user.getName());
//		ps.setString(3, user.getPassword());
//		
//		ps.executeUpdate();
//		
//		ps.close();
//		c.close();
//	}
//	
//	public User get(String id) throws ClassNotFoundException, SQLException {
//		Connection c = getConnection();
//		
//		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
//		
//		ps.setString(1, id);
//		
//		ResultSet rs = ps.executeQuery();
//		rs.next();
//		
//		User user = new User();
//		user.setId(rs.getString("id"));
//		user.setName(rs.getString("name"));
//		user.setPassword(rs.getString("password"));
//		
//		rs.close();
//		ps.close();
//		c.close();
//		
//		return user;
//	}
//	
//	private Connection getConnection() throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection c =DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
//		return c;
//	}
	
	private SimpleConnectionMaker simpleConnectionMaker;
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		Connection c = simpleConnectionMaker.makeNewConnection();
		
		PreparedStatement ps = c.prepareStatement("insert into user(id,name,password) values (?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		
		ps.close();
		c.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		Connection c = simpleConnectionMaker.makeNewConnection();
		
		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
		
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
	}
	
}
