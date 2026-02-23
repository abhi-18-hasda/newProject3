package learning.practices.src.logicpatterns.structuralpattern.adapterpattern;

public interface DBConnection {
	void connect(String url, String username, String password);
	void query(String sql);
}
