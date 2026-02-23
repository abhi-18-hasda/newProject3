package learning.practices.src.logicpatterns.structuralpattern.adapterpattern;

public class AdapterPattern {
	public static void main(String args[]) {
		DBConnection connection = new OracleDBAdapter(new OracleDB());
		connection.connect("url", "username", "password");
		connection.query("Query is execute for oracle");
		DBConnection connection2 = new PostgresDBAdapter(new PostgresDB());
		connection2.connect("url", "username", "password");
		connection2.query("Query is execute for postgres");
	}
}
