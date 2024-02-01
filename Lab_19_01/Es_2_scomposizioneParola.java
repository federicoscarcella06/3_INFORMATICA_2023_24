import java.util.*;
import java.io.*;

public class Es_2{
    public static void main(String[]args){
        String parola ="";
        int np,i=0;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("inserisci una parola da scomporre");
        parola = inp.nextLine();
        np = parola.length();
        for(i=0;i<np;i++){
            if(i>0){
                System.out.print("-");
            }
            System.out.print(parola.charAt(i));
        }   
    }
}
