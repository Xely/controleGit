package entities;

import java.util.ArrayList;

public class Droit {
    public String niveau;
    public String s�v�rit�;
    public String nom;
    public String soci�t�;

    
    public String niveau() 
    {
        return niveau;
    }

    public String s�v�rit�() 
    {
        return s�v�rit�;
    }
    
    public String nom() 
    {
        return nom;
    }
    
   public String soci�t�() 
   {
        return soci�t�;
   }

   public void setNiveau(String niveau) 
   {
        this.niveau = niveau;
   }

    public void setS�v�rit�(String s�v�rit�) 
    {
        this.s�v�rit� = s�v�rit�;
    }

    public void setNom(String nom) 
    {
        this.nom = nom;
    }

    public void setSoci�t�(String soci�t�) 
    {
        this.soci�t� = soci�t�;
    }
    
    public Droit() {};
}