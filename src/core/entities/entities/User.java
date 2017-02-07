package entities;

import java.util.ArrayList;

public class User {
    public String nom;
    public String prenom;
    public String login;
    public String password;
    public ArrayList<Droit> droits; 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User() {
        this.droits = new ArrayList<Droit>()
    }

    public void setDroits(ArrayList<Droit> droits) {
		this.droits = droits;
	}

	public User(String nom, String prenom, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }
    
}