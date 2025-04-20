package code.musculer.chaussureAPI.entite;


import jakarta.persistence.*;

@Entity
@Table(name = "CHAUSSURE")
public class Chaussure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marque;
    private String couleur;
    private Double prix;
    private Double taille;

    public Chaussure(int id, String marque, String couleur, Double prix, Double taille) {
        this.id = id;
        this.marque = marque;
        this.couleur = couleur;
        this.prix = prix;
        this.taille = taille;
    }

    public Chaussure() {
    }

    public int getId() {
        return id;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public Double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
