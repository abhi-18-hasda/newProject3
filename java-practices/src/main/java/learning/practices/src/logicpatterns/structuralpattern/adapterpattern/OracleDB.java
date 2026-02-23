package learning.practices.src.logicpatterns.structuralpattern.adapterpattern;

public class OracleDB {
	void openConnection(String url, String username, String password) {
		System.out.println("Oracle DB Connection");
	}

	void runQuery(String sql) {
		System.out.println("Oracle DB Run Query");
	}

}
