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

   public void setPrenom(String niveau) 
   {
        this.niveau = niveau;
   }

    public void setPrenom(String sévérité) 
    {
        this.sévérité = sévérité;
    }

    public void setPrenom(String nom) 
    {
        this.nom = nom;
    }

    public void setPrenom(String société) 
    {
        this.société = société;
    }
}