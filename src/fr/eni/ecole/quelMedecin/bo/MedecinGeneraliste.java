package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe Médecin Généraliste
 *
 * récupère les infos
 * <ol>
 *     <li>l'identité (nom, prenom, téléphone)</li>
 *     <li>le tarif de consultation</li>
 * </ol>
 * Puis permet de les afficher
 * @author Lucille Malozon
 * @date
 * @version
 */
public class MedecinGeneraliste {

    //########## ATTRIBUTS ##########
    //attributs d'instance nom, prenom, numTelephone
    private String nom;
    private String prenom;
    private String numeroDeTelephone;

    //attribut de classe tarif
    private static int tarif = 25;


    // ########## CONSTRUCTEURS ##########
    //constructeur avec paramètres nom, prenom, numTelephone
    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }


    // ########## GETTERS / SETTERS ##########
    //getter nom
    public String getNom() {
        return nom.toUpperCase();
    }

    //getters et setters numTelephone
    public String getNumeroDeTelephone() {

        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {

        this.numeroDeTelephone = numeroDeTelephone;
    }

    //getters et setters Tarif
    public static int getTarif() {
        return tarif;
    }

    public static void setTarif(int newTarif) {

        MedecinGeneraliste.tarif = newTarif;
    }


    // ########## METHODES ##########
    public void afficher() {
        System.out.printf("Médecin généraliste : %s, %s, %s %n Tarif de la consultation: %s %n",
                this.getNom(), this.prenom, this.getNumeroDeTelephone(), MedecinGeneraliste.getTarif());
    }
}