package han.ica.oose.Abonnement;


import han.ica.oose.JDBC.JDBCConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Sebastiaan Steenbrink : 17-10-2016.
 */
public class AbonnementDAO {

    private Connection connection;
    private Statement statement;

    public AbonnementDAO() {

    }

    public Abonnement FindByAbonnee(int id) {
        String query = String.format("SELECT * FROM Abonnement WHERE Abonnement.abonnee = %1$s", id);

        ResultSet rs = null;
        Abonnement result = null;

        try {
            connection = JDBCConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            rs.next();
            result = new Abonnement();
            result.id = rs.getInt("id");
            result.abonnee = rs.getInt("abonnee");
            result.startdatum = rs.getDate("startdatum");
            result.verdubbeld = rs.getBoolean("verdubbeld");
            result.status = rs.getInt("status");
            result.soort = rs.getInt("soort");
        } catch (Exception ec) {
            System.out.println(ec.getMessage());
        } finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { statement.close(); } catch (Exception e) { /* ignored */ }
            try { connection.close(); } catch (Exception e) { /* ignored */ }
        }
        return result;
    }
}
