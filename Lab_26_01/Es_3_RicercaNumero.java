
/**
 * esercizio 3 ricerca del numero intero in un vettore
 * 
 * @author (federico scarcella) 
 * @version (26/01/23)
 */

import java.util.*;
import java.io.*;

public class Es_3{
    public static void main(String[]args){
        int l,n,nv = 0;
        int k[];
        
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("inserisci un valore compreso tra 3 e 10");
            l = inp.nextInt();
        }while(l <3 || l > 10); 
        
        k = new int[l];     
        
        for(int i = 0; i<l; i++){
            System.out.println("inserisci un numero");
            k[i] = inp.nextInt();
        }
        System.out.println("inserire il numero per verificarne la presenza nell'elenco ");
        n = inp.nextInt();
        
        for(int i = 0; i<l;i++){
            if(k[i] == n){
                nv++;
            }
        }
        System.out.println("il numero "+n+" è presente "+nv+" volte/a nell'elenco ");
    }
}
