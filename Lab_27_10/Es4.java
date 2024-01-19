
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es4{
    
    public static void main(String[]args){
        
        int v, r;

        v = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        
        if((v % 2)==1){
            System.out.println(v+" dispari ");
                        
        }
        
        else{
            
         System.out.println(v+" è pari");
         
        }
        
    }
    

}

