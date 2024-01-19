import javax.swing.*;
public class Es_3{
    public static void main(String[]args){
        int n;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("insersci un numero compreso tra 2 e 23"));
            if(n < 2 || n > 23){
                System.out.println("assicurati di aver scritto il numero correttamente come richiesto");
            }
        }while(n < 2 || n > 23);
        System.out.println("programma terminato");
    }
}