package term2.daos.lesson7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
	private static Connection connection;

	public static void main(String[] args) {
		String navn = args[0];
//		getSkuespillereManuelt();
		findAlderPåSkueSpiller(navn);
	}

	public static int findAlderPåSkueSpiller(String navn) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-V4KATAQU:1433;instanceName=SQLEXPRESS;databaseName=filmDB;user=sa;password=3emerfili1743;");
			CallableStatement stm = connection.prepareCall("{call BeregnSkuespillerAlder(?, ?)}");
			stm.setString(1, navn);

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return 0;
	}

	public static void getSkuespillereManuelt() {
		try {
			List<Skuespiller> skuespillere = new ArrayList<>();
			connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-V4KATAQU:1433;instanceName=SQLEXPRESS;databaseName=filmDB;user=sa;password=3emerfili1743;");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select fødselsÅr " +
					"from Skuespiller S");
			while (resultSet.next()) {
				int foedselsAar = Integer.parseInt(resultSet.getString("fødselsÅr"));
				skuespillere.add(new Skuespiller(null, foedselsAar));
			}

			System.out.println(skuespillere);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
