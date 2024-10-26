package org.junit.monprojet;

public class SommeArgent {

    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getUnite() {
        return unite;
    }
    public SommeArgent add(SommeArgent m) {
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }

    public boolean equals(Object anObject) {
        if(anObject instanceof SommeArgent) {
            if (((SommeArgent) anObject).quantite == quantite && ((SommeArgent) anObject).unite == unite) {
                return true;
            }
            return false;
        }
        return false;
    }
}
