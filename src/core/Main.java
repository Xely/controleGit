

import java.util.ArrayList;

import entities.Droit;
import entities.User;

public class Main {

    public static void main(String[] args) {
    	
    	User user = new User("Geoffrey","Fabbro","Ziguard","Ziguard");
    	User user1 = new User("Julien","guyader","Xelty","Xelty");
    	
    	
    	Droit droit = new Droit ();
    	Droit droit1 = new Droit ();
    	
    	
    	Droit droit3 = new Droit ();
    	Droit droit4 = new Droit ();
    	
    	
    	ArrayList<Droit> listeDroitUser1 = new ArrayList<Droit>();
    	ArrayList<Droit> listeDroitUser = new ArrayList<Droit>();
    	
    	listeDroitUser.add(droit);
    	listeDroitUser.add(droit1);
    	listeDroitUser1.add(droit4);
    	listeDroitUser1.add(droit3);
    	
    	user.setDroits(listeDroitUser);
    	user1.setDroits(listeDroitUser1);
    	
    }
}

