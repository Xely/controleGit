package entities;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User {
    public String nom;
    public String prenom;
    public String login;
    public String password;
    public ArrayList<Droit> droits;
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Droit> getDroits() {
        return droits;
    }

    public void setDroits(ArrayList<Droit> droits) {
        this.droits = droits;
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
        this.droits = new ArrayList<Droit>();
    }

    public User(String nom, String prenom, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> courses = new ArrayList<User>();
        try {
            ResultSet resultSet = MySQLAccess.getInstance().resultQuery(
                    "SELECT * FROM user;");
            while (resultSet.next()) {
                User course = new User(resultSet.getInt("id"),
                                       resultSet.getString("nom"),
                        resultSet.getString("prénom"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resulSet.get);
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return courses;
    }
}