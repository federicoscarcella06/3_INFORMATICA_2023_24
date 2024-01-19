import java.io.*;
import java.util.*;
import javax.swing.*;

//calcolo area triangolo equilatero 

public class Es2{
    
    public static void main(String[]args){
        
        int a;
        int r;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("inserisci il lato"));
        r = a * 3;
        
        System.out.println("il perimetro del triangolo equilatero è: "+ r);
        
    }
    

}
