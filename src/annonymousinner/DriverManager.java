package annonymousinner;

public class DriverManager {
	static Connection getConnection() {
		Connection con = new Connection() {

			@Override
			public void createStatement() {

				System.out.println("Annonymous Inner classes method");
			}

		};

		return con;
	}

}
