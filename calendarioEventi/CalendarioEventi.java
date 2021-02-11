package calendarioEventi;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import calendarioEventi.*;

public class CalendarioEventi {

    public static void main(String[] args) {
      
      Scanner input= new Scanner(System.in);
        String risp = "";
        Calendario calendario = new Calendario();
        Eventi e;
        ArrayList <Eventi> calendarioProv = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH mm");
        LocalDateTime date = null;
        LocalDateTime it = LocalDateTime.now();
        boolean dataok = true;
/* calendario.inserisci(new Eventi("Musica","Italia",LocalDateTime.of(2020, Month.JULY, 01, 11,00),LocalDateTime.of(2020,Month.JULY, 05, 12,00)));
   calendario.inserisci(new Eventi("Cinema","Italia",LocalDateTime.of(2020, Month.AUGUST, 15, 10,00),LocalDateTime.of(2020,Month.AUGUST,17, 11,30)));
*/        
             try{       // creo un menù con exception 
        do{System.out.println("===================================================================");
           System.out.println(" ********** DATA E ORA CORRENTE: " + it + " **********");
           System.out.println("===================================================================");
           System.out.println();
           System.out.println("DIGITA 1 X INSERIRE UN EVENTO MANUALMENTE");
           System.out.println("DIGITA 2 X MOSTRARE EVENTI ESISTENTI"); 
           System.out.println("DIGITA 3 X MODIFICARE UN EVENTO");
           System.out.println("DIGITA 4 X RIMUOVERE UN EVENTO DAL NOME");
           System.out.println("DIGITA 5 X RIMUOVERE UN EVENTO X POSIZIONE");
           System.out.println("DIGITA 6 X VERIFICARE IMPEGNI X DATA");
         
           if(risp.equals("Y")|| risp.equals("y")||risp.equals("si")|| risp.equals("certo")||risp.equals("SI"));
          
           else if(risp.equals("N")|| risp.equals("no")|| risp.equals("fine"))break;
           
          
           int scelta = input.nextInt();
           input.nextLine();
        
        switch(scelta){
        
        case 1:                          //x inserire un evento
            e = new Eventi();
            System.out.println("DIGITA NOME DELL' EVENTO");
            e.setNome(input.nextLine());
            System.out.println("DIGITA LUOGO DELL' EVENTO");
            e.setLuogo(input.nextLine());
          try{
            System.out.println("DIGITA INIZIO FORMATO dd MM yyyy HH mm");
            formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH mm");
            e.setInizio(LocalDateTime.parse(input.nextLine(),formatter));
            System.out.println("DIGITA FINE FORMATO dd MM yyyy HH mm");
            formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH mm");
            e.setFine(LocalDateTime.parse(input.nextLine(),formatter)); 
          }catch(Exception ur){
            System.out.println("FORMATO DATA NON VALIDO "+ calendario.rimuovi(""));
            }
            System.out.println("L' EVENTO CHE HAI CREATO:");
            System.out.println(e);
            calendario.inserisci(e);
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine();
            System.out.println();
       
            break; 
            
        case 2:                              //x mostrare eventi esistenti
            
            System.out.println("EVENTI DA INSERIRE..... " + calendario.mostra());
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine();
            System.out.println();
            
            break; 
            
        
        case 3:                           //x modificare un evento
            e = new Eventi();
            System.out.println("MODIFICA EVENTO X NOME ");
            String nome = input.nextLine();
           // calendario.modifica(input.nextLine(),e);
            System.out.println("INSERISCI NUOVO NOME EVENTO");
            e.setNome(input.nextLine());
            System.out.println("INSERISCI NUOVO LUOGO ");
            e.setLuogo(input.nextLine());
          try{
            System.out.println("INSERISCI NUOVA DATA E ORA DI INIZIO EVENTO FORMATO dd MM yyyy HH mm");
            formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH mm");
            e.setInizio(LocalDateTime.parse(input.nextLine(),formatter));
            System.out.println("INSERISCI NUOVA DATA E ORA DI FINE EVENTO FORMATO dd MM yyyy HH mm");
            formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH mm");
            e.setFine(LocalDateTime.parse(input.nextLine(),formatter));
          }catch(Exception ur){
            System.out.println("FORMATO DATA NON VALIDO");
            }
            System.out.println("IL NUOVO EVENTO CHE HAI MODIFICATO: ");
            System.out.println(e);
            calendario.modifica(nome,e);
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine();
            System.out.println();
              
            break; 
         
        case 4:                           //x rimuovere un evento x nome
            
            System.out.println("RIMUOVI EVENTO X NOME ");
            calendario.rimuovi(input.nextLine());
            System.out.println("EVENTO CANCELLATO!! ");
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine(); 
            System.out.println();    
            
            break;      
        
        case 5:                           //x rimuovere un evento x posizione
            
            System.out.println("RIMUOVI UN EVENTO IN CALENDARIO X POSIZIONE PARTENDO DA 0 E NON DA 1 ");
            calendario.rimuoviP(input.nextInt());
            System.out.println("VUOI CONTINUARE?");
            input.nextLine();                  //Acquisisce la new line
            risp = input.nextLine();
            System.out.println();    
            
            break; 
            
        case 6:                    //x verificare se hai impegni o no in tale data e ora
            
            System.out.println("INSERISCI DATA E ORA X VERIFICARE SE HAI IMPEGNI FORMATO dd MM yyyy HH mm");
         try{   
            date = (LocalDateTime.parse(input.nextLine(),formatter)); 
            dataok = true;
         }catch (Exception ur){
            dataok = false;
            System.out.println("FORMATO DATA NON VALIDO!!");}
            if(date ==  null){System.out.println("DATA EVENTO NON TROVATI");}
            else {System.out.println(calendario.verifica(date));}
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine();
            System.out.println(); 
              
            break;
             
        default:
            
            System.out.println("SCELTA NON VALIDA DEVI INSERIRE UN NUMERO DA 1 A 6");
            System.out.println("VUOI CONTINUARE?");
            risp = input.nextLine();
            System.out.println();  
        }  
        
       }while(risp.equals("Y")|| risp.equals("y")||risp.equals("si")|| risp.equals("certo")|| risp.equals("SI"));
        
             }catch(Exception w){
                 
            System.out.println("******ATTENZIONE******");
            System.out.println();
            System.out.println("***HAI INSERITO UN CARATTERE CHE E' NON SUPPORTATO, INSERISCI UN NUMERO!!!***"); 
            System.out.println("****RICARICA IL PROGRAMMA!!!****"); 
             }
        
            System.out.println("FINE ESECUZIONE DEL PROGRAMMA ARRIVEDERCI");
            
             
    }
    
}
