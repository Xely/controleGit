import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import entities.Droit;
import entities.User;
import org.codehaus.jackson.map.ObjectMapper;

public class Main {

    public static void main(String[] args) {
    	
    	User user = new User("Geoffrey","Fabbro","Ziguard","Ziguard");
    	User user1 = new User("Julien","","Xelty","Xelty");
    	
    	
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

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(user);
        objects.add(user1);
        objects.add(droit);
        objects.add(droit1);
        objects.add(droit3);
        objects.add(droit4);

        try {
            mapper.writeValue(new File("controleJson.json"), objects);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Configuration configuration = mapper.readValue(new File("conf.prog"), Configuration.class);
            System.out.println(configuration.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
}
