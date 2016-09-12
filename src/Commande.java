import java.util.ArrayList;

/**
 * Created by yassirhessane on 18/08/16.
 */
public class Commande {

    protected ListeProduit listeProduit;
    protected EtatCommande etatCommande;

    public Commande() {
        this.listeProduit = new ListeProduit();
        this.etatCommande = new CommandeEnCours(this);
    }

    public void ajouteProduit(Produit produit)
    {
        this.etatCommande.ajouteProduit(produit);
    }

    public void retireProduit(Produit produit)
    {
        this.etatCommande.retireProduit(produit);
    }

    public void efface()
    {
        this.etatCommande.efface();
    }

    public void etatSuivant()
    {
        this.etatCommande = this.etatCommande.etatSuivant();
    }

    public ListeProduit getProduits()
    {
        return this.listeProduit;
    }

    public void affiche()
    {
        System.out.println("Contenu de la commande");
        for (Produit p: this.listeProduit.getListeProduits())
        {
            p.affiche();
        }
    }
}
