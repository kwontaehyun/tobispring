package springprj;

import java.sql.SQLException;

public class userDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new DaoFactory().userDao();
	}

}
