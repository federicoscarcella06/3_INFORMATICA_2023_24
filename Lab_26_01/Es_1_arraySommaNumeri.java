
/**
 * esercizio 1
 * 
 * @author (federico scarcella) 
 * @version(26/01/2023)
 */

import java.util.*;
import java.io.*;

public class Es_1{
    public static void main(String[]args){
        int l,somma=0, sommaDispari = 0, sommaPari = 0;
        int v[];
        
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("inserisci un valore compreso tra 3 e 10");
            l = inp.nextInt();
        }while(l <3 || l > 10);
        v = new int[l];
        for(int i = 0; i<l; i++){
            System.out.println("inserisci il voto");
            v[i] = inp.nextInt();
            somma = somma + v[i];
            
            if(v[i]%2 == 0){
                sommaPari = sommaPari + v[i]; 
            }else sommaDispari = sommaDispari + v[i];
        }
        
        System.out.println("la somma di tutti i valori è "+somma);
        System.out.println("la somma di tutti i valori pari è "+sommaPari);
        System.out.println("la somma di tutti i valori dispari è "+sommaDispari);
    }
}
