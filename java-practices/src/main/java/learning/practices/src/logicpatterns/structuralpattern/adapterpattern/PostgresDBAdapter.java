package learning.practices.src.logicpatterns.structuralpattern.adapterpattern;

public class PostgresDBAdapter implements DBConnection{

	private PostgresDB postgresDB;
	
	public PostgresDBAdapter(PostgresDB postgresDB) {
		this.postgresDB  = postgresDB;
	}
	@Override
	public void connect(String url, String username, String password) {
		postgresDB.startSession(url, username, password);
		
	}

	@Override
	public void query(String sql) {
		postgresDB.executeSql(sql);
		
	}

}
