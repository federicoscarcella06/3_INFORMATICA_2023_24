import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo del totale dei seconi presente in ore, minuti, seconi

public class Es4{
    
    public static void main(String[]args){
        
        int a;
        int b;
        int c;
        int r;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci le ore"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci i minuti"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Inserisci i secondi"));
        
        r = a*3600 + b*60 + c;
        
        System.out.println("i secondi totali sono: "+ r);
        
    }
    

}
