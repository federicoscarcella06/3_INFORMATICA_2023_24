
/**
 * esercizio 2
 * 
 * @author (federico scarcella) 
 * @version(26/01/2023)
 */

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Es_2{
    public static void main(String[]args){
        int l;
        double v[];
        double somma=0, media = 0, voto = 0, massimo, minimo;
        
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("inserisci un valore compreso tra 3 e 10");
            l = inp.nextInt();
        }while(l <3 || l > 10);
        v = new double[l];
        for(int i = 0; i<l; i++){
            voto = Double.parseDouble(JOptionPane.showInputDialog("inserisci il voto"));
            
            v[i] = voto;
            somma +=voto;
            media = somma / l;

        }
        
        massimo=v[0];
        
        for(int i=0; i<=v.length-1; i++) {
          if( v[i]>massimo ) {
            massimo=v[i];
          }
        }
        
        minimo = v[0];
        
        for(int i=0; i<=v.length-1; i++) {
          if( v[i]<minimo ) {
            minimo=v[i];
          }
        }
        System.out.println("la media di tutti i voti è "+media);
        System.out.println("Il voto massimo e' "+massimo);
        System.out.println("Il voto minimo e' "+minimo);
    }
}
