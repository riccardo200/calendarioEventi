package calendarioEventi;

import java.time.LocalDateTime;

public class Eventi extends Calendario {
    
  private String nome;
  private String luogo;
  private LocalDateTime inizio;
  private LocalDateTime fine;
  
  public Eventi(String nome, String luogo, LocalDateTime inizio, LocalDateTime fine){
  
      this.nome = nome; this.luogo = luogo; this.inizio = inizio; this.fine = fine;  
  }  
  
    public Eventi(){
    
       // this.nome=null; this.luogo=null; this.inizio = null; this.fine = null;
    
    }        //costruttore vuoto aggiunto xkè se no mi da errore nel main

    
    public void setNome(String nome){
    
    this.nome = nome;
    }
    
    public void setLuogo(String luogo){
    
    this.luogo = luogo;
    } 
    
    public void setInizio(LocalDateTime inizio){
    
    this.inizio = inizio;
    }
    
   public void setFine(LocalDateTime fine){
   
   this.fine = fine;
   } 
   
   public String getNome(){
   
   return this.nome;    
   }
   
   public String getLuogo(){
   
   return this.luogo;
   }
   
   public LocalDateTime getInizio(){
   
   return this.inizio;
   }
   
   public LocalDateTime getFine(){
   
   return this.fine;
   }
    
  @Override
  
    public String toString(){
    
    return " NOME EVENTO: " + nome + " LUOGO EVENTO: " + luogo + " DATA E ORA INIZIO: " + inizio + " DATA E ORA FINE: " + fine;
    
    }
     
    
}