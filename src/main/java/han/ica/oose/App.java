package han.ica.oose;

import han.ica.oose.Abonnement.Abonnement;
import han.ica.oose.Abonnement.AbonnementDAO;
import han.ica.oose.JDBC.JDBCConnectionFactory;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i = 0;
        while(i < 1) {
            System.out.println("hi");
            AbonnementDAO dao = new AbonnementDAO();
            Abonnement result = dao.FindByAbonnee(1);
            System.out.println(result.id + " " + result.abonnee + " " + result.startdatum + " " + result.soort + " " + result.status);
            i++;
        }
    }
}
