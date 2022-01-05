package RevisionDevoir;

import java.util.Map;
import java.util.TreeMap;

public class Annuaire {
    TreeMap<String, String> contacts;
    Annuaire(){contacts = new TreeMap<String, String>();}
    Annuaire(TreeMap<String, String> c) { contacts = c;}


    public String getNuméro(String nom) {
        return contacts.get(nom);
    }
    public void ajouterNuméro(String nom, String num) {
        contacts.put(nom, num);
    }
    public void affiche() {
        for (Map.Entry<String, String> m: contacts.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
