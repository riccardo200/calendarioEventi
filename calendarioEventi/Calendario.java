package calendarioEventi;

import java.time.LocalDateTime;
import java.util.*;

public class Calendario {
    
  ArrayList <Eventi> calendario = new ArrayList<>(); //mi ha fatto usare il metodo Diamond
    
  
  public boolean inserisci(Eventi e){
  
    return calendario.add(e); 
  
  }
  
  public Eventi rimuoviP(int posizione){
  
    return calendario.remove(posizione);
  
  }
  
  public Eventi rimuovi(String nome){
      
     for(int i = 0; i<calendario.size();i++){
   
     if (calendario.get(i).getNome().equals(nome)){
   
     return calendario.remove(i);
   }
   
   }
  
     return null;  //return di emergenza
  
  }
  
  public Eventi modifica(String nome,Eventi e){  //x modificare l evento
  
    for(int y = 0;y<calendario.size();y++){
   
    if(calendario.get(y).getNome().equals(nome)){
   
    return calendario.set(y,e);    //y = posizione array, e = valore
       
   }
  
  }
     return null;
      
  }

  public ArrayList<Eventi> mostra(){     // , String nome){
      
    ArrayList<Eventi> a = new ArrayList<>();  
    
    for(int x = 0;x<calendario.size();x++){
        
  //  if(calendario.get(x).getNome().equals())    //nome))
        
      // a.add(calendario.get(x));    
    //a.add(calendario.get(x));    
        
   System.out.println("L' EVENTO E': " + calendario.get(x));
    
    }
    
    return a;              //e;
  

}
  
/* public Eventi modificaDate(LocalDateTime date) {
  
    for(int h = 0;h<calendario.size();h++){
    if(((calendario.get(h).getInizio()).compareTo(date)<0) && ((calendario.get(h).getFine()).compareTo(date).compareTo(date)>0)){
      
      return calendario.remove(h);
      
      }
          
      }
  
 return null;
}*/

  
    public ArrayList<?> verifica(LocalDateTime date){         //<Eventi> sostituito con la wild card ?
    ArrayList<Eventi> e =new ArrayList<>();

    for(int y=0;y<calendario.size(); y++){
    if (((calendario.get(y).getInizio()).compareTo (date)<=0)) //&& ((calendario.get(y).getFine()).compareTo(date)>=0)))

    e.add(calendario.get(y));}
    
    return e;
    }
  


}