
import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo prodotto di tre valori dati dall'utente

public class Es1{
    
    public static void main(String[]args){
        
        int a;
        int b;
        int c;
        int r;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo valore"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo valore"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il terzo valore"));
        
        r = a * b * c;
        
        System.out.println("il prodotto tra i tuoi valori è: "+ r);
        
    }
    

}
