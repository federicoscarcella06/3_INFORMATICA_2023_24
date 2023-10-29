import java.io.*;
import java.util.*;
import javax.swing.*;

//ALGORITMO POLDO

public class poldo{
    
    public static void main(String[]args){
        
        int risp, tot, quant, prez;
        
        Scanner inp=new Scanner(System.in);
        Scanner myObj=new Scanner(System.in);
        
        System.out.println("seleziona il numero del prodotto che vuoi comprare \n 1:panino salame \n 2:panino cotto \n 3:panino crudo \n 4:piadina");
        risp = inp.nextInt();
        
        do{
            switch(risp){
                case 1: System.out.print("quanti panini al salame vuoi?");
                    prez = 1;  
                    break;
                    
                case 2: System.out.print("quanti panini al cotto vuoi?");
                    prez = 2;
                    break;
                    
                case 3: System.out.print("quanti panini al crudo vuoi?");
                    prez = 2;
                    break;
                    
                case 4: System.out.print("quante piadine vuoi?");
                    prez = 3;
                    break;
                    
                default: System.out.print("hai sbagliato numero ricontrolla");
                    prez = 0;
                
            }
        }while(risp !=1 && risp !=2 && risp !=3 && risp!= 4);
        quant = inp.nextInt();
        tot = quant * prez;
        System.out.println("Il totale dell'ordine è di "+tot+"€");
        
        
    }
    
}