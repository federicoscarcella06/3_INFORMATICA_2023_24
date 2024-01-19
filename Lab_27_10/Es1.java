
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es1{
    
    public static void main(String[]args){
        
        double p, rag, per, c, a ;
        
        p= 3.14;

        rag = Double.parseDouble(JOptionPane.showInputDialog("inserisci il raggio"));
        
        if(rag > 0){
            
            c = rag*2*p ;
            a = p *rag*rag;
            
            System.out.println("la circonferenza è: "+ c + "\n");
            System.out.println("l'area è: "+ a);
            
        }
        
        else{
         System.out.println("scrivi un numero maggiore di 0!");
        }
        
    }
    

}


