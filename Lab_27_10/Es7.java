
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area e circonferenza dato il raggio

public class Es7{
    
    public static void main(String[]args){
        
        int v1,v2,v3, r;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        v3 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il valore"));
        
        if(v1 >0 && v1+v2+v3 ==180 ){
     
                System.out.println("possono essere angoli di un triangolo");

        }
        
        else{
            
         System.out.println("non possono essere angoli di un triangolo");
         
        }
        
    }
    

}


