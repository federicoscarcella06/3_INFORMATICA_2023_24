
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es9{
    
    public static void main(String[]args){
        
        int v;

        v = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        
        if(v>6){
     
                System.out.println("il voto è sufficente");
                
                if(v>8){
                    System.out.println("il voto è più sufficente");
                }
        }
        
        else{
            
         System.out.println("il voto è negativo");
         
        }

        
    }
    

}


