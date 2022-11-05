package springprj;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
	
	// TODO D사의 독자적인 방법으로 Connection을 생성하는 코드
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		
		return null;
	}

}
