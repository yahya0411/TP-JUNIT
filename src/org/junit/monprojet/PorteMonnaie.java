package org.junit.monprojet;

import java.util.HashMap;

public class PorteMonnaie {
    HashMap<String,Integer> contenu;
    public HashMap<String,Integer> getContenu(){
        return contenu;
    }
    public PorteMonnaie(){
        contenu = new HashMap<String,Integer>();
    }
    public void ajouterSomme(SommeArgent sa){

        if (contenu.containsKey(sa.getUnite()))
        {
            contenu.put(sa.getUnite(), contenu.get(sa.getUnite())  + sa.getQuantite());
        }


    }
}
