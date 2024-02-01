/**
 * estrae il dominio da una mail
 * 
 * @author (Federico scarcella) 
 * @version (01/02/24)
 */
import java.util.*;
import java.util.*;

public class Es_6 {
    public static void main(String[] args) {
        String mail = "", dominio = "";
        int posLet = -1;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("digita stop per terminare il programma");
        
        do{
            System.out.println("Inserisci la tua mail per l'estrazione del dominio:");
            mail = inp.nextLine();

    
            posLet = mail.indexOf("@");
    
            if(posLet != -1 && !mail.equalsIgnoreCase("stop")) {
    
                dominio = mail.substring(posLet + 1);
    
                System.out.println("Il dominio della mail è: " + dominio);
            }else if(posLet != -1){
                System.out.println("la mail inserita non è valida");
            }
            
            if(!mail.equalsIgnoreCase("stop")){
                mail ="";
            }else{
                posLet = -1;
                dominio = "";
                System.out.println("programma terminato");
            }
            
        }while(!mail.equalsIgnoreCase("stop"));
    }
}

