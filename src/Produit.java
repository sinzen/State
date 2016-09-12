/**
 * Created by yassirhessane on 18/08/16.
 */
public class Produit {

    protected String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    public void affiche()
    {
        System.out.println("Produit : "+this.nom);
    }
}
