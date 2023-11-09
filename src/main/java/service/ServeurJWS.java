package service;
import jakarta.xml.ws.Endpoint;
import serveur.BanqueService;
public class ServeurJWS {
    public static void main(String[] args) {
        // Création d'une instance de BanqueService, qui implémente les opérations du service web
        BanqueService bs =new BanqueService();
        // Définition de l'URL d'exposition du service web
        String url= "http://localhost:8084/";
        // Publication du service web à l'URL spécifiée
        Endpoint.publish(url,bs);
        // Affichage d'un message indiquant que le service web a été déployé avec succès
        System.out.println("Web service deployé sur "+url);
    }
}
