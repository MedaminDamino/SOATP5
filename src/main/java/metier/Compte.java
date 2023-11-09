package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    // Attributs représentant les propriétés d'un compte
    private int code;
    private int solde;
    // L'annotation XmlTransient indique que
    // cette propriété ne doit pas être incluse dans la représentation XML
    @XmlTransient
    private Date dateCreation;
    // Constructeur pour initialiser les propriétés du compte
    public Compte(int code, int solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;}
    // Constructeur par défaut nécessaire pour la sérialisation/désérialisation XML
    public Compte() {}
    // Méthodes d'accès aux propriétés du compte
    public int getCode() {
        return this.code;
    }

    public int getSolde() {
        return this.solde;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }
    // Méthodes de modification des propriétés du compte
    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}