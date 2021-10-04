package term2.daos;

import java.sql.*;

public class JDBC {
	public static void main(String[] args) {
		try {
			Connection connection;
			connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-V4KATAQU:1433;instanceName=SQLEXPRESS;databaseName=Tidsregistrering 2;user=sa;password=3emerfili1743;");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select medarbejderNr, navn, stillingsbetegnelse, mobil " +
					"from Medarbejder");

			while (resultSet.next()) {
				System.out.println("MedarbejderNr: " + resultSet.getString("medarbejderNr"));
				System.out.println("Navn: " + resultSet.getString("navn"));
				System.out.println("Stilling: " + resultSet.getString("stillingsbetegnelse"));
				System.out.println("Mobil: " + resultSet.getString("mobil"));
				System.out.println();
			}

			PreparedStatement preparedStatement = connection.prepareStatement("select mobil " +
					"from Medarbejder m " +
					"where m.navn = ?");

			preparedStatement.setString(1, "Jennifer Lawrence");

			ResultSet res = preparedStatement.executeQuery();
			while (res.next()) {
				System.out.println(res.getString("mobil"));
			}

			PreparedStatement preparedStatement1 = connection.prepareCall("call findMedarbejderNavnOgMobil(?)");
			preparedStatement1.setString(1, "1");
			ResultSet resultSet1 = preparedStatement1.executeQuery();
			while(resultSet1.next()) {
				System.out.println(resultSet1.getString(1));
			}
			resultSet.close();
			connection.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
