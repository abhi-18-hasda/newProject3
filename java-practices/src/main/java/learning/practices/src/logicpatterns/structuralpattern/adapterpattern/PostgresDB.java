package learning.practices.src.logicpatterns.structuralpattern.adapterpattern;

public class PostgresDB {
	void startSession(String url, String username, String password) {
		System.out.println("Oracle DB connection");
	}

	void executeSql(String sql) {
		System.out.println("Postgres DB Run Query");
	}
}
