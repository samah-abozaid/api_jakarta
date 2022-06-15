
package com.poe.demoapi.business;

import static java.lang.ModuleLayer.empty;
import java.util.ArrayList;
import java.util.Optional;


public class Annuaire {
    
   private ArrayList<Personne> personnes=new ArrayList<>();
   private long nextId=0;
   
   public void addpersonne(Personne newpersonne){
   
       newpersonne.setId(nextId);
       nextId++;
       personnes.add(newpersonne);
       
     }  
   
   public Optional< Personne> getpersonne(long id){
       for(Personne p: personnes){
           if(p.getId().equals(id))
               return Optional.of(p);
       }
      //on peut faire un retour e optional return new Personne();
      //maniere de retourner en cas au y'a pas d'objet
      //au lieu de null
      
      
       return  Optional.empty();
       }
       
   public void updatepersonne(Personne personne){
       for(Personne p: personnes){
           if(p.getId().equals(personne.getId())){
               personnes.remove(p);
               personnes.add(personne);
               
               
           }
       }
   }
   
   public void deletpersonne(long id){
      for(Personne p:personnes){
          if(p.getId().equals(id)){
              personnes.remove(p);
          }
      } 
       
   }
   
   
   
   
   
   
   

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }

    public long getNextId() {
        return nextId;
    }

    public void setNextId(long nextId) {
        this.nextId = nextId;
    }
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
