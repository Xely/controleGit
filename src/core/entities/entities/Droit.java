package entities;

import java.util.ArrayList;

public class Droit {
    public String niveau;
    public String sévérité;
    public String nom;
    public String société;

    
    public String niveau() 
    {
        return niveau;
    }

    public String sévérité() 
    {
        return sévérité;
    }
    
    public String nom() 
    {
        return nom;
    }
    
   public String société() 
   {
        return société;
   }

   public void setNiveau(String niveau) 
   {
        this.niveau = niveau;
   }

    public void setSévérité(String sévérité) 
    {
        this.sévérité = sévérité;
    }

    public void setNom(String nom) 
    {
        this.nom = nom;
    }

    public void setSociété(String société) 
    {
        this.société = société;
    }
    
    public Droit() {};
}