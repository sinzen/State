import java.util.ArrayList;

/**
 * Created by yassirhessane on 18/08/16.
 */
public class ListeProduit {

    protected ArrayList<Produit> produits;

    public ListeProduit() {
        this.produits = new ArrayList<>();
    }

    public void add(Produit produit)
    {
        this.produits.add(produit);
    }

    public void clear()
    {
        this.produits = new ArrayList<>();
    }

    public void remove(Produit produit)
    {
        for (Produit p : this.produits)
        {
            if(p.equals(produit))
            {
                this.produits.remove(p);
                break;
            }
        }
    }
    public ArrayList<Produit> getListeProduits()
    {
        return this.produits;
    }
}
