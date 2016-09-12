/**
 * Created by yassirhessane on 18/08/16.
 */
abstract class EtatCommande {

    public Commande commande;

    public EtatCommande(Commande commande) {
        this.commande = commande;
    }

    public abstract void ajouteProduit(Produit produit);

    public abstract void efface();

    public abstract void retireProduit(Produit produit);

    public abstract EtatCommande etatSuivant();


}
