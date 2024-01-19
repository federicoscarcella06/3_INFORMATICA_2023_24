
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es8{
    
    public static void main(String[]args){
        
        int v;

        v = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        
        if(v>0 ){
     
                System.out.println("il valore è positivo");

        }
        
        else{
            
         System.out.println("il valore è nullo");
         
        }
                if(v<0 ){
     
                System.out.println("il valore è negativo");

        }
        
    }
    

}


