import javax.swing.*;

public class Es_6_if {
    public static void main(String[] args) {

        int lato1, lato2, lato3;
        
        lato1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la lunghezza del primo lato:"));
        lato2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la lunghezza del secondo lato:"));
        lato3 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la lunghezza del terzo lato:"));

        // Verifica se i lati possono formare un triangolo
        
        if(lato1 + lato2 > lato3 && lato1 + lato3 > lato2 && lato2 + lato3 > lato1){
            
            // Verifica il tipo di triangolo
            
            if(lato1 == lato2 && lato2 == lato3) {
                System.out.println("Il triangolo è equilatero.");
                
            } else if(lato1 == lato2 || lato1 == lato3 || lato2 == lato3) {
                System.out.println("Il triangolo è isoscele.");
                
            }else{
                System.out.println("Il triangolo è scaleno.");
                
            }
            
        }else{
            // I lati non possono formare un triangolo
            
            System.out.println("I lati non possono formare un triangolo.");
            
        }
    }
}