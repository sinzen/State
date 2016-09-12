public class Main {

    public static void main(String[] args) {
        /* System.out.println("Hello World!"); */

        Commande commande = new Commande();
        commande.ajouteProduit(new Produit("véhicule 1"));
        commande.ajouteProduit(new Produit("Accessoire 2"));
        commande.affiche();
        commande.etatSuivant();
        commande.ajouteProduit(new Produit("Accessoire 3"));
        commande.efface();
        commande.affiche();
        Commande commande1 = new Commande();
        commande1.ajouteProduit(new Produit("véhicule 2"));
        commande1.ajouteProduit(new Produit("Accessoire 21"));
        commande1.affiche();
        commande1.etatSuivant();
        commande1.affiche();
        commande1.etatSuivant();
        commande1.efface();
        commande1.affiche();


    }
}
