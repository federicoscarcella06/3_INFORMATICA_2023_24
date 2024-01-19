
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es5{
    
    public static void main(String[]args){
        
        int v, r;

        v = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        
        if((v % 7)==1){
            System.out.println(v+" non è multiplo di 7 ");
                        
        }
        
        else{
            
         System.out.println(v+" è multiplo di 7");
         
        }
        
    }
    

}

