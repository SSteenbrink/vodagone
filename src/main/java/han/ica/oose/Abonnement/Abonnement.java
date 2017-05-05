package han.ica.oose.Abonnement;

import han.ica.oose.Abonnee.Abonnee;

import java.util.Date;
import java.util.List;

/**
 * @author Sebastiaan Steenbrink : 17-10-2016.
 */
public class Abonnement {
    public int id;
    public int abonnee;
    public boolean verdubbeld;
    public Date startdatum;
    public int soort;
    public int status;
    public List<Abonnee> gedeeldmet;
}
