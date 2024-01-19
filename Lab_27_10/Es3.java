
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es3{
    
    public static void main(String[]args){
        
        double v1, v2;

        v1 = Double.parseDouble(JOptionPane.showInputDialog("inserisci primoil valore"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("inserisci secondo il valore"));
        
        if(v1 > v2){
            System.out.println(v1+"è maggiore di "+v2);
            
            
        }
        
        else{
            
         System.out.println(v2+"è maggiore di "+v1);
         
        }
        
        if(v1==v2){
            
            System.out.println(v2+"è uguale "+v1);
            
        }
    }
    

}
