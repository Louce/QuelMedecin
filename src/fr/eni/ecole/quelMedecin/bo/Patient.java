package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient {
    //########## ATTRIBUTS ##########
    //attributs d'instance nom, prenom, numTelephone, sexe (F ou M), num secu, date naissance, commentaires
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numSecu;
    private LocalDate dateDeNaissance;
    private String commentaires;


    // ########## CONSTRUCTEURS ##########
    //constructeur avec paramètres
    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale, LocalDate dateNaissance, String commentaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numSecu = numeroSecuriteSociale;
        this.dateDeNaissance = dateNaissance;
        this.commentaires = commentaires;
    }


    // ########## METHODES ##########
    public void afficher() {
        /*première solution pour ne pas afficher "null" si pas de commentaire
        if (this.commentaires == null){
            "[Aucun commentaire]";
        } else {
            this.commentaires;
        }*/
        //ou utiliser une ternaire qui remplace le this.commentaire dans le souf)
        System.out.printf("%s %s %n Téléphone: %s %n" +
                "Sexe: %s %n" +
                "Numéro de sécurité sociale: %d%n" +
                "Date de naissance: %s%n" +
                "Commentaires: %s%n",
                this.nom.toUpperCase(),
                this.prenom,
                this.numeroDeTelephone,
                this.sexe == 'F' ? "Féminin" : "Masculin",
                this.numSecu,
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires == null ? "[Aucun commentaire]" : this.commentaires);
    }
}
