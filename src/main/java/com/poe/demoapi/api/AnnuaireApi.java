
package com.poe.demoapi.api;

import com.poe.demoapi.business.Annuaire;
import com.poe.demoapi.business.Personne;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/personnes")
public class AnnuaireApi {
    
 @GET()
 @Produces({MediaType.APPLICATION_JSON})
public ArrayList<Personne> getPersonnes(@Context HttpServletRequest request){
    
    
  Annuaire annuaire=(Annuaire)request.getSession().getAttribute("annuaire");{
   if(annuaire==null){
       annuaire= new Annuaire();
   } 
   return annuaire.getPersonnes();
} 
  
}     
      
  
    
    @POST()
    @Consumes({ MediaType.APPLICATION_JSON })
    public void postPersonne(Personne newPersonne, @Context HttpServletRequest request) {
        
        Annuaire annuaire = (Annuaire)request.getSession().getAttribute("annuaire");
        if(annuaire == null) {
            annuaire = new Annuaire();       
        }
        annuaire.addpersonne(newPersonne);
        request.getSession().setAttribute("annuaire", annuaire);
    }
}
