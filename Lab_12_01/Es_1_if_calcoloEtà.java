import javax.swing.*;

public class Es_1_if{
    public static void main(String[]args){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("inserisci la tua età"));
        if(a < 0 || a > 120){
            System.out.println("ERRORE");
        }
        if(a >= 18 && a <= 120){
            System.out.println("Sei maggiorenne");   
        }
        if(a < 18 && a >= 0){
            System.out.println("Sei minorenne");
        }
    }
}
