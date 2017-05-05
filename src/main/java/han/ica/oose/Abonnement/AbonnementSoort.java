package han.ica.oose.Abonnement;

/**
 * Created by Gebruiker on 18-10-2016.
 */
public enum AbonnementSoort {
    MAAND(1),
    HALFJAAR(2),
    JAAR(3);

    private final int value;

    private AbonnementSoort(final int value) {
        this.value = value;
    }

}
