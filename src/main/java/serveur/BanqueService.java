package serveur;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(name = "ServiceBanque")
public class BanqueService   {
    // Liste pour stocker les comptes
    List<Compte> comptes= new ArrayList<>();
    // Méthode de conversion de montant
@WebMethod(operationName = "Conversion")
    public double conversion(@WebParam(name = "val1") double montant) {
        return montant * 0.30;
    }
    // Méthode pour obtenir un compte par index
    @WebMethod(operationName = "Compte")
    public Compte getCompte(@WebParam(name = "val2") int index) {
        // Récupération du compte à l'index spécifié
        return comptes.get(index);
    }
    // Méthode pour obtenir la liste de tous les comptes
    public List<Compte> getComptes() {
    comptes.add(new Compte(1,5000, new Date()));
        comptes.add(new Compte(2,5000, new Date()));
        // Retourne la liste complète des comptes
        return comptes;
    }
}