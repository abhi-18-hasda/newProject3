package learning.practices.src.logicpatterns.structuralpattern.adapterpattern;

public class OracleDBAdapter implements DBConnection {

	private OracleDB oracleDB;

	public OracleDBAdapter(OracleDB oracleDB) {
		this.oracleDB = oracleDB;
	}

	@Override
	public void connect(String url, String username, String password) {
		oracleDB.openConnection(url, username, password);
	}

	@Override
	public void query(String sql) {
		oracleDB.runQuery(sql);

	}

}
