import javax.swing.*;

public class Es_2_if{
    public static void main(String[]args){
        
        int a, b, maggiore, minore;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("inserisci il primo valore"));
        b = Integer.parseInt(JOptionPane.showInputDialog("inserisci il secondo valore"));
        
        if (a > b) {
            maggiore = a;
            minore = b;
        } else {
            maggiore = b;
            minore = a;
        }
        if (maggiore % minore == 0) {
            System.out.println(maggiore + " è multiplo di " + minore);
        } else {
            System.out.println(maggiore + " non è multiplo di " + minore);
        }
    }
}