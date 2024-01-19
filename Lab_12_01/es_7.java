import java.io.*;
import java.util.*;
import javax.swing.*;

public class es_7 {
    public static void main(String[] args) {
        String a = "";

        do {
            a = JOptionPane.showInputDialog("Scrivi si o no");
            
        } while(!a.equals("si") && !a.equals("no"));

        if(a.equals("si")){
            System.out.println("Ok, hai digitato si");
        }
        
        if(a.equals("no")){
            System.out.println("Ok, hai digitato no");
        }  
    }
}
