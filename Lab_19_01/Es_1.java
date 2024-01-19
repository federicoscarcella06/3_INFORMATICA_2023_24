import java.util.*;
import java.io.*;

public class Es_1{
    public static void main(String[]args){
        String s,parola ="";
        int a,b;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("inserisci una parola");
        parola = inp.nextLine();
        
        do{
            System.out.println("inserisci a");
            a = inp.nextInt();
            
            System.out.println("inserisci b");
            b = inp.nextInt();
            
            if(a>parola.length() || b>parola.length() || a<0 || b<0 || a>b){
                System.out.println("ERRORE. assicurati di aver scritto  correttamente i numeri e la parola");
            
            }
        }while(a>parola.length() || b>parola.length() || a<0 || b<0 || a>b);
        
        s = parola.substring(a,b+1);
        
        System.out.println(s);        
    }
}