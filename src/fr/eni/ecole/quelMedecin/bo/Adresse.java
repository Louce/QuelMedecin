package fr.eni.ecole.quelMedecin.bo;

import org.omg.CORBA.WStringSeqHelper;

public class Adresse {
    private String mentionsCompl;
    private int numero;
    private String complNumero;
    private String rue;
    private  int cp;
    private String ville;

    public Adresse(String mentionsCompl, int numero, String complNumero, String rue, int cp, String ville) {
        this.mentionsCompl = mentionsCompl;
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public Adresse(int numero, String complNumero, String rue, int cp, String ville) {
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public void afficher(){
        System.out.println(this.mentionsCompl != null ? this.mentionsCompl : "Aucune mention complémentaire");
        System.out.printf("%d %s %s %n" +
                "%05d %s %n",
                this.numero,
                this.complNumero,
                this.rue, this.cp, this.ville.toUpperCase());
    }
}
